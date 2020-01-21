import java.util.Scanner;

class Kalkulator{
 public static void main(String args[]){ 
  Scanner inputuser = new Scanner(System.in);
  System.out.print("Masukkan angka pertama : ");
  double bil1 = inputuser.nextDouble();
  System.out.print("Maukkan operasi matematika (+, -, x, /): ");
  String op = inputuser.next();
  System.out.print("Masukkan angka kedua : ");
  double bil2 = inputuser.nextDouble();
  switch(op){
    case "+" :
      System.out.println("Hasilnya adalah " + (bil1 + bil2));
      break;
    case "-" :
      System.out.println("Hasilnya adalah " + (bil1 - bil2));
      break;
    case "x" :
      System.out.println("Hasilnya adalah " + (bil1 * bil2));
      break;
    case "/" :
      System.out.println("Hasilnya adalah " + (bil1 / bil2));
      break;
  }
 }
}
