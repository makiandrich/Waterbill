import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testing {
    @Test
    public void testSingleFamilyTier1(){
        Customer customer = new Customer();
        customer.gallonsUsed = 6000;
        customer.customerType = 1;
        customer.calculateBill();

        assertEquals(25.45,customer.bill,0.01);
    }
    @Test
    public void testSingleFamilyTier2(){
        Customer customer = new Customer();
        customer.gallonsUsed = 8000;
        customer.customerType = 1;
        customer.calculateBill();
        assertEquals(29.84,customer.bill,0.01);

    }
}