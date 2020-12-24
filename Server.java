
/*Project name : AirLine Ticket Reservation System
        KUlvinder Singh
        your roll no. 275-BSCS-2019 (Section E1)

        Description: this class validate the login to the sysem
        used classes : not other class is used in this class*/
package controlar;

import java.io.*;
import java.util.*;

public class Server {

    HashSet<Customer> customers = new HashSet<>();

    private final String userName;
    private final String password;

    public Server(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean validate() {
        try {
            Scanner scanner = new Scanner(new File("dataBase\\login.txt"));
            scanner.useDelimiter("[,\n]");
            String userName1 = "";
            String password1 = "";
            while (scanner.hasNext()) {
                userName1 = scanner.next();
                password1 = scanner.next();
            }
            scanner.close();
            System.out.println("Down Writing");
            if (userName1.trim().equals(userName.trim()) && (password1.trim().equals(this.password.trim()))) {
                return true;

            }
        } catch (FileNotFoundException e) {
        }
        return false;

    }
}
