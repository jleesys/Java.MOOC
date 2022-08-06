package FlightControl;
import FlightControl.ui.Userinterface;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
       Scanner scanner = new Scanner(System.in);
       Userinterface ui = new Userinterface(scanner);
       ui.startAsset();
       ui.startFlightControl();
    }

}
