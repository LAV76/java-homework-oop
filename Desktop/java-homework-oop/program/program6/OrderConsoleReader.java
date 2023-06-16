import java.util.Scanner;

public class OrderConsoleReader {

    public Order readOrderFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Client name: ");
        String clientName = scanner.nextLine();

        System.out.print("Product: ");
        String product = scanner.nextLine();

        System.out.print("Quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.print("Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        return new Order(clientName, product, quantity, price);
    }
}

