package domain.notificador.medios;

import domain.notificador.Notificacion;

public interface MedioDeNotificacion {
    public void enviar(Notificacion notificacion);
}
