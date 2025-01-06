import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();

        double totalAmount = pricePerKg * quantity;
        double discount = totalAmount * 0.10;
        double amountToPay = totalAmount - discount;

        System.out.printf("Total amount with discount: " + amountToPay);

        scanner.close();
    }
}
