package FlightControl.ui;

import FlightControl.assets.Plane;
import FlightControl.assets.Flight;
import FlightControl.assets.Place;
import FlightControl.logic.AssetsControl;
import FlightControl.logic.FlightControl;

import java.util.Scanner;

public class Userinterface {
    private Scanner scanner;
    private AssetsControl assetsControl;
    private FlightControl flightControl;

    public Userinterface(Scanner scanner) {
        this.scanner = scanner;
        this.assetsControl = new AssetsControl();
        this.flightControl = new FlightControl();
    }

    public void startAsset() {
        userAction();
    }

    public void startFlightControl() {
        userAction2();
    }

    public void textUI() {
        System.out.println("Choose an action:");
        System.out.println("[1] Add an airplane");
        System.out.println("[2] Add a flight");
        System.out.println("[x] Exit Airport Asset Control");
        System.out.print("> ");
    }

    public void textUI2() {
        System.out.println("Choose an action:");
        System.out.println("[1] Print airplanes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print airplane details");
        System.out.println("[x] Quit");
        System.out.print("> ");
    }

    public void userAction() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        while (true) {
            textUI();
            String input = scanner.nextLine();
            if (input.equals("1")) {
                addPlane();
            }
            else if (input.equals("2")) {
                addFlight();
            }
            else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Invalid command. Please try again using the options below.");
            }
        }
    }

    public void userAction2() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();
        while (true) {
            textUI2();
            String input = scanner.nextLine();
            if (input.equals("1")) {
                //print airplanes
                assetsControl.printPlanes();
            }
            else if (input.equals("2")) {
                //print flights
                assetsControl.printFlights();
            }
            else if (input.equals("3")) {
                //print airplane details
                System.out.print("Give the airplane id: ");
                String i1 = scanner.nextLine();
                System.out.println(assetsControl.getPlane(i1));
            }
            else if (input.equals("x")) {
                return;
            } else {
                System.out.println("Invalid command. Please try again using the options below.");
            }
        }
    }

    public void addPlane() {
        System.out.println("Give the airplane id: ");
        String input1 = scanner.nextLine();
        System.out.println("Give the airplane capacity: ");
        String input2 = scanner.nextLine();
        // add plane
        this.assetsControl.addPlane(input1, new Plane(input1, Integer.valueOf(input2)));
    }

    public void addFlight() {
        System.out.println("Give the airplane id: ");
        String input1 = scanner.nextLine();
        if (!assetsControl.checkPlanes(input1)) {
            System.out.println("Not a valid airplane id.");
            return;
        }
        System.out.println("Give the departure airport id: ");
        String input2 = scanner.nextLine();
        System.out.println("Give the target airport id: ");
        String input3 = scanner.nextLine();
        //add flight
        this.assetsControl.addFlight(input1,new Flight(this.assetsControl.getPlane(input1),new Place(input2),new Place(input3)));
    }

}
