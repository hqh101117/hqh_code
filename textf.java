import java.util.Scanner;

public class textf {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your selection (1-3): ");
            int option = scanner.nextInt();
            switch (option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
            default:
                System.out.println("Invalid option");
                break;
            }
        }
    }
}