/*Project name : AirLine Ticket Reservation System
        KUlvinder Singh
        your roll no. 275-BSCS-2019 (Section E1)

        Description: this class is use to create new seat

        used classes :  this class is parant class of First, bussines ,  and  economy class only these three classes is using thid class*/
package controlar;

public class Seat {

    private int seatNumber;
    private final int localPrice;

    public Seat(int seatNumber, int localPrice) {

        this.seatNumber = seatNumber;
        this.localPrice = localPrice;

    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getLocalPrice() {
        return localPrice;
    }

    public String getSeatClass() {

        return "Economy Class";
    }

    public int totalCharges() {

        return localPrice;
    }

}
