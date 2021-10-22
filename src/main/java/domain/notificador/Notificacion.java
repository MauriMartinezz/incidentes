package domain.notificador;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Notificacion {
    private String emailDestinatario, emailRemitente, mensaje, nroDestinatario, nroRemitente;
}
