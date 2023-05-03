package BusTicketBookingSystem;

import java.util.Scanner;
public class BusTicket {
    public static void main(String[] args) throws InvalidBookingException {
        Scanner sc= new Scanner(System.in);
        BusBookingSystem busBookingSystem = new BusBookingSystem();
        while (true) {
            System.out.println("**************************");
            System.out.println("**************************");
            System.out.println("Welcome to the PRTC buses");
            System.out.println("1. BookPRTC buses ticket");
            System.out.println("2. Exit");
            System.out.println("**************************");
            System.out.println("**************************");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter source: ");
                    String source = sc.nextLine();
                    System.out.print("Enter destination: ");
                    String destination = sc.nextLine();
                    busBookingSystem.bookTicket(source, destination);
                    break;
                case 2:
                    System.out.println("Thank you for using the PRTC buses");
                    return;
                default:
                    System.out.println("buses not found");
            }
        }
    }
}
interface BusBooking {
    void bookTicket(String source, String destination) throws InvalidBookingException;
}
class BusBookingSystem implements BusBooking {
    public static final String[] BUS_NAMES = {"BusNo1", "BusNo2", "BusNo3"};
    public static final int[] BUS_PRICES = {100, 150, 200};
    @Override
    public void bookTicket(String source, String destination) throws InvalidBookingException {
        System.out.println("Available buses:");
        for (int i = 0; i < BUS_NAMES.length; i++) {
            System.out.println((i + 1) + ". " + BUS_NAMES[i] + " - Rs." + BUS_PRICES[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bus number: ");
        int busNumber = sc.nextInt();
        if (busNumber < 1 || busNumber > BUS_NAMES.length) {
            throw new InvalidBookingException("Invalid bus number");
        }
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter date of booking: ");
        String dateOfBooking = sc.nextLine();
        System.out.println("********TICKET DETAILS********");
        System.out.println( "       Bus:                "+ BUS_NAMES[busNumber - 1] );
        System.out.println("        From:               " +source);
        System.out.println("        To:                 " +destination);
        System.out.println("        Date of Journey:    " +dateOfBooking);
        System.out.println("        Total Fare is:      " + BUS_PRICES[busNumber - 1]); 

            
    }
}
class InvalidBookingException extends Exception {
    public InvalidBookingException(String message) {
        super(message);
    }
}