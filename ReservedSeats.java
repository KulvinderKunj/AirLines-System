/*Project name : AirLine Ticket Reservation System
        KUlvinder Singh
        your roll no. 275-BSCS-2019 (Section E1)

        Description: This class will create the object of reserves Seats from File handlar class

        used classes :  No other class is used*/
package controlar;

import java.util.HashMap;

public class ReservedSeats {

    private String SeatNo;
    private String localprize;
    private String totalCharges;
    private String seatClass;


    public ReservedSeats(String SeatNo, String localprize, String totalCharges, String seatClass) {
        this.SeatNo = SeatNo;
        this.localprize = localprize;
        this.totalCharges = totalCharges;
        this.seatClass = seatClass;
    }

    public String getSeatNo() {
        return SeatNo;
    }

    public String getLocalprize() {
        return localprize;
    }

    public String getTotalCharges() {
        return totalCharges;
    }

    public String getSeatClass() {
        return seatClass;
    }



}
