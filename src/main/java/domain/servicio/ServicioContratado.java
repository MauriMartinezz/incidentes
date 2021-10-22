package domain.servicio;

import domain.personas.Cliente;
import domain.problemas.TipoProblema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ServicioContratado {
    private Cliente cliente;
    private LocalDate fechaAlta;
    private Servicio servicio;
}
