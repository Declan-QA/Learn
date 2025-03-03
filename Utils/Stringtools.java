package Utils;

public class Stringtools {
    public static String[] splitSentence(String inputsentence,String splitPattern){ 
        return inputsentence.split(splitPattern);
    }

    public static String[] splitSentence(String inputsentence){
        return splitSentence(inputsentence," ");
    }
    

}
