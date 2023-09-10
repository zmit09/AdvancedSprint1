import java.util.ArrayList;

public class DemoClass {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("Alice", "Premium");
        Customer customer2 = new Customer("Bob", "Gold");
        Customer customer3 = new Customer("Charlie", "Silver");
        Customer customer4 = new Customer("David", "Regular");
        Customer customer5 = new Customer("Eve", "Gold");

        // Create visits
        Visit visit1 = new Visit(customer1, 100.0, 50.0);
        Visit visit2 = new Visit(customer2, 80.0, 60.0);
        Visit visit3 = new Visit(customer3, 120.0, 40.0);
        Visit visit4 = new Visit(customer4, 90.0, 70.0);
        Visit visit5 = new Visit(customer5, 110.0, 55.0);

        // Create an array list to store customers and their visits
        ArrayList<Visit> visits = new ArrayList<>();
        visits.add(visit1);
        visits.add(visit2);
        visits.add(visit3);
        visits.add(visit4);
        visits.add(visit5);

        // Display total bills for each visit
        for (Visit visit : visits) {
            System.out.println("Customer: " + visit.customer.getName());
            System.out.println("Total Bill: $" + visit.getTotalExpense());
            System.out.println();
        }
    }
}
