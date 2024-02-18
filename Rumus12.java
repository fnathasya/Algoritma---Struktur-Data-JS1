import java.util.Scanner;

public class Rumus12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("========");
            System.out.println("| MENU |");
            System.out.println("=========================");
            System.out.println("| 1. CALCULATE SPEED    |");
            System.out.println("| 2. CALCULATE DISTANCE |");
            System.out.println("| 3. CALCULATE TIME     |");
            System.out.println("| 4. EXIT               |");
            System.out.println("=========================");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateSpeed(scanner);
                    break;
                case 2:
                    calculateDistance(scanner);
                    break;
                case 3:
                    calculateTime(scanner);
                    break;
                case 4:
                    System.out.println("================");
                    System.out.println("| THANK YOU!!! |");
                    System.out.println("================");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        } while (choice != 4);

        scanner.close();
    }

    public static void calculateSpeed(Scanner scanner) {
        System.out.println("===================");
        System.out.println("| CALCULATE SPEED |");
        System.out.println("===================");

        System.out.print("Enter Distance (in km): ");
        double distance = scanner.nextDouble();
        System.out.print("Enter Time (in hours): ");
        double time = scanner.nextDouble();

        double speed = distance / time;

        System.out.println("=========================");
        System.out.println(" THE SPEED IS : " + speed + " km/h");
        System.out.println("=========================");

    }

    public static void calculateDistance(Scanner scanner) {
        System.out.println("======================");
        System.out.println("| CALCULATE DISTANCE |");
        System.out.println("======================");

        System.out.print("Enter speed (in km/h): ");
        double speed = scanner.nextDouble();
        System.out.print("Enter time (in hours): ");
        double time = scanner.nextDouble();

        double distance = speed * time;
        System.out.println("=========================");
        System.out.println("THE DISTANCE IS : " + distance + " km");
        System.out.println("=========================");

    }

    public static void calculateTime(Scanner scanner) {
        System.out.println("==================");
        System.out.println("| CALCULATE TIME |");
        System.out.println("==================");

        System.out.print("Enter distance (in km): ");
        double distance = scanner.nextDouble();
        System.out.print("Enter speed (in km/h): ");
        double speed = scanner.nextDouble();

        double time = distance / speed;
        System.out.println("=========================");
        System.out.println("THE TIME IS : " + time + " hours");
        System.out.println("=========================");
    }
}
