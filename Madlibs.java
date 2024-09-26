

public class Madlibs {
    
    public static void main(String[] args) 
    {

        String madlib1 = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
        // String madlib2 = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        // String madlib3 = "There was a time when <plural_noun> would roam the <noun> and <verb>";
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter name: ");

        // String name = sc.nextLine();
        // System.out.println("username: " + name);

        int speech1open = madlib1.indexOf("<");
        int speech1close = madlib1.indexOf(">");
        int speech2open = madlib1.indexOf("<", madlib1.indexOf("<") + 1);
        int speech2close = madlib1.indexOf(">", madlib1.indexOf(">") + 1);

        int speech1length = speech1close - speech1open;
        int speech2length = speech2close - speech2open;

        System.out.println(speech1length);
        System.out.println(speech2length);



    }

}