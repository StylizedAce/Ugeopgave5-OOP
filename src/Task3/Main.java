package Task3;

import java.util.ArrayList;

public class Main {

    private static final ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        customers.add(new Customer("Jeremy Smith", "Jerith"));
        customers.add(new Customer("Jamal Johnson", "JhonnyBoy"));
        customers.add(new Customer("Micheal Reeves", "Mike101"));
        customers.add(new Customer("Mai Huttson", "Mayson2400"));
        customers.add(new Customer("Kamal Manakki", "Kam2200"));
        customers.add(new Customer("Omar Bunilli", "Omarius"));

        printCostumers();
    }

    public static void printCostumers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}