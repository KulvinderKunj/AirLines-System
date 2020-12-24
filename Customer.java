/*Project name : AirLine Ticket Reservation System
        KUlvinder Singh
        your roll no. 275-BSCS-2019 (Section E1)

        Description: this class is to create the new customer
        used classes :  NO class is uesd*/
package controlar;

public class Customer {

    private String customerId;
    private String name;
    private String email;
    private String MobileNumber;
    private String dateOfBirth;
    private String Gender;
    private String address;

    public Customer(String customerId, String name, String email, String MobileNumber, String Gender, String dateOfBirth, String address) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.MobileNumber = MobileNumber;
        this.Gender = Gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public String getAddress() {
        return address;
    }

}
