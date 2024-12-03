package NIvel_2.Ejercicio_1;

import NIvel_2.Ejercicio_1.excepcion.InvalidBooleanException;
import NIvel_2.Ejercicio_1.excepcion.InvalidCharacterException;
import NIvel_2.Ejercicio_1.excepcion.InvalidStringException;

import java.util.Scanner;

import static NIvel_2.Ejercicio_1.modulo.Input.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte youAge = readByte("Enter your age: ");
        int age = readInt("Enter the year you were born: ");
        float decimalNumber = readFloat("Enter a decimal number: ");
        double decimalLargeNumber = readDouble("Enter a large decimal number (ej: 123456.78): ");

        getChar();
        getBoolean();
        getString();

    }
}
