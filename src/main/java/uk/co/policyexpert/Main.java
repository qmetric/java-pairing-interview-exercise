package uk.co.policyexpert;

import uk.co.policyexpert.home.HomePremium;
import uk.co.policyexpert.home.customerprofile.CustomerProfile;

public class Main {
    public static void main(String[] args) {
        HomePremium homePremium = new HomePremium();

        CustomerProfile jCase = new CustomerProfile();
        CustomerProfile sHomes = new CustomerProfile(); //new Customer("", LocalDate.of(1957, Month.MARCH, 4), 700), new Home(1930, 2) Name: Sherlock Homes, Date of Birth: 04/03/1957, Credit Score: 700, Home Built: 1930, Number of Bedrooms: 2
        CustomerProfile pHolder = new CustomerProfile(); //new Customer("Polly C. Holder", LocalDate.of(1986, Month.DECEMBER, 11), 550), new Home(1930, 2)

        // Do not worry about changing any of the below code. Simple output is fine from the main class.
        System.out.println("====START OF OUTPUT====");
        System.out.println("Justin Case: " + homePremium.calculate(jCase));
        System.out.println("Sherlock Homes: " + homePremium.calculate(sHomes));
        System.out.println("Polly C. Holder: " + homePremium.calculate(pHolder));
        System.out.println("====END OF OUTPUT====");
    }
}