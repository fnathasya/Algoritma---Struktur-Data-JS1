import java.util.Scanner;

public class SIAKAD12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double counter = 0;
        double score[][] = new double[8][2];
        String grades[] = new String[8];
        String courses[] = {"Pancasila", "Information Technology Concept", "Critical Thinking and Problem Solving",
        "Basic Mathematic", "English", "basic programming", "basic programming Practicum","Occupational Health and Safety"};

        System.out.println("===============================");
        System.out.println("SEMESTER IP CALCULATION PROGRAM");
        System.out.println("===============================");

        for (int i = 0; i < courses.length; i++) {
            System.out.print("Score For "+ courses[i]+ " : ");
            score[i][0] = sc.nextDouble();
            grades[i] = grades(score[i][0]);
            score[i][1] = creditsCourse(grades[i]);

            if (i == 7) {
                counter += (score[i][1] * 3);
            } else {
                counter += (score[i][1] * 2);
            }
        }
        System.out.println("=========================");
        System.out.println("VALUE CONVERSION RESULTS");
        System.out.println("==============================================================================================");
        System.out.printf("%-44s%-15s%-12s%-13s%n", "COURSES", "SCORE", "GRADE", "CREDITS COURSE");
        System.out.println(
                "==============================================================================================");

        for(int i = 0; i < courses.length; i++){
            System.out.printf("%-44s%-16s%-14s%-15s%n", courses[i], score[i][0], grades[i], score[i][1]);
        }
        System.out.println("==============================================================================================");
        System.out.printf("IP : %.2f", (counter / 19));

    }
    static String grades(double a) {
        String grade = "";
        if (a >= 80 && a <= 100) {
            grade = "A";
        } else if (a >= 73 && a < 80) {
            grade = "B+";
        } else if (a >= 65 && a < 73) {
            grade = "B";
        } else if (a >= 60 && a < 65) {
            grade = "C+";
        } else if (a >= 50 && a < 60) {
            grade = "C";
        } else if (a >= 39 && a < 50) {
            grade = "D";
        } else if (a < 39) {
            grade = "E";
        } else {
            grade = null;
        }
        return grade;
    }

    static double creditsCourse(String a) {
        double cc = 0;
        switch (a) {
            case "A":
                cc = 4;
                break;
            case "B+":
                cc = 3.5;
                break;
            case "B":
                cc = 3;
                break;
            case "C+":
                cc = 2.5;
                break;
            case "C":
                cc = 2;
                break;
            case "D":
                cc = 1;
                break;
            case "E":
                cc = 0;
                break;

            default:
                break;
        }
        return cc;
    }
    
}