import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {
    //find the names house type and gallons used

    String name;
    int gallonsUsed;
    int customerType; //for the house type 1= single family and 2 is duplex
    double bill;
    final double SINGLE_BASE = 13.21;
    final double DUPLEX_BASE = 15.51;

    public void calculateBill() {
        if (customerType == 1) {
            if (gallonsUsed <= 7000) {
                bill = SINGLE_BASE + gallonsUsed * (2.04 / 1000.0);
            } else if (gallonsUsed <= 13000) {
                bill = SINGLE_BASE + 7000 * (2.04 / 1000.0)
                        + (gallonsUsed - 7000) * (2.35 / 1000.0);
            } else {
                bill = SINGLE_BASE + 7000 * (2.04 / 1000.0)
                        + 6000 * (2.35 / 1000.0)
                        + (gallonsUsed - 13000) * (2.70 / 1000.0);
            }
        } else {
            if (gallonsUsed <= 9000) {
                bill = DUPLEX_BASE + gallonsUsed * (1.97 / 1000.0);
            } else if (gallonsUsed <= 13000) {
                bill = DUPLEX_BASE + 9000 * (1.97 / 1000.0)
                        + (gallonsUsed - 9000) * (2.26 / 1000.0);
            } else {
                bill = DUPLEX_BASE + 9000 * (1.97 / 1000.0)
                        + 4000 * (2.26 / 1000.0)
                        + (gallonsUsed - 13000) * (2.60 / 1000.0);
            }
        }


    }

    public void customerInput() {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        try {
            System.out.print("Enter customer type 1-Single Family, 2-Duplex: ");
            customerType = Integer.parseInt(bufferedReader.readLine());

            System.out.print("Enter your name: ");
            name = bufferedReader.readLine();

            System.out.print("Enter gallons used: ");
            gallonsUsed = Integer.parseInt(bufferedReader.readLine());

        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void printCustomerInfo() {
        System.out.println("Customer Type: " + customerType);
        System.out.println("Gallons Used: " + gallonsUsed);
        System.out.println("Customer Name: " + name);
        System.out.printf("Bill: %.2f\n", bill);
    }


}

