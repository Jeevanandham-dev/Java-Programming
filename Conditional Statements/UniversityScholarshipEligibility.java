import java.util.Scanner;

public class UniversityScholarshipEligibility {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double gpa = obj.nextDouble();
        double famInc = obj.nextDouble();
        int exScore = obj.nextInt();
        obj.nextLine();
        String schType = obj.nextLine();
        obj.close();

        double amt = 0;
        String category = "None";
        String Eli = "Not eligible";

        if(gpa>=2.5){
            Eli = "Eligible";
            if(schType.equalsIgnoreCase("merit")){
            if(gpa>=3.0 && exScore>=60){
                amt = 8000;
                category = "Minimal";
            }
            if(gpa>=3.5 && exScore>=70){
                amt = 15000;
                category = "Partial";
            }
            if(gpa>=3.8 && exScore>=80){
                amt = 20000;
                category = "Full";
            }
        }
        if(schType.equalsIgnoreCase("need-based")){
            if(gpa>=2.8 && famInc<=70000){
                amt = 10000;
                category = "Minimal";
            }
            if(gpa>=3.0 && famInc<=50000){
                amt = 18000;
                category = "Partial";
            }
            if(gpa>=3.5 && famInc<=30000){
                amt = 30000;
                category = "Full";   
            }
        }
        if(schType.equalsIgnoreCase("sports")){
            if(gpa>=2.5 && exScore>=65){
                amt = 12000;
                category = "Minimal";
            }
            if(gpa>=2.8 && exScore>=75){
                amt = 20000;
                category = "Partial";
            }
            if(gpa>=3.0 && exScore>=85){
                amt = 22000;
                category = "Full";
            }
        }
    }
        
    
        System.out.println("GPA: "+gpa);
        System.out.println("Family Income: "+famInc);
        System.out.println("Extracurricular Score:"+exScore);
        System.out.println("Scholarship type: "+schType);
        System.out.println("Eligibility: "+ Eli);
        System.out.println("Award amount: "+amt);
        System.out.println("Award Category: "+category);

}
}
