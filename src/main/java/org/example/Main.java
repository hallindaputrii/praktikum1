import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        option();
    }

    static void option() {
        System.out.println("===== Library System =====");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose option (1-3): ");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                option1();
                break;
            case 2:
                option2();
                break;
            case 3:
                System.out.println("EXIT");
                break;
            default:
                System.out.println("Invalid option");
        }
        scanner.close();
    }

    static void option1() {
        Scanner scanner = new Scanner(System.in);
        String NIM;

        do {
            System.out.print("Enter your NIM : ");
            NIM = scanner.nextLine();

            if (NIM.length() == 15 && NIM.matches("\\d+")) {
                System.out.println("Successful login as Student");
            } else {
                System.out.println("Invalid NIM. Please enter a valid 15-digit numeric NIM.");
            }
        } while (NIM.length() != 15 || !NIM.matches("\\d+"));

        scanner.close();
    }

    static void option2() {
        Scanner scanner = new Scanner(System.in);

        String userName;
        String password;

        do {
            System.out.print("Enter your username (admin): ");
            userName = scanner.nextLine();

            System.out.print("Enter your password (admin): ");
            password = scanner.nextLine();

            if (userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
                System.out.println("Successful login as admin");
                break;

            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        } while (true);

        scanner.close();
    }
}