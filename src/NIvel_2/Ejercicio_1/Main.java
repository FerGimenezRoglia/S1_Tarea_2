package NIvel_2.Ejercicio_1;

import NIvel_2.Ejercicio_1.excepcion.InvalidBooleanException;
import NIvel_2.Ejercicio_1.excepcion.InvalidCharacterException;
import NIvel_2.Ejercicio_1.excepcion.InvalidStringException;

import java.util.Scanner;

import static NIvel_2.Ejercicio_1.modulo.Input.*;

public class Main {
    public static void main(String[] args) throws InvalidCharacterException {

        Scanner sc = new Scanner(System.in);

        byte youAge = leerByte("Enter your age: ");

        int age = leerInt("Enter the year you were born: ");

        float decimalNumber = leerFloat("Enter a decimal number: ");

        double decimalLargeNumber = leerDouble("Enter a large decimal number (ej: 123456.78): ");

        boolean isValidChar = false;

        char Character = leerChar("Enter a character: ");


        //Leer String_________________________________________________________________________
        boolean isValidString = false;
        while (!isValidString) {
            try {
                String userName = leerString("Enter a username with at least 3 characters:");
                isValidString = true;
            } catch (InvalidStringException e) {
                System.out.println(e.getMessage());
            }
        }

        //Leer String_________________________________________________________________________
        boolean isValidBoolean = false;
        while (!isValidBoolean) {
            try {
                boolean response = leerBoolean("Do you want to continue?");
                System.out.println("Response: " + (response ? "Yes" : "No"));
                isValidBoolean = true;
            } catch (InvalidBooleanException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
