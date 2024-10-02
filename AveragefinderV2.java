import java.util.Scanner;

public class AveragefinderV2 {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter the no. of times to execute command: ");
        int execute = sc1.nextInt();
        double sum = 0;
        int origexecute = execute;
        int counter = 1;

do {
    
  System.out.print("(" + counter + ") " + "enter a number: ");
  double num = sc1.nextDouble();
  sum += num;
  execute--;
  counter++;
}
while (execute > 0);

double average = (double) sum/origexecute;
System.out.println("The average is: " + average);

sc1.close();
    }
}
