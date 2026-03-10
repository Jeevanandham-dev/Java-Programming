import java.util.Scanner;

public class HospitalEmergencyTriageSystem {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int heartRate = obj.nextInt();
        obj.nextLine();
        String bloodPressure = obj.next();
        String[] parts = bloodPressure.split("/");
        int systolic = Integer.parseInt(parts[0]);  
        int diastolic = Integer.parseInt(parts[1]);
        double temperature = obj.nextDouble();
        obj.nextLine();
        String severity = obj.nextLine();


        String triagePriority;
        int waitTime;
        String action;

        
        if (heartRate < 50 || heartRate > 130 ||
            systolic > 180 || systolic < 90 ||
            temperature > 103 || temperature < 96 ||
            severity.equalsIgnoreCase("Life-Threatening")) {
            triagePriority = "Critical";
            waitTime = 0;
            action = "Immediate Emergency Care";
        } else if ((heartRate >= 50 && heartRate <= 60) || (heartRate >= 110 && heartRate <= 130) ||
                   (systolic >= 160 && systolic <= 180) || (systolic >= 90 && systolic <= 100) ||
                   (temperature >= 101 && temperature <= 103) || (temperature >= 96 && temperature <= 97) ||
                   severity.equalsIgnoreCase("Severe")) {
            triagePriority = "Urgent";
            if (heartRate==55 || systolic == 95 || temperature == 96.8) {
                waitTime = 20;
            } else {
                waitTime = 15;
            }
            action = "Priority Medical Attention";
        } else if (severity.equalsIgnoreCase("Moderate") &&
                   heartRate >= 60 && heartRate <= 100 &&
                   systolic >= 100 && systolic <= 140 &&
                   temperature >= 97 && temperature <= 100) {
            triagePriority = "Standard";
            waitTime = 45;
            action = "Standard Examination";
        } else {
            triagePriority = "Non-Urgent";
            waitTime = 90;
            action = "Routine Check-up";
        }

        System.out.println("\nHeart Rate: " + heartRate + " bpm");
        System.out.println("Blood Pressure: " + systolic + "/" + diastolic);
        System.out.println("Temperature: " + temperature + "°F");
        System.out.println("Symptom Severity: " + severity);
        System.out.println("Triage Priority: " + triagePriority);
        System.out.println("Estimated Wait Time: " + waitTime + " minutes");
        System.out.println("Recommended Action: " + action);
        





        


    }
}
