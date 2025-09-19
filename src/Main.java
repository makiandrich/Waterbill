import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //method that prints out hello world
    public static void main(String[] args){

        Customer customer = new Customer();
        /*
        customer.setGallonsUsed(-1000);
        customer.calculateBill();
        customer.setGallonsUsed(-2000);
        customer.printCustomerInfo();
        */
        customer.customerInput();

    }
}
