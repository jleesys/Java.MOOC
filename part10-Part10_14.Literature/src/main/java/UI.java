// i have no idea what this is vvv
import java.awt.print.Book;
import java.util.Scanner;

public class UI {

    // scanner class for taking user inputs ^^^
    private Scanner scanner;
    // list class to contain multiple books (instances of class Literature)
    private BookList list;

    //constructor initializes scanner and list
    public UI(Scanner scanner) {
        this.scanner = scanner;
        this.list = new BookList();
    }

    public void start() {
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            if (bookName.equals("")) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            int ageRec = Integer.valueOf(scanner.nextLine());
           this.list.add(new Literature(bookName,ageRec));

        }
        //debugger for sort by age method
        //this.list.sortByAge();
        this.list.sortByAgeAndName();
        System.out.print(this.list.size() + " books in total.\n\nBooks:\n");
        System.out.println(this.list);

    }
}
