/* Decompiler 3ms, total 69ms, lines 21 */
package lab3;

public class Firm {
   public static void main(String[] args) {
      Staff personnel = new Staff();
      personnel.payday();
      System.out.println(((Employee)personnel.getStaff(7)).compareTo((Employee)personnel.getStaff(6)));
      if (((Employee)personnel.getStaff(6)).compareTo((Employee)personnel.getStaff(7)) == 0) {
         System.out.println("Mary was paid the same as Joe.");
      } else if (((Employee)personnel.getStaff(6)).compareTo((Employee)personnel.getStaff(7)) == 1) {
         System.out.println("Mary was paid more than Joe.");
      } else {
         System.out.println("Mary was paid less than Joe.");
      }

      ((Hourly)personnel.getStaff(6)).addHours(25);
      ((Commission)personnel.getStaff(6)).addSales(800.0D);
      personnel.payday();
   }
}
