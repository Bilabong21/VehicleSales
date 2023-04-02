public class VehicleSales
{
   private static double INTEREST_RATE = 0.065;
   private String model;
   private int year;
   private int term;
   private double principaDebt; 
   private double totalInterest;
   private double overallDebt;
   private double monthlyInstalment;

   public VehicleSales(String model,int year,double price,int repaymentTerm)
   {
     this.model = model;
     this.year = year;
     price = principaDebt;
     term = repaymentTerm;
   }
   public  String getModel()
   {
       return model;
   }
   public int getYear()
   {
       return year;
   }
   public double getPrincipaDebt()
   {
       return principaDebt;
   }
   public double getTotalInterest()
   {
       return totalInterest;
   }
   public double getOverallDebt()
   {
       return overallDebt;
   }
   public double getMonthlyInstalment()
   {
       return monthlyInstalment;
   }
   public void calcTotalInterest()
   {
       totalInterest= principaDebt * INTEREST_RATE *  year;

   }
   public void calcOverallDebt()
   {
      overallDebt = principaDebt + totalInterest;
   }
   public void calcMonthlyInstalment()
   {
       monthlyInstalment = overallDebt/term;
   }
 