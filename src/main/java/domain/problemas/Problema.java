package domain.problemas;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Setter
@Getter
public class Problema {
    private String descripcion, nombre;
    private List<Especialidad> especialidadesQueResuelven;
    private Double tiempoEstimadoResolucion;

    public Problema(){
        this.especialidadesQueResuelven = new ArrayList<>();
    }

    public void agregarEspecialidades(Especialidad ... especialidades){
        Collections.addAll(this.especialidadesQueResuelven, especialidades);
    }
}
