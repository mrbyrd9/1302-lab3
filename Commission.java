/* Decompiler 8ms, total 230ms, lines 30 */
package lab3;

public class Commission extends Hourly {
   protected double totalSales;
   protected double comRate;

   public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comRate) {
      super(eName, eAddress, ePhone, socSecNumber, rate);
      this.comRate = comRate;
   }

   public void addSales(double totalSales) {
      this.totalSales += totalSales;
   }

   public double pay() {
      double payment = this.payRate * (double)this.hoursWorked;
      payment += this.totalSales * this.comRate;
      this.totalSales = 0.0D;
      this.hoursWorked = 0;
      return payment;
   }

   public String toString() {
      String result = super.toString();
      result = result + "\nTotal Sales: " + this.totalSales;
      return result;
   }
}
