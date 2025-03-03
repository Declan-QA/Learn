// import java.util.Scanner;

// import JavaChallenges.*;
// import Utils.Inputtools;
import Utils.Stringtools;
public class Main {
    public static void main(String[] args) {
        String sentence = "Best the is Codecademy!";
        final String[] sentence_arr = Stringtools.splitSentence(sentence," ");
        int index  = sentence_arr.length-1;
        StringBuilder output = new StringBuilder("");
        while (index >0){
            output.append(sentence_arr[index]).append(" ");
            index--;
        };
        output.append(sentence_arr[0]);
        System.out.println(output);
        // Scanner input_reader = new Scanner(System.in);
        // final String sentence= Inputtools.getString(input_reader,"Enter your sentence below:\n");
        // final int search_index = Inputtools.getInt(input_reader, "Enter the position of the word you want: ");
        // input_reader.close();
        // final String reversed = Answers.Reverse_Sentence(sentence);
        // final String lastWord = Answers.Find_index_Sentence(sentence);
        // final String search_word = Answers.Find_index_Sentence(sentence,search_index-1);
        // System.out.printf("The penultimate word in the sentence is \"%s\"\n", lastWord); 
        // System.out.printf("The word at position %d in the sentence is \"%s\"\n", search_index,search_word);
        // System.out.printf("The sentence reversed is \"%s\"", reversed); 
    }
}
//buffalo