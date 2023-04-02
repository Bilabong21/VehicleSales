import java.util.Scanner;
import java.text.DecimalFormat;
public class TestVehicleSales

{
    private static double INTEREST_RATE = 0.065;
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
       // DecimalFormat df = new DecimalFormat("####.00");
      DecimalFormat df = new DecimalFormat("####.00");
      String model;
        int year;
        double price;
        int term;

        System.out.println("Please enter the vehicle: ");
        model = kb.nextLine();
        System.out.println("Please enter the year: ");
        year =kb.nextInt();
        System.out.println("Please enter the vehicle price: ");
        price = kb.nextDouble();
        System.out.println("Please enter the repayment term (60 or 72 months):");
        term = kb.nextInt();

        VehicleSales sales = new VehicleSales(model,year,price,term);
		
		 
		
        System.out.println("=====================================");
        System.out.println("\t\tLoan Repayment Details ");
        System.out.println("=====================================");
        System.out.println("Model :" + model);
        System.out.println("Year :" + year);
        System.out.println("Principal debt R:" + df.format(price));
        System.out.println("Term :" + term +" months");
        System.out.println("Interest Rate :"+ INTEREST_RATE + "%");
        System.out.println("Total interest :"+ df.format(sales.getTotalInterest()));
        System.out.println("Overall debt :" + df.format(sales.getOverallDebt()) );
        System.out.println("Monthly Instalment R:"+ df.format(sales.getMonthlyInstalment()));
        System.out.println("=====================================");


    }
}
