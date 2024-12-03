package NIvel_2.Ejercicio_1.modulo;

import NIvel_2.Ejercicio_1.excepcion.InvalidBooleanException;
import NIvel_2.Ejercicio_1.excepcion.InvalidCharacterException;
import NIvel_2.Ejercicio_1.excepcion.InvalidStringException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        boolean isValid = false;
        byte readData = 0;

        while (!isValid) {
            System.out.println(message);
            try {
                readData = scanner.nextByte();
                System.out.println("Number byte: " + readData);
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: You did not enter a valid number..");
                scanner.nextLine();
            }
        }
        return readData;
    }

    public static int readInt(String message) {
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

    public static float readFloat(String message) {
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

    public static double readDouble(String message) throws InputMismatchException {
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

    public static void getChar() {

        boolean isValidChar = false;

        while (!isValidChar) {
            try {
                Input.readChar("Enter a character: ");
                isValidChar = true;
            } catch (InvalidCharacterException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static char readChar(String message) throws InvalidCharacterException {

        System.out.println(message);
        String character = scanner.nextLine();

        if (character.length() == 1) {
            System.out.println("Character: " + character.charAt(0));
        } else {
            throw new InvalidCharacterException("Error: You must enter a single character.");
        }

        return character.charAt(0);
    }

    public static void getString() {

        boolean isValidString = false;

        while (!isValidString) {
            try {
                String userName = readString("Enter a username with at least 3 characters:");
                isValidString = true;
            } catch (InvalidStringException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String readString(String message) throws InvalidStringException {

        System.out.println(message);
        String readInput = scanner.nextLine();

        if (readInput.length() >= 3) {
            System.out.println("Your username: " + readInput);

        } else {
            throw new InvalidStringException("Error: Name must be at least 3 characters.");
        }
        return readInput;
    }

    public static void getBoolean() {

        boolean isValidBoolean = false;
        while (!isValidBoolean) {
            try {
                boolean response = Input.readBoolean("Do you want to continue?");
                System.out.println("Response: " + (response ? "Yes" : "No"));
                isValidBoolean = true;
            } catch (InvalidBooleanException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static boolean readBoolean(String message) throws InvalidBooleanException {
        Boolean isValidBoolean = false;

        System.out.println(message + " y/n");
        String input = scanner.nextLine().toLowerCase();

        if (input.equals("y") || input.equals("n")) {
            if (input.equals("y")) {
                isValidBoolean = true;
            }
            if (input.equals("n")) {
                isValidBoolean = false;
            }
        } else {
            throw new InvalidBooleanException("Error: You must enter 'y' or 'n'.");
        }

        return isValidBoolean;
    }

}
