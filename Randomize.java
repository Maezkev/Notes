import java.util.Random;

class Randomize{  
  public static void main(String args[])  {  
    int min = 20;
    int max = 80;
    int random = new Random().nextInt((max - min) + 1) + min;
  }
}
