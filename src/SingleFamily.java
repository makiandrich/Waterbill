import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingleFamily extends Customer{
    final double SINGLE_BASE = 13.21;
    final int SINGLE_TIER1 = 7000;
    final double SINGLE_TIER1_COST = 2.04;
    final int SINGLE_TIER2 = 6000;
    final double SINGLE_TIER2_COST = 2.35;
    final double SINGLE_TIER3_COST = 2.70;

    protected boolean isLowIncome;

    public boolean isLowIncome() {
        return isLowIncome;
    }

    public void setLowIncome(boolean lowIncome) {
        isLowIncome = lowIncome;
    }

    @Override
    public double calculateBill() {
            double bill;

            if (getGallonsUsed() <= SINGLE_TIER1) {
                bill = SINGLE_BASE + getGallonsUsed()  * (SINGLE_TIER1_COST / getGALLONS());
            } else if (getGallonsUsed()  <= getTIER2_CUTOFF()) {
                bill = SINGLE_BASE + SINGLE_TIER1 * (SINGLE_TIER1_COST / getGALLONS())
                        + (getGallonsUsed()  - SINGLE_TIER1) * (SINGLE_TIER2_COST /
                        getGALLONS());
            } else {
                bill = SINGLE_BASE + SINGLE_TIER1 * (SINGLE_TIER1_COST / getGALLONS())
                        + SINGLE_TIER2 * (SINGLE_TIER2_COST / getGALLONS())
                        + (getGallonsUsed()  - getTIER2_CUTOFF()) * (SINGLE_TIER3_COST /
                        getGALLONS());
            }
            return bill;

    }

    @Override
    public double applyDiscount(double bill) {
        if(isLowIncome){
            bill = bill *0.9;
        }
        return  bill;
    }
    @Override
    public void customerInput(){
        super.customerInput();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            System.out.println("Is the User a low income? true/false?");
            isLowIncome = Boolean.parseBoolean(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
