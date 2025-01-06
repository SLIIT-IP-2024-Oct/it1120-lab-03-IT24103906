import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in rupees: ");
        int amount = scanner.nextInt();

        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] notesCount = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++) {
            notesCount[i] = amount / denominations[i];
            amount %= denominations[i];
        }

        for (int i = 0; i < denominations.length; i++) {
            System.out.println(denominations[i] + " Notes – " + notesCount[i]);
        }

        scanner.close();
    }
}
