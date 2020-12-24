/*Project name : AirLine Ticket Reservation System
        KUlvinder Singh
        your roll no. 275-BSCS-2019 (Section E1)

        Description: this class is sub class o Seat class increase in price id for this class is 0% and it is for Economy class seats

        used classes :  this class se extanded from seat class and using the Seat class only*/
package controlar;

public class EconomyClass extends Seat {

    private String seatClass;
    private int percentExtraCharges;

    public EconomyClass(int seatNumber, int localPrice) {
        super(seatNumber, localPrice);
        this.seatClass = "Economy Class";
        this.percentExtraCharges = 0;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public int getPercentExtraCharges() {
        return percentExtraCharges;
    }

    public int totalCharges() {

        return super.totalCharges() + (getPercentExtraCharges() * getLocalPrice()) / 100;
    }

}
