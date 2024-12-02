package NIvel_2.Ejercicio_1;

import NIvel_2.Ejercicio_1.Excepciones.InvalidBooleanException;
import NIvel_2.Ejercicio_1.Excepciones.InvalidCharacterException;
import NIvel_2.Ejercicio_1.Excepciones.InvalidStringException;

import java.util.Scanner;

import static NIvel_2.Ejercicio_1.Modulos.Input.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte youAge = leerByte("Enter your age: ");

        int age = leerInt("Enter the year you were born: ");

        float decimalNumber = leerFloat("Enter a decimal number: ");

        double decimalLargeNumber = leerDouble("Enter a large decimal number (ej: 123456.78): ");

        boolean isValidChar = false;

        // Leer char_________________________________________________________________________
        while (!isValidChar) {
            try {
                char Character = leerChar("Enter a character: ");
                isValidChar = true;
            } catch (InvalidCharacterException e) {
                System.out.println(e.getMessage());
                //System.out.println("Error of this type: " + e.getClass().getName());
            }
        }
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
