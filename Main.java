import java.util.Scanner;

import JavaChallenges.*;
import Utils.Inputtools;
public class Main {
    public static void main(String[] args) {
        Scanner input_reader = new Scanner(System.in);
        final String sentence= Inputtools.getString(input_reader,"Enter your sentence Below:\n");
        input_reader.close();
        final String output = Answers.Reverse_Sentence(sentence);
        System.out.printf("The reversed sentence as a whole: %s", output); 
    }
}
