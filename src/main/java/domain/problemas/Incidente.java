package domain.problemas;

import domain.notificador.Notificacion;
import domain.notificador.Notificador;
import domain.personas.Tecnico;
import domain.servicio.ServicioContratado;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
public class Incidente {
    private String descripcion;
    private List<EstadoIncidente> estados;
    private LocalDateTime fechaAlta;
    private LocalDate fechaCierre;
    private Problema problema;
    private ServicioContratado servicioContratado;
    private Tecnico tecnico;

    public void confirmarse( Tecnico tecnico){
        if(tecnico.resolvesProblema(this.problema) && tecnico.estasDisnonible()){
            this.fechaAlta = LocalDateTime.now();
            fechaEstimadaResolucion(this.fechaAlta, this.problema);

            Notificador notificador = new Notificador();
            Notificacion notificacion = new Notificacion();

            notificacion.setNroDestinatario(tecnico.getNumeroCompleto());
            notificacion.setMensaje(this.problema.getDescripcion());

            notificador.enviar(notificacion);
        }
    }

    public LocalDate fechaEstimadaResolucion(LocalDateTime fechaAlta, Problema problema){
        return this.fechaCierre = fechaAlta.plusHours(problema.getTiempoEstimadoResolucion().longValue()).toLocalDate();
    }
}
