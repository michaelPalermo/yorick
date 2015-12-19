import java.util.*;

public class VirtualMonkeys
{
  public static void main (String[] args)
  {
    final String choices = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+-=[]{};':,./<>?\"\\|`~";
    final int chosen = choices.length();
    
    String quote = "";
    int test = 0;
    String alas = "";
    
     Scanner scan = new Scanner(System.in);

    System.out.println("Input a word, phrase, sentence, paragraph, essay, or whatever here: ");
    quote = scan.nextLine();
    
    Random r = new Random(System.currentTimeMillis());
    while (test == 0){
      for (int i = 0; i < quote.length(); i++){
        alas += choices.charAt(r.nextInt(chosen));
      }
      System.out.println(alas);
      if (alas.equals(quote)){
        test = 1;
      }
      else{
        alas = "";
      }
    }
  }
}
