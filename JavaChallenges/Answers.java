package JavaChallenges;

import Utils.Stringtools;

public class Answers {
    public static String Reverse_Sentence(String input_sentence){
        final String[] sentence_arr = Stringtools.splitSentence(input_sentence);
        int index  = sentence_arr.length-1;
        StringBuilder output = new StringBuilder("");
        while (index >0){
            output.append(sentence_arr[index]).append(" ");
            index--;
        };
        output.append(sentence_arr[0]);
        return output.toString();
    }

    public static String Find_index_Sentence(String input_sentence,int index){
        final String[] sentence_arr = Stringtools.splitSentence(input_sentence);
        if (index == -1)
            return sentence_arr[sentence_arr.length-1];
    
        return sentence_arr[index];
    }

    public static String Find_index_Sentence(String input_sentence){
        return Find_index_Sentence(input_sentence, -1);
    }




}
