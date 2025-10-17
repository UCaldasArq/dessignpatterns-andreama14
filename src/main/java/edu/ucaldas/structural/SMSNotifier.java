package edu.ucaldas.structural;

public class SMSNotifier extends NotifierDecorator {

    public SMSNotifier(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public String send(String message) {
        // Llama al notificador anterior (por ejemplo, EmailNotifier)
        String resultado = super.send(message);
        // Añade el comportamiento adicional del SMS
        return "SMS enviado: " + message + " | " + resultado;
    }
}
