import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // System.out.println("Welcome to your Media Library");
    // MediaLib myLib = new MediaLib();
    // Book myBook = new Book("The Lord of the Rings", "Tolkien");
    // System.out.println("Library:\n" + myLib);
    // myLib.addBook(myBook);
    // System.out.println("Library:\n" + myLib);
    // int myRating = 5;
    // myBook.adjustRating(myRating);
    // System.out.println(myBook);
    // myBook.setTitle("Harry Potter");
    // System.out.println("Book:" + myBook);
    // System.out.println("Library: " + myLib);

    // System.out.println("You have a NEW Library");
    // MediaLib myLib2 = new MediaLib();

    // Book newBook = new Book("To Kill a Mockingbird", "Lee");
    // myLib2.addBook(newBook);
    // System.out.println(myLib2);
    // newBook = new Book("1984", "Orwell");
    // System.out.println(myLib2);


    // System.out.println("before test:" + newBook);
    // myLib.testBook(newBook);
    // System.out.println("after test:" + newBook);

    // Book newBook2 = new Book("1984", "Orwell");
    // newBook.equals(newBook2);

    // System.out.println(newBook2.title);


    // Step 1
    // System.out.println(MediaLib.getOwner() + "'s Library");

    // // Step 14
    // System.out.println(MediaLib.getNumEntries());

    // MediaLib myLib = new MediaLib();
    // myLib.addMovie(new Movie("Raiders of the Lost Ark", 1.9));
    // myLib.addBook(new Book("1984", "Orwell"));
    // myLib.addSong(new Song("In Your Eyes"));
    // System.out.println(MediaLib.getOwner() + "'s Library:\n" + myLib);

    MediaLib myLib1 = new MediaLib();
    myLib1.addBook(new Book("1984", "Orwell"));
    System.out.println("Library1:\n" + myLib1);

     // wait a bit to get a new date
    System.out.println("Wait a second or two so Library 2 has a different time.");
    System.out.print("Press <ENTER> to continue...");
    Scanner s = new Scanner(System.in);
    String temp = s.nextLine();

    // MediaLib myLib2 = new MediaLib();
    // myLib2.addSong(new Song("In Your Eyes", 3));
    // System.out.println("Library2:\n" + myLib2);

  }
}