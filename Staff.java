/* Decompiler 5ms, total 82ms, lines 42 */
package lab3;

public class Staff {
   private StaffMember[] staffList = new StaffMember[8];

   public Staff() {
      this.staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07D);
      this.staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15D);
      this.staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23D);
      this.staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55D);
      this.staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
      this.staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");
      this.staffList[6] = new Commission("Mary", "100 Friend Rd.", "555-9876", "123-98-5438", 6.25D, 0.2D);
      this.staffList[7] = new Commission("Joe", "200 Pal Place", "555-6666", "999-99-1111", 9.75D, 0.15D);
      ((Hourly)this.staffList[6]).addHours(35);
      ((Commission)this.staffList[6]).addSales(400.0D);
      ((Hourly)this.staffList[7]).addHours(40);
      ((Commission)this.staffList[7]).addSales(950.0D);
      ((Executive)this.staffList[0]).awardBonus(500.0D);
      ((Hourly)this.staffList[3]).addHours(40);
   }

   public void payday() {
      for(int count = 0; count < this.staffList.length; ++count) {
         System.out.println(this.staffList[count]);
         double amount = this.staffList[count].pay();
         if (amount == 0.0D) {
            System.out.println("Thanks!");
         } else {
            System.out.println("Paid: " + amount);
         }

         System.out.println("-----------------------------------");
      }

   }

   public StaffMember getStaff(int i) {
      return this.staffList[i];
   }
}
