
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // initialize a new scanner for user inputs, later passed to the ui class
        Scanner scanner = new Scanner(System.in);
//        initializing the ui class, prompts user for inputs and then performs the specified action , specified by me ofc
        UI ui = new UI(scanner);

        // starting the ui class, kickstarting the rest of the program
        ui.start();


    }

}
