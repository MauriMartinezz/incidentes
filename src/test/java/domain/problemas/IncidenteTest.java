package domain.problemas;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class IncidenteTest {

    @Test
    public void noselahora(){
        System.out.println(LocalDateTime.now().plusHours(48).toLocalDate());
    }

    @Test
    public void incidenteSeResuelveEn2Dias(){
        Incidente incidente = new Incidente();
        Problema problemon = new Problema();

        problemon.setTiempoEstimadoResolucion(48.00);

        incidente.setFechaAlta(LocalDateTime.now());
        incidente.fechaEstimadaResolucion(incidente.getFechaAlta(), problemon);

        Assert.assertEquals(LocalDate.parse("2021-10-24"), incidente.getFechaCierre());

    }
}
