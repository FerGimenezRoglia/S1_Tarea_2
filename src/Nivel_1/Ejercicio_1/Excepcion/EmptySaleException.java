package Nivel_1.Ejercicio_1.Excepcion;

public class EmptySaleException extends Exception {

    public EmptySaleException(String message) {
        super("\nTo make a sale, you must first add products.");
    }
}
