import java.util.Scanner;

public class IT24103906 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();
        
        double totalAmount = pricePerKg * quantity;
        
        System.out.printf("The total amount is: " + totalAmount);
        
        scanner.close();
    }
}
