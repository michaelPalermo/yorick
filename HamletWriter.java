import java.util.*;
import java.io.*;

public class HamletWriter
{
  public static String readFile(String filename){
    try{
      String sequence = "";
      Scanner scan = new Scanner (new File(filename));
      while (scan.hasNext()) {
        sequence += scan.nextLine();
      }
      return sequence;
      }catch (IOException e) {
      throw new RuntimeException(e);
      }
    }
  
  public static void main (String[] args)
  {
    final String choices = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+-=[]{};':,./<>?\"\\|`~";
    final int chosen = choices.length();
    
    int test = 0;
    String alas = "";
    String quote = readFile("Hamlet.txt");
    

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
