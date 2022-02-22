/* Decompiler 2ms, total 70ms, lines 26 */
package lab3;

public class Hourly extends Employee {
   protected int hoursWorked = 0;

   public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
      super(eName, eAddress, ePhone, socSecNumber, rate);
   }

   public void addHours(int moreHours) {
      this.hoursWorked += moreHours;
   }

   public double pay() {
      double payment = this.payRate * (double)this.hoursWorked;
      this.hoursWorked = 0;
      return payment;
   }

   public String toString() {
      String result = super.toString();
      result = result + "\nCurrent hours: " + this.hoursWorked;
      return result;
   }
}
