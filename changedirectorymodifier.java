import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class changedirectorymodifier {
    public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    String address = "";
do {
    System.out.print("Enter the address to convert: ");
    address = in.nextLine();

    if (!address.equals("return")) {

    String modifiedaddress = address.replace("\\", "/");
    modifiedaddress = modifiedaddress.replace(":", "");
    modifiedaddress = "/" + modifiedaddress;



    try (BufferedWriter writer = new BufferedWriter(new FileWriter("random-stuff-i-did-at-school/modifiedadressoutput.txt"))) { 
     writer.write(modifiedaddress);   
     System.out.println("Address successfully writen to file: \"" + modifiedaddress + "\"");
    } catch (IOException e) {
        System.err.println("Error writing to file: " + e.getMessage());
    }
} 
} while (!address.equals("return"));
    in.close();
    }
}