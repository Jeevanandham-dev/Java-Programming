import java.util.Scanner;

public class AirlineTicketDynamicPricingSystem {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String classType = obj.nextLine();    
        int days = obj.nextInt();
        double seat = obj.nextDouble();
        obj.nextLine();
        String type = obj.nextLine();
        obj.close();

        float baseprice = 0;
        double demandMul = 0;
        double finalprice = 0;
        String price = "Low";

        if(classType.equalsIgnoreCase("Economy")){

            if(type.equalsIgnoreCase("Domestic"))
                baseprice = 200;
            if(type.equalsIgnoreCase("International-Short"))
                baseprice = 500;
            if(type.equalsIgnoreCase("International-Long"))
                baseprice = 800;
        }
        else if(classType.equalsIgnoreCase("Business")){
            if(type.equalsIgnoreCase("Domestic"))
                baseprice = 600;
            if(type.equalsIgnoreCase("International-Short"))
                baseprice = 1500;
            if(type.equalsIgnoreCase("International-Long"))
                baseprice = 2500;
        }
         else if(classType.equalsIgnoreCase("first")){
            if(type.equalsIgnoreCase("Domestic"))
                baseprice = 1000;
            if(type.equalsIgnoreCase("International-Short"))
                baseprice = 3000;
            if(type.equalsIgnoreCase("International-Long"))
                baseprice = 5000;
        }

        if(seat<30 && days<14){
            demandMul = 1.8;
            price = "High demand";
        }
        else if(seat<50 && days<30){
            demandMul = 1.5;
            price = "High demand";
        }
        else if(seat<60 || (days>=30 && days<=60 )){
            demandMul = 1.0;
            price = "Moderate";
        }
        else if(seat>=60 && days>60){
            demandMul = 0.8;
            price = "Low demand";
        }

        finalprice = baseprice*demandMul;

        System.out.println("Booking class: "+classType);
        System.out.println("Days Until Departure: "+days);
        System.out.println("Seat availability: "+ seat);
        System.out.println("Route Type: "+type);
        System.out.println("Demand Multiplier: "+demandMul);
        System.out.println("Final Ticket price: "+finalprice);
        System.out.println("Pricing Category: "+price);




    }
}
