import java.util.*;

class Findduplicate
{  
  public static void main(String args[])
  {  
    Scanner inputuser = new Scanner(System.in);
    int jml = inputuser.nextInt();
    int [] angka = new int[jml];
    for(int i = 0 ; i < jml ; i++){
      angka[i] = inputuser.nextInt();
    }
    int lambat;
    int cepet;
    for(int o = 0 ; o < 2 ; o++){
      for(int i = 0 ; i < angka.length - 1 ; i++){
        if(angka[i] > angka[i + 1]){
          angka[i] ^= angka[i + 1];
          angka[i + 1] ^= angka[i];
          angka[i] ^= angka[i + 1];
        }
      }
    }
    for(int i = 0 ; i < angka.length - 1; i++){
      lambat = angka[i];
      cepet = angka[i + 1];
      int same;
      if(lambat == cepet){
        if(lambat == ){
          continue;
        }
        System.out.println(lambat);
      }
    }
  }
}
