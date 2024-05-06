package Exceptions;

public class ErrorMonedaSeleccionadaException extends RuntimeException {
    private String mensaje;
    public ErrorMonedaSeleccionadaException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
