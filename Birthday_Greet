import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Birthday_Greet{
  public static void main(String[] args) {
    DateTimeFormatter tddate = DateTimeFormatter.ofPattern("dd MMMM yyyy");
    LocalDateTime now = LocalDateTime.now();
    System.out.println(tddate.format(now).equals("12 January 2020") ? "Happy Birthday"
                          + "\nBest wishes always for you" : "Today isn't " + tddate.format(now));
  }
}
