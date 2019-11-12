//Decimal.java

import java.lang.StringBuilder;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Zhenia Steger
 *
 */
public class Decimal {
/**
 * Decimal class converts decimal format numbers to binary and hexadecimal
 * @param decimal is the decimal to be converted
 * @return converted decimal in binary or hexadecimal notation
 */
    private PrintWriter pw;
    private int decimal;
    private int remainder;
    Scanner scan = new Scanner(System.in);
    StringBuilder binaryString = new StringBuilder();
    StringBuilder hexString = new StringBuilder();
    String[] charArray = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};

    /**
     * Decimal class constructor. PrintWriter as parameter for access to PrintWriter
     */
    public Decimal (PrintWriter pw) {
        this.pw = pw;
    }
    /**
     * Wrapper method for decimal to binary conversion
     */
    public void decToBin() {
        getDec();
        toBin();
        outBin();
    }
    /**
     * Wrapper method for decimal to hexadecimal conversion
     */
    public void decToHex() {
        getDec();
        toHex();
        outHex();
    }
    /**
     * Gets decimal input from the user and stores into decimal parameter
     * @param decimal parameter to be converted
     */
    private void getDec() {
        System.out.println("Enter a Decimal Number:");
        decimal = scan.nextInt();
    }
    /**
     * Performs conversion to binary
     */
    private void toBin() {
        while (decimal != 0) {
            binaryString.insert(0, decimal % 2);
            decimal /= 2;
        }
    }
    /**
     * Performs conversion to hexadecimal
     */
    private void toHex() {
        while (decimal != 0) {
            remainder = decimal % 16;
            hexString.insert(0, charArray[remainder]);
            decimal /= 16;
        }
    }
    /**
     * Outputs Binary representation to terminal and file
     * Clears StringBuilder
     */
    private void outBin() {
        System.out.println(binaryString.toString());
        pw.println(binaryString);
        binaryString.setLength(0);
    }
    /**
     * Outputs Hexadecimal representation to terminal and file
     * Clears StringBuilder
     */
    private void outHex() {
        System.out.println(hexString.toString());
        pw.println(hexString);
        hexString.setLength(0);
    }
}
