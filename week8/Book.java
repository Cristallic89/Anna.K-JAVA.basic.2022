package week8;

public class Book {

    ArrayList<String> pages = new ArrayList<String>();
    pages.add("Split your method into short clear chunks.");
    pages.add("Devide the user interface logic from the application logic.");
    pages.add("At first, always code only a small program which solves only a part of the problem.");
    pages.add("Practice makes perfect. Make up your own fun project.");

    EBook book = new EBook("Programming Hints.", pages);
    for(int page = 0; page < book.howManyPages(); page++) {
        System.out.println(book.read());
    }

}
