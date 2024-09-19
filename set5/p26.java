import java.io.*;
public class p26 {
// Custom checked exception
class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

// Custom unchecked exception
class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message) {
        super(message);
    }
}

public class ExceptionTypesExample {
    // Method that throws a checked exception
    public static void checkedExceptionMethod() throws CustomCheckedException {
        throw new CustomCheckedException("This is a custom checked exception.");
    }

    // Method that throws an unchecked exception
    public static void uncheckedExceptionMethod() {
        throw new CustomUncheckedException("This is a custom unchecked exception.");
    }

    public static void main(String[] args) {
        // Handling checked exception
        try {
            checkedExceptionMethod();
        } catch (CustomCheckedException e) {
            System.out.println("Caught a checked exception: " + e.getMessage());
        }

        // Handling unchecked exception
        try {
            uncheckedExceptionMethod();
        } catch (CustomUncheckedException e) {
            System.out.println("Caught an unchecked exception: " + e.getMessage());
        }

        // Examples of built-in checked exceptions
        try {
            FileReader file = new FileReader("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Caught a checked exception: " + e.getMessage());
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Caught a checked exception: " + e.getMessage());
        }

        // Examples of built-in unchecked exceptions
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an unchecked exception: " + e.getMessage());
        }

        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("Caught an unchecked exception: " + e.getMessage());
        }
    }
}

}
