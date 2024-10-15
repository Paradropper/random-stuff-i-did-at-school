import java.util.Scanner;
public class Greaterequalorlesser{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    Scanner in2 = new Scanner(System.in);
    String command = "";
   
    do{
    System.out.println("Type \"start\" to start the program, type \"quit\" to terminate it.");
    command = in2.nextLine();
    
    if (command.equals("start")) {
    System.out.print("enter a number: ");
    int num1 = in.nextInt();
    System.out.print("enter another number: ");
    int num2 = in.nextInt();
    
    if (num1 == num2){
        System.out.println("the 2nd number is equal to the first");
        System.out.println(" ");
    } else if (num1 > num2) {
        System.out.println("the 2nd number is less than the first");
        System.out.println(" ");
    } else {
        System.out.println("the 2nd number is greater than the first.");
        System.out.println(" ");
        
    }
        
    } else if (command.equals("quit")) 
        {System.out.print("quitting...");
        } else { 
            System.out.println("error");
            System.out.println(" ");
    }
    } while (!command.equals("quit"));
    in.close();
    in2.close();
}
    
}