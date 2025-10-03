import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {
    //find the names house type and gallons used


    //private makes it so that way the only way we can edit the var is inside the class
    private String name;
    private int gallonsUsed;
    private int customerType; //for the house type 1= single family and 2 is duplex
    protected double bill;



    final int TIER2_CUTOFF = 13000;
    final double GALLONS = 1000.0;


    public int getTIER2_CUTOFF() {
        return TIER2_CUTOFF;
    }

    public double getGALLONS() {
        return GALLONS;
    }

    public int getGallonsUsed() {
        return gallonsUsed;
    }

    public void setGallonsUsed(int gallonsUsed) {
        if(gallonsUsed < 0) {
            System.out.println("Invalid gallonsUsed");
        }else{
            this.gallonsUsed = gallonsUsed;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //string is a refrence or object so validation is slightly differnt
        if(name.equals("")) {
            System.out.println("Please enter a name");
        }else {
            this.name = name;
        }
    }

    public int getCustomerType() {
        return customerType;
    }

    public void setCustomerType(int customerType) {
        this.customerType = customerType;
    }

    public double getBill() {
        return bill;
    }

    public void calculateBill() {}






    public void customerInput() {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        try {
            System.out.print("Enter customer type 1-Single Family, 2-Duplex: ");
            customerType = Integer.parseInt(bufferedReader.readLine());

            System.out.print("Enter your name: ");
            setName(bufferedReader.readLine());

            System.out.print("Enter gallons used: ");
            setGallonsUsed(Integer.parseInt(bufferedReader.readLine()));

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


