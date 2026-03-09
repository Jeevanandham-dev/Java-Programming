import java.util.Scanner;

public class HealthcareInsurancePremiumCalculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int age = obj.nextInt();
        obj.nextLine();
        String status = obj.nextLine().trim();
        String preExistingConditions = obj.nextLine().trim();
        String tier = obj.nextLine().trim();
        obj.close();

        float basePremium = 0;
        float risk = 0;
        float totalPremium = 0;

        
        if (age >= 18 && age <= 30) {
            if (tier.equalsIgnoreCase("basic")) 
                basePremium = 200;
            else if (tier.equalsIgnoreCase("standard")) 
                basePremium = 300;
            else if (tier.equalsIgnoreCase("premium")) 
                basePremium = 500;
        } else if (age > 30 && age <= 50) {
            if (tier.equalsIgnoreCase("basic"))
                 basePremium = 250;
            else if (tier.equalsIgnoreCase("standard")) 
                basePremium = 350;
            else if (tier.equalsIgnoreCase("premium")) 
                basePremium = 500; 
        } else if (age > 50 && age <= 65) {
            if (tier.equalsIgnoreCase("basic")) 
                basePremium = 350;
            else if (tier.equalsIgnoreCase("standard")) 
                basePremium = 450;
            else if (tier.equalsIgnoreCase("premium")) 
                basePremium = 700;
        } else {
            if (tier.equalsIgnoreCase("basic")) 
                basePremium = 400;
            else if (tier.equalsIgnoreCase("standard")) 
                basePremium = 550;
            else if (tier.equalsIgnoreCase("premium")) 
                basePremium = 800;
        }

        
        if (preExistingConditions.equalsIgnoreCase("yes") && status.equalsIgnoreCase("smoker")) {
            risk = basePremium *70/100.0f;
        } else if (preExistingConditions.equalsIgnoreCase("yes")) {
            risk = basePremium *30/100.0f;
        } else if (status.equalsIgnoreCase("smoker")) {
            risk = basePremium *40 / 100.0f;
        }

        totalPremium = basePremium+risk;

        System.out.println("Age: " + age);
        System.out.println("Smoking Status: " + status);
        System.out.println("Pre-existing Conditions: " + preExistingConditions);
        System.out.println("Coverage Tier: " + tier);
        System.out.println("Base Premium: " + basePremium);
        System.out.println("Risk Surcharge: " + risk);
        System.out.println("Total Monthly Premium: " + totalPremium);
    }
}
