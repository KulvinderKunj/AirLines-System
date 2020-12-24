
/*Project name : AirLine Ticket Reservation System
        KUlvinder Singh
        your roll no. 275-BSCS-2019 (Section E1)

        Description: this class is sub class o Seat class increase in price id for this class is 7% and it is for bussiness class seats

        used classes :  this class se extanded from seat class and using the Seat class only*/


//IMporting Class
package controlar;
//Bussiness Class

public class BussinesClass extends Seat {

    private String seatClass;
    private int percentExtraCharges;
//Cunstoctor

    public BussinesClass(int seatNumber, int localPrice) {
        super(seatNumber, localPrice);
        this.seatClass = "Business Class";
        this.percentExtraCharges = 7;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public int getPercentExtraCharges() {
        return percentExtraCharges;
    }

    public int totalCharges() {
        return super.totalCharges() + ((getPercentExtraCharges() * getLocalPrice()) / 100);
    }
}
