import java.util.Calendar;
/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib {
  private Book book;
  public static String owner = "PLTW";
  public static int numEntries = 0;

  public void addBook(Book b) {
    if(book == null){
      book = b;
      numEntries++;
    }
    else{
      System.out.println("Cannot add new book");
    }
    // Step 15
  }

  public String toString() {
    String info = "Added " + book;

    return info;
  }

  // public void testBook(Book tester){
  // tester.setTitle("Test");
  // System.out.println(tester);
  // }
  public static String getOwner() {
    return owner;
  }

  // Step 8
  public void changeOwner(String change){
    owner = change;
  }
  public static int getNumEntries(){
    return numEntries;
  }

  public static String time(){
    Calendar cal = Calendar.getInstance();
    String dateTimeStr = cal.getTime().toString();
    return dateTimeStr;
  }
  
}