/*Project name : AirLine Ticket Reservation System
        KUlvinder Singh
        your roll no. 275-BSCS-2019 (Section E1)

        Description: This class is used to preform all the file handling reading writing data from files

        used classes : Customer class,Flight Class,Ticket Class,Seat Class, Reserved Seats Class*/
package controlar;
//importing Classes

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
//File Handing Class

public class FileHandler {
//    Variables

    private final HashMap<String, Customer> customers = new HashMap<>();
    private final HashMap<String, Flight> flights = new HashMap<>();
    private final HashMap<String, ReservedSeats> reservedSeats = new HashMap<>();
    private final HashMap<String, Ticket> tickets = new HashMap<>();
//constoctor

    public FileHandler() {
    }
//FileWriter class

    public File Writer(String outString, String filepath) {

        try {

            File file1 = new File(filepath);
            FileWriter fw = new FileWriter(file1, true);
            try (PrintWriter pw = new PrintWriter(fw, true)) {
                pw.print(outString);
            }
            System.out.println("Done Writing");
            return file1;
        } catch (IOException ex) {
            ex.printStackTrace();

        }
        return null;
    }
//GettingCustomer From File  

    public HashMap<String, Customer> getCustomers() {
        try {
            File file = new File("dataBase\\customes.txt");
            Scanner fScanner = new Scanner(file);
            while (fScanner.hasNext()) {
                String[] objStrings = fScanner.nextLine().split("#");
                String id = objStrings[0];
                String name = objStrings[1];
                String email = objStrings[2];
                String phone = objStrings[3];
                String gender = objStrings[4];
                String dob = objStrings[5];
                String address = objStrings[6];
                Customer customer = new Customer(id, name, email, phone, gender, dob, address);
                customers.put(id, customer);
            }
            System.out.println("Readingh is done customer");
        } catch (FileNotFoundException ex) {

        }

        return customers;
    }
//GettingFlights From File  

    public HashMap<String, Flight> getFlights() {
        try {
            File file = new File("dataBase\\flights.txt");
            try (Scanner fScanner = new Scanner(file)) {
                while (fScanner.hasNext()) {
                    String[] objStrings = fScanner.nextLine().split("#");
                    String id1 = objStrings[0];
                    String name1 = objStrings[1];
                    String source1 = objStrings[2];
                    System.out.println(id1);
                    String destination1 = objStrings[3];
                    String charges1 = objStrings[4];
                    String arival1 = objStrings[5];
                    String departure1 = objStrings[6];
                    String date1 = objStrings[7];
                    flights.put(id1, (new Flight(id1, name1, source1, destination1, charges1, arival1, departure1, date1)));
                }
            }
            System.out.println("Readingh is done flights ");
        } catch (FileNotFoundException ex) {
        }
        return flights;
    }
//GettingSeats From File  

    public HashMap<String, ReservedSeats> getSeats() {
        try {
            File file = new File("dataBase\\seats.txt");
            try (Scanner fScanner = new Scanner(file)) {
                while (fScanner.hasNext()) {
                    String[] objStrings = fScanner.nextLine().split("#");
                    String seatNo1 = objStrings[0];
                    String lprice = objStrings[1];
                    String seatClass = objStrings[2];
                    String Tprice = objStrings[3];
                    ReservedSeats reservedSeats = new ReservedSeats(seatNo1, lprice, Tprice, seatClass);
                    this.reservedSeats.put(seatNo1, reservedSeats);

                }
            }
            System.out.println("Readingh is done seats");
        } catch (FileNotFoundException ex) {
        }
        return reservedSeats;
    }

    //GettingTickes From File  
    public HashMap<String, Ticket> getTicket() {
        try {
            File file = new File("dataBase\\ticket.txt");
            System.out.println("3");
            try (Scanner fScanner = new Scanner(file)) {
                while (fScanner.hasNext()) {
                    System.out.println(4);
                    String[] objStrings = fScanner.nextLine().split("#");
                    String ticketId = objStrings[0];
                    String seatNo = objStrings[1];
                    String CustomerId = objStrings[2];
                    String FlightId = objStrings[3];
                    Customer c = getCustomers().get(CustomerId);
                    Flight f = getFlights().get(FlightId);
                    ReservedSeats seat = getSeats().get(seatNo);
                    tickets.put(ticketId, new Ticket(ticketId, c, f, seat));
                    System.out.println("5");
                }
            }
            System.out.println("Readingh is done tickets");
        } catch (FileNotFoundException ex) {
        }
        return tickets;
    }

}
