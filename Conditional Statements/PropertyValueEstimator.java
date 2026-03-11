import java.util.Scanner;

public class PropertyValueEstimator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String locationTier = sc.nextLine();
        int squareFootage = sc.nextInt();
        int propertyAge = sc.nextInt();
        int amenityScore = sc.nextInt();
        double basePricePerSqFt = 0.0;
 
        if (locationTier.equalsIgnoreCase("Prime")) 
            basePricePerSqFt = 400.0;
        if (locationTier.equalsIgnoreCase("Urban")) 
            basePricePerSqFt = 300.0;
        if (locationTier.equalsIgnoreCase("Suburban")) 
            basePricePerSqFt = 180.0;
        if (locationTier.equalsIgnoreCase("Rural")) 
            basePricePerSqFt = 100.0;
        
        double baseValue = squareFootage * basePricePerSqFt;

        double ageAdjustmentPercent = 0.0;
        if (propertyAge >= 0 && propertyAge <= 5) {
            ageAdjustmentPercent =0.0;
        }
        if (propertyAge >=6 && propertyAge<=15) {
            double factor = (propertyAge-6)/9.0; 
            ageAdjustmentPercent = -(5+factor*5);
        }
        if (propertyAge >= 16 && propertyAge <= 30) {
            double factor = (propertyAge - 16) / 14.0; 
            ageAdjustmentPercent = -(15 + factor * 5);
        }
        if (propertyAge >= 31) {
            double factor = Math.min((propertyAge-31)/69.0,1.0); 
            ageAdjustmentPercent = -(25 + factor * 10);
        }

        double adjustedValue = baseValue * (1 + ageAdjustmentPercent / 100);     
        double amenityBonus = 0.0;

        if (amenityScore >= 80) {
            amenityBonus = baseValue * 0.10;
        } else if (amenityScore >= 60) {
            amenityBonus = baseValue * 0.05;
        } else if (amenityScore >= 40) {
            amenityBonus = baseValue * 0.02;
        }

        double finalValue = adjustedValue + amenityBonus;

        String marketCategory;
        if ((locationTier.equalsIgnoreCase("Prime") || locationTier.equalsIgnoreCase("Urban")) && propertyAge < 15) {
            marketCategory = "Hot";
        } else if (locationTier.equalsIgnoreCase("Suburban")) {
            marketCategory = "Stable";
        } else {
            marketCategory = "Slow";
        }
        
        System.out.println("Location Tier: " +locationTier);
        System.out.println("Square Footage: " +squareFootage);
        System.out.println("Property Age: " +propertyAge );
        System.out.println("Amenity Score: " +amenityScore);
        System.out.println("Base Price Per Sq Ft: " +basePricePerSqFt);
        System.out.println("Age Adjustment: "+ageAdjustmentPercent);
        System.out.println("Amenity Bonus: "+amenityBonus);
        System.out.println("Estimated Property Value: " +finalValue);
        System.out.println("Market Category: " +marketCategory);

        sc.close();
    }
}
