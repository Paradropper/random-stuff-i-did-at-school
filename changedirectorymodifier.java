import java.util.Scanner;

public class changedirectorymodifier {
    public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    System.out.print("Enter the address to convert: ");
    String address = in.nextLine();

    String modifiedaddress = address.replace("\\", "/");
    modifiedaddress = modifiedaddress.replace(":", "");
    modifiedaddress = "/" + modifiedaddress;

    System.out.println("");
    System.out.println(modifiedaddress);
    System.out.println("");

    in.close();
    }
}