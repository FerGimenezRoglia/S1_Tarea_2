package NIvel_2.Ejercicio_1.Modulos;

import NIvel_2.Ejercicio_1.Excepciones.InvalidBooleanException;
import NIvel_2.Ejercicio_1.Excepciones.InvalidCharacterException;
import NIvel_2.Ejercicio_1.Excepciones.InvalidStringException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);

    public static byte leerByte(String message) {
        boolean isValid = false;
        byte readData = 0;

        while (!isValid) {
            System.out.println(message);
            try {
                readData = scanner.nextByte();
                System.out.println("Your age: " + readData);
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: You did not enter a valid number..");
                scanner.nextLine();
            }
        }
        return readData;
    }

    public static int leerInt(String message) {
        boolean isValid = false;
        int readData = 0;

        while (!isValid) {
            System.out.println(message);
            try {
                readData = scanner.nextInt();
                System.out.println("Number entered: " + readData);
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: You did not enter a valid number..");
                scanner.nextLine();
            }
        }

        return readData;
    }

    public static float leerFloat(String message) {
        boolean isValid = false;
        float readData = 0;

        while (!isValid) {
            System.out.println(message);
            try {
                readData = scanner.nextFloat();
                System.out.println("Decimal number : " + readData);
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error..");
                scanner.nextLine();
            }
        }
        return readData;
    }

    public static double leerDouble(String message) throws InputMismatchException {
        boolean isValid = false;
        double readData = 0;

        while (!isValid) {
            System.out.println(message);
            try {
                readData = scanner.nextFloat();
                System.out.println("large decimal number : " + readData);
                scanner.nextLine();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Format errors..");
                scanner.nextLine();
            }
        }
        return readData;
    }

    public static char leerChar(String message) throws InvalidCharacterException {

        System.out.println(message);
        String character = scanner.nextLine();

        if (character.length() == 1) {
            System.out.println("Character: " + character.charAt(0));
        } else {
            throw new InvalidCharacterException("Error: You must enter a single character.");
        }
        return character.charAt(0);
    }

    public static String leerString(String message) throws InvalidStringException {

        String readInput = "";

        System.out.println(message);
        readInput = scanner.nextLine();

        if (readInput.length() >= 3) {
            System.out.println("Your username: " + readInput);

        } else {
            throw new InvalidStringException("Error: Name must be at least 3 characters.");
        }
        return readInput;
    }

    public static boolean leerBoolean(String message) throws InvalidBooleanException {
        Boolean isValidBoolean = true;

        System.out.println(message + " y/n");
        String input = scanner.nextLine().toLowerCase();

        if(input.equals("y") || input.equals("n")){
            if (input.equals("s")){
                isValidBoolean = true;
            }
            if (input.equals("n")){
                isValidBoolean = false;
            }
        }else{
            throw new InvalidBooleanException("Error: You must enter 'y' or 'n'.");
        }
        return isValidBoolean;
    }
}
