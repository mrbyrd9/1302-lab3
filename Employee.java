/* Decompiler 3ms, total 80ms, lines 37 */
package lab3;

public class Employee extends StaffMember implements Comparable<Employee> {
   protected String socialSecurityNumber;
   protected double payRate;

   public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
      super(eName, eAddress, ePhone);
      this.socialSecurityNumber = socSecNumber;
      this.payRate = rate;
   }

   public String toString() {
      String result = super.toString();
      result = result + "\nSocial Security Number: " + this.socialSecurityNumber;
      return result;
   }

   public double pay() {
      return this.payRate;
   }

   public int compareTo(Employee other) {
      if (this.payRate == other.payRate) {
         return 0;
      } else {
         return this.payRate > other.payRate ? 1 : -1;
      }
   }

   // $FF: synthetic method
   // $FF: bridge method
   public int compareTo(Object var1) {
      return this.compareTo((Employee)var1);
   }
}
