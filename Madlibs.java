import java.util.Scanner;

public class Madlibs {
    
    public static void main(String[] args) 
    {
        String madlib = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
        //madlib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        //madlib = "There was a time when <plural_noun> would roam the <noun> and <past_tense_verb>";
        Scanner sc = new Scanner(System.in);

        // find where each speech keyword starts and ends
        int speech1open = madlib.indexOf("<");
        int speech1close = madlib.indexOf(">");
        int speech2open = madlib.indexOf("<", speech1open + 1);
        int speech2close = madlib.indexOf(">", speech1close + 1);
        int speech3open = madlib.indexOf("<", speech2open + 1);
        int speech3close = madlib.indexOf(">", speech2close + 1);

        // get user input for speech keywords
        System.out.print("Enter a " + madlib.substring(speech1open +1, speech1close) + ": ");
        String userSpeech1 = sc.nextLine();

        System.out.print("Enter a " + madlib.substring(speech2open +1, speech2close) + ": ");
        String userSpeech2 = sc.nextLine();

        System.out.print("Enter a " + madlib.substring(speech3open +1, speech3close) + ": ");
        String userSpeech3 = sc.nextLine();

        // replace speech keywords with user input
        String replaceSpeechKeywords = madlib.substring(0, speech1open) + userSpeech1 + madlib.substring(speech1close +1, speech2open) + userSpeech2 + (madlib.substring(speech2close +1, speech3open) + userSpeech3 + (madlib.substring(speech3close +1)));

        // Print full madlib
        System.out.println(replaceSpeechKeywords);

        sc.close();
    }

}