import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class POWER_Recruitment {
  static Scanner inputuser = new Scanner(System.in);
  static ArrayList<String[]> isiCD = new ArrayList<String[]>();

  // Method Main
  public static void main(String[] args) {
    int nomenu = 0;
    while (nomenu != 4) {
      System.out.print("\nPOWER Recruitment \n" + "=================== \n" + "1. Input New Candidate \n"
          + "2. View Candidate’s Data \n" + "3. Remove Candidate \n" + "4. Exit \n" + "Choose : ");
      nomenu = inputuser.nextInt();
      switch (nomenu) {
      case 1:
        INC();
        break;
      // case 2:
      // VCD();
      // break;
      // case 3:
      // RC();
      // break;
      case 4:
        break;
      }
    }
  }

  // Method Untuk Validasi Penulisan Nama
  static boolean validname(String iname) {
    if (iname.length() >= 5 && iname.length() <= 20) {
      StringTokenizer jmlkata = new StringTokenizer(iname);
      if (jmlkata.countTokens() >= 2) {
        return true;
      } else
        System.out.println(">> Please input 2 words name.");
      return false;
    } else
      System.out.println(">> Please input name between 5 to 20 characters.");
    return false;
  }

  // Method Untuk Validasi Penulisan Gender
  static boolean validgender(String gender) {
    if ("MALE".equals(gender.toUpperCase()) || "FEMALE".equals(gender.toUpperCase())) {
      return true;
    } else {
      System.out.println(">> Please input the right gender between male / female.\n");
      return false;
    }
  }

  // Method Untuk Validasi Penulisan Umur
  static boolean validage(String agetxt) {
    int agenum = Integer.parseInt(agetxt);
    if (agenum <= 16 || agenum >= 31) {
      System.out.println(">> Please input age between 17 to 30.\n");
      return false;
    } else {
      return true;
    }
  }

  // Menu 1
  static void INC() {
    isiCD.clear();
    String dataCD[] = new String[4];
    inputuser.nextLine();
    // Check input grade pakai method validgrade
    do {
      System.out.print("\nInput candidate's name [5 to 20 character] : ");
      dataCD[0] = inputuser.nextLine();
    } while (!validname(dataCD[0]));
    do {
      System.out.print("Input candidate's gender [male / female] : ");
      dataCD[1] = inputuser.next();
    } while (!validgender(dataCD[1]));
    // do{
    System.out.print("Input candidate's address [must be ended with 'street'] : ");
    dataCD[2] = inputuser.nextLine().toUpperCase();
    // }
    // while(!validadress(dataCD[2]));
    inputuser.nextLine();
    do {
      System.out.print("Input candidate's age [17 to 30] : ");
      dataCD[3] = inputuser.next();
    } while (!validage(dataCD[3]));
    isiCD.add(dataCD);
    System.out.println();
    bikininisial(dataCD[0]);
  }

  static void bikininisial(String name) {
    if (name.length() == 0)
      return;
    System.out.print(">> Thank You for registering! Your initial is " + Character.toUpperCase(name.charAt(0)));

    for (int i = 1; i < name.length() - 1; i -= -1)
      if (name.charAt(i) == ' ')
        System.out.print(" " + Character.toUpperCase(name.charAt(i + 1)));
    System.out.print(" <<\n\n");
  }
}
