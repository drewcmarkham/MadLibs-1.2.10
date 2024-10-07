import java.util.Scanner;
// create madlib class
public class Madlibs {
    
    public static void main(String[] args) //create main method
    {
        //create madlibs strings
        String madlib = "I went to the animal <noun>, the <plural noun> and the <number> beasts were there.";
        //madlib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        //madlib = "There was a time when <plural noun> would roam the <noun> and <past tense verb>";
        
        //create scanner object
        Scanner scanner = new Scanner(System.in);

        // parse for parts of speech to replace with String methods
        int speech1open = madlib.indexOf("<");
        int speech1close = madlib.indexOf(">");
        int speech2open = madlib.indexOf("<", speech1open + 1); //don't use index of with second input on ap exam
        int speech2close = madlib.indexOf(">", speech1close + 1);
        int speech3open = madlib.indexOf("<", speech2open + 1);
        int speech3close = madlib.indexOf(">", speech2close + 1);

        // get user input for speech keywords and use prompts to keep user on track
        System.out.print("Enter a " + madlib.substring(speech1open +1, speech1close) + ": ");
        String userSpeech1 = scanner.nextLine();

        System.out.print("Enter a " + madlib.substring(speech2open +1, speech2close) + ": ");
        String userSpeech2 = scanner.nextLine();

        System.out.print("Enter a " + madlib.substring(speech3open +1, speech3close) + ": ");
        String userSpeech3 = scanner.nextLine();

        // replace speech keywords with processed user input also parse for sections to include in final madlib
        String replaceSpeechKeywords = madlib.substring(0, speech1open)
            + userSpeech1 
            + madlib.substring(speech1close +1, speech2open) 
            + userSpeech2 
            + (madlib.substring(speech2close +1, speech3open) 
            + userSpeech3 
            + (madlib.substring(speech3close +1)));

        // Print full modified madlib
        System.out.println(replaceSpeechKeywords);

        scanner.close();
    }

}