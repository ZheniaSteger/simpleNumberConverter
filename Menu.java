//Menu.java

import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Zhenia Steger
 *
 */
public class Menu {
/**
 * Menu class presents the user with a menu to select a conversion
 * @param hexadec is the hexadecimal string to be converted
 * @return converted hexadecimal to decimal or binary notation
 */
    int sel;
    private PrintWriter pw;
    Scanner scan = new Scanner(System.in);
    /**
     * Menu constructor
     */
    public Menu(PrintWriter pw) {
        this.pw = pw;
    }
    /**
     * Displays a menu for conversions
     */
    public void display() {
        System.out.println("\nNumber Converter");
        System.out.println("Which conversion to perform?");
        System.out.println("1. Decimal to Binary"+"\n2. Decimal to Hexadecimal");
        System.out.println("3. Binary to Decimal"+"\n4. Binary to Hexadecimal");
        System.out.println("5. Hexadecimal to Decimal"+"\n6. Hexadecimal to Binary");
        System.out.println("7. to EXIT");
    }
    /**
     * Gets input from user to which coversion to perform
     */
    public int getSelection() {
        System.out.println("Select a conversion:");
        try {
            sel = scan.nextInt();
        } catch (Exception e) {
            System.out.println("\nNot a Valid Choice");
            System.exit(1);
        }
        return sel;
    }
}
