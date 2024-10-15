import java.util.Scanner;

public class stringchanger {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //variable storage
        String command = "";
        String h = "none";
        String e = "none";
        String m = "none";
        String r = "none";
        String o = "none";
        String n = "none";
        String redef = "";
        String errormsg = "unknown command";
        //////////////////

    do{
        System.out.print("enter a command: ");
        command = in.nextLine();
    
    if (command.equals("deflist")) { //shows current definitions of each string
        System.out.println("h = " + "\"" + h + "\"");
        System.out.println("e = " + "\"" + e + "\"");
        System.out.println("m = " + "\"" + m + "\"");
        System.out.println("r = " + "\"" + r + "\"");
        System.out.println("o = " + "\"" + o + "\"");
        System.out.println("n = " + "\"" + n + "\"");

    
        } else if (command.equals("redef")) { //shows the prompt for which variable to redefine
             System.out.print("variable to redefine: ");
             redef = in.nextLine();

                //asks for new definition of each variable
                if (redef.equals("h")) {
                    System.out.print("Input new definition of h: ");
                    h = in.nextLine();
                    } else if(redef.equals("e")) {
                        System.out.print("Input new definition of e: ");
                        e = in.nextLine();
                    } else if(redef.equals("m")) {
                        System.out.print("Input new definition of m: ");
                        m = in.nextLine();
                    } else if(redef.equals("r")) {
                        System.out.print("Input new definition of r: ");
                        r = in.nextLine();
                    } else if(redef.equals("o")) {
                        System.out.print("Input new defintion of o: ");
                        o = in.nextLine();
                    } else if(redef.equals("n")) {
                        System.out.print("Input new definition of n: ");
                        n = in.nextLine();
                    } else if (redef.equals("available")) {
                        System.out.print("available variables are \"h\", \"e\", \"m\", \"r\", \"o\", \"n\".");
                        } else if (redef.equals("all")) { //asks for new definitions for all variables
                            System.out.print("Input new definition of h: ");
                            h = in.nextLine();
                            System.out.print("Input new definition of e: ");
                            e = in.nextLine();
                            System.out.print("Input new definition of m: ");
                            m = in.nextLine();
                            System.out.print("Input new definition of r: ");
                            r = in.nextLine();
                            System.out.print("Input new defintion of o: ");
                            o = in.nextLine();
                            System.out.print("Input new definition of n: ");
                            n = in.nextLine();

                    } else if(redef.equals("help")) { //help command
                    System.out.println("List of available commands under \"redef\".");
                    System.out.println("To select a varaible, input the name of the variable that is to be redefined.");
                    System.out.println("available: gives all the available variables.");
                    System.out.println("all: redefines all available variables one by one");
                
                } else { // error message
                    System.out.println(errormsg);
                    System.out.println(" ");
                    }


             System.out.println("");
             //end of definitions

            } else if (command.equals("help")) { //help command
                System.out.println("command list:");
                System.out.println("deflist: shows current definitions of each string");
                System.out.println("redef: initiates the prompt to redefine a string");
                System.out.println("quit: terminates the program");
            } else if (command.equals("quit")){ //quit command
                System.out.print("Quitting...");
            
            } else { // error messaage
                System.out.println("unknown command, type \"help\" to show a list of available commands.");
                System.out.println(" ");
            }
            
            
            
            
    
    } while (!command.equals("quit"));

    in.close();
    }
}