import java.util.*;

public class Yorrick
{
  public static void main (String[] args)
  {
    final String choices = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+-=[]{};':,./<>?\"\\|`~";
    final int chosen = choices.length();
    final String quote = "Alas, poor Yorick! I knew him, Horatio";
    
    int test = 0;
    String alas = "";


    Random r = new Random(System.currentTimeMillis());
    while (test == 0){
      for (int i = 0; i < 39; i++){
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
