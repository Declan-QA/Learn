package Utils;
import java.util.Scanner;

public class Inputtools {
    public static String getString(Scanner inputHandler,String prompt){
        System.out.printf("%s",prompt);
        return inputHandler.nextLine();
    }

    public static int getInt(Scanner inputHandler,String prompt){
        System.out.printf("%s",prompt);
        int value = inputHandler.nextInt();
        inputHandler.nextLine();
        return value;
    }

    
}