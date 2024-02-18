import java.util.Scanner;

public class PlatMobil12 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] plateCode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        String[][] cities = {
                {"BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR","PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"}};

        boolean found = false;

        while (!found) {
            System.out.print("Enter the plate code: ");
            char code = sc.next().toUpperCase().charAt(0); 
            for (int i = 0; i < plateCode.length; i++) {
                if (code == plateCode[i]) {
                    System.out.println("City: " + cities[0][i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Plate code not found. Please try again.");
            }
        }
    }
}
