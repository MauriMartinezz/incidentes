package domain.servicio;

import domain.problemas.TipoProblema;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Getter
@Setter
public class Servicio {
    private String nombre;
    private List<TipoProblema> tiposDeProblema;

    public Servicio() {
        this.tiposDeProblema = new ArrayList<TipoProblema>();
    }

    public void addTiposDeProblema(TipoProblema ... tiposDeProblema){
        Collections.addAll(this.tiposDeProblema, tiposDeProblema);
    }
}
