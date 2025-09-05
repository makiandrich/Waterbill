public class Main {
    //method that prints out hello world
    public static void main(String[] args){
        //find the names house type and gallons used

        String name = "Alice";
        int gallonsUsed = 8000;
        int customerType = 1; //for the house type 1= single family and 2 is duplex
        double bill = 0;


        if (customerType == 1) {
            if (gallonsUsed <= 7000) {
                bill = 13.21 + gallonsUsed * (2.04 / 1000.0);
            } else if (gallonsUsed <= 13000) {
                bill = 13.21 + 7000 * (2.04 / 1000.0)
                        + (gallonsUsed - 7000) * (2.35 / 1000.0);
            } else {
                bill = 13.21 + 7000 * (2.04 / 1000.0)
                        + 6000 * (2.35 / 1000.0)
                        + (gallonsUsed - 13000) * (2.70 / 1000.0);
            }
        } else {
            if (gallonsUsed <= 7000) {
                bill = 15.51 + gallonsUsed * (1.97 / 1000.0);
            } else if (gallonsUsed <= 13000) {
                bill = 15.51 + 9000 * (1.97 / 1000.0)
                        + (gallonsUsed - 9000) * (2.26 / 1000.0);
            } else {
                bill = 15.51 + 9000 * (1.97 / 1000.0)
                        + 4000 * (2.26 / 1000.0)
                        + (gallonsUsed - 13000) * (2.60 / 1000.0);
            }
        }

        System.out.println("Customer Type: " + customerType);
        System.out.println("Gallons Used: " + gallonsUsed);
        System.out.println("Custoemr Name: " + name);
        System.out.printf("Bill: %.2f\n",bill);


    }
}
