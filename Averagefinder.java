import java.util.Scanner;

public class Averagefinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("This program will find the average of the\nfirst 5 integers the user will input.");
        System.out.println("");
        System.out.print("enter the 1st integer: ");
        double average1 = scanner.nextDouble();
        System.out.print("enter the 2nd integer: ");
        double average2 = scanner.nextDouble();
        System.out.print("enter the 3rd integer: ");
        double average3 = scanner.nextDouble();
        System.out.print("enter the 4th integer: ");
        double average4 = scanner.nextDouble();
        System.out.print("enter the 5th integer: ");
        double average5 = scanner.nextDouble();
        System.out.print(
                "The average is " + String.format("%.2f", (average1 + average2 + average3 + average4 + average5) / 5));
    }
}