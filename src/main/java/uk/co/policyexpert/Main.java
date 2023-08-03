package uk.co.policyexpert;

import uk.co.policyexpert.home.HomePremium;
import uk.co.policyexpert.home.customerprofile.CustomerProfile;

public class Main {
    public static void main(String[] args) {
        HomePremium homePremium = new HomePremium();

        CustomerProfile jCase = new CustomerProfile();
        CustomerProfile sHomes = new CustomerProfile();
        CustomerProfile pHolder = new CustomerProfile();

        // Do not worry about changing any of the below code. Simple output is fine from the main class.
        System.out.println("====START OF OUTPUT====");
        System.out.println("Justin Case: " + homePremium.calculate(jCase));
        System.out.println("Sherlock Homes: " + homePremium.calculate(sHomes));
        System.out.println("Polly C. Holder: " + homePremium.calculate(pHolder));
        System.out.println("====END OF OUTPUT====");
    }
}
