import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //method that prints out hello world
    public static void main(String[] args){
        Customer singleFamily = new SingleFamily();
        singleFamily.customerInput();
        singleFamily.generateBill();

        Customer duplex = new Duplex();
        duplex.customerInput();
        duplex.generateBill();

        System.out.println(Customer.getHighestBill());

        //System.out.println(Customer.getAllCustomer());
        //for loop for increment thrugh the list
        for(Customer c : Customer.getAllCustomer()){
            c.printCustomerInfo();
        }
    }
}
