package domain.notificador;

import domain.notificador.medios.MedioDeNotificacion;

public class Notificador {
    private MedioDeNotificacion medioDeNotificacion;

    public void enviar(Notificacion notificacion){
        this.medioDeNotificacion.enviar(notificacion);
    }

    public void setMedioDeNotificacion(MedioDeNotificacion medioDeNotificacion) {
        this.medioDeNotificacion = medioDeNotificacion;
    }
}
