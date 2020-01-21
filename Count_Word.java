import java.util.StringTokenizer;
import java.util.Scanner;

 public class Count_Word
 {
   public static void main(String args[])
   { 
    Scanner inputuser = new Scanner(System.in);
    System.out.print("Kata-kata : ");
    String tulisan = inputuser.nextLine();
    StringTokenizer itungkata = new StringTokenizer(tulisan);
    if(itungkata.countTokens() < 2){
      System.out.println("Jumlah kata kurang dari 2");
    }else if(itungkata.countTokens() > 2){
      System.out.println("Jumlah kata lebih dari 2");
    }else{
      System.out.println("Jumlah kata adalah 2");
    }
   }
 }
