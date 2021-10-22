package domain.personas;

import domain.problemas.Especialidad;
import domain.problemas.Problema;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TecnicoTest {

    @Test
    public void tecnicoNoDisponible(){
        Tecnico juan = new Tecnico();

        juan.setDisponible(false);

        Assert.assertEquals(false,juan.estasDisnonible());
    }



    @Test
    public void tecnicoResuelveProblema(){

        Especialidad redes = new Especialidad();
        redes.setName("name");

        Especialidad soporteWindows = new Especialidad();
        soporteWindows.setName("soporte windows");

        Especialidad soporteExcel = new Especialidad();
        soporteWindows.setName("soporte excel");

        Tecnico juan = new Tecnico();
        juan.agregarEspecialidades(redes, soporteWindows);

        Problema problemon = new Problema();
        problemon.agregarEspecialidades(redes, soporteExcel);


        Assert.assertEquals(true, juan.resolvesProblema(problemon));
    }

    @Test
    public void problemaTieneEspecialidadQueNoTieneTecnico(){

        Especialidad redes = new Especialidad();

        Especialidad soporteWindows = new Especialidad();

        Tecnico martin = new Tecnico();
        martin.agregarEspecialidades(soporteWindows);

        Problema problemonDesconocido = new Problema();
        problemonDesconocido.agregarEspecialidades(redes);

        Assert.assertEquals(false, martin.resolvesProblema(problemonDesconocido));
    }



}
