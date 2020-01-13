import java.util.Scanner;

public class Read_Multiple_Using_Array {
  public static void main(String[] args) {
    Scanner inputuser = new Scanner(System.in);
    int much = inputuser.nextInt(); // input banyaknya inputan
    int [] inpt = new int[much];
    for(int i = 0 ; i <= much-1 ; i++){ //sampai much-1 karena index mulai dari 0
      inpt[i] = inputuser.nextInt();
    }
  }   
}
