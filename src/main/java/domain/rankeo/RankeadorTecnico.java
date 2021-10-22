package domain.rankeo;

import domain.rankeo.criterios.CriterioRankeadorTecnico;
import domain.personas.Tecnico;

import java.util.List;

public class RankeadorTecnico {
    private CriterioRankeadorTecnico criterio;

    public Tecnico elegirTecnico(List<Tecnico> tecnicos){
        return this.criterio.obtenerTecnico(tecnicos);
    }

}
