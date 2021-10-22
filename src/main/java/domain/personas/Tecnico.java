package domain.personas;

import domain.notificador.medios.MedioDeNotificacion;
import domain.problemas.Especialidad;
import domain.problemas.Problema;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class Tecnico {
    private String apellido, email, nombre, numeroCompleto;
    private List<Especialidad> especialidades;
    private Boolean disponible;
    private MedioDeNotificacion metodoDeContacto;

    public Tecnico() {
        this.especialidades = new ArrayList<>();
    }

    public Boolean estasDisnonible(){
        return this.disponible;
    }

    public Boolean resolvesProblema(Problema problema){

    return
            this.especialidades.stream()
                    .anyMatch(x-> problema.getEspecialidadesQueResuelven().contains(x));
    }

    public void agregarEspecialidades(Especialidad ... especialidades) {
        Collections.addAll(this.especialidades, especialidades);
    }
}
