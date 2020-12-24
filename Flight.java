/*Project name : AirLine Ticket Reservation System
        KUlvinder Singh
        your roll no. 275-BSCS-2019 (Section E1)

        Description: This class is To crate a new Flight
        used classes :  not other classes is used in this class*/
package controlar;

public class Flight {

    private String flightNumber;
    private String flightName;
    private String source;
    private String destination;
    private String charges;
    private String arival;
    private String depaeture;
    private String date;

    public Flight(String flightNumber, String flightName, String source, String destination, String charges, String arival, String depaeture, String date) {
        this.flightNumber = flightNumber;
        this.flightName = flightName;
        this.source = source;
        this.destination = destination;
        this.charges = charges;
        this.arival = arival;
        this.depaeture = depaeture;
        this.date = date;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    public String getArival() {
        return arival;
    }

    public String getDepaeture() {
        return depaeture;
    }

    public String getDate() {
        return date;
    }

}
