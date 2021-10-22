package domain.problemas;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class TipoProblema {
    private String nombre;
    private List<Problema> problemas;

    public void addProblemas(Problema ... problemas){
        Collections.addAll(this.problemas, problemas);
    }
}
