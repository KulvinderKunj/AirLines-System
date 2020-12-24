
/*Project name : AirLine Ticket Reservation System
        KUlvinder Singh
        your roll no. 275-BSCS-2019 (Section E1)

        Description: this class is to create a ticket object
        used classes :  ReservedSeats,Customer,and Flight class is used in this class */
package controlar;

public class Ticket {

    private String ticketId;
    private Customer customer;
    private Flight flight;
    private ReservedSeats seat;

    public Ticket(String ticketId, Customer customer, Flight flight, ReservedSeats seat) {
        this.ticketId = ticketId;
        this.customer = customer;
        this.flight = flight;
        this.seat = seat;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public ReservedSeats getSeat() {
        return seat;
    }

    public void setSeat(ReservedSeats seat) {
        this.seat = seat;
    }

}
