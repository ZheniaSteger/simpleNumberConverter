//Hexadecimal.java

import java.lang.StringBuilder;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Zhenia Steger
 *
 */
public class Hexadecimal {
/**
 * Hexadecimal class converts hexadecimal format numbers to decimal and binary
 * @param hexadec is the hexadecimal string to be converted
 * @return converted hexadecimal to decimal or binary notation
 */
    private PrintWriter pw;
    private int decimal;
    private String hexadec;
    private int j = 0;
    Scanner scan = new Scanner(System.in);
    StringBuilder binString = new StringBuilder();

    /**
    * Hexadecimal class constructor. PrintWriter as parameter for access to PrintWriter
    */
    public Hexadecimal (PrintWriter pw) {
        this.pw = pw;
    }
    /**
     * Wrapper method for hexadecimal to decimal conversion
     */
    public void hexToDec() {
        getHex();
        toDec();
        outDec();
    }
    /**
     * Wrapper method for hexadecimal to binary conversion
     */
    public void hexToBin() {
        getHex();
        toBin();
        outBin();
    }
    /**
     * Gets hexadecimal input from the user and stores into hexadec parameter
     * @param hexadec parameter to be converted
     */
    private void getHex() {
        System.out.println("Enter a Hexadecimal Number:");
        hexadec = scan.nextLine();
    }
    /**
     * Performs conversion to decimal
     */
    private void toDec() {
        for (int i = hexadec.length()-1; i >= 0; i--) {
            if (hexadec.charAt(j) == '1') {
            decimal += 1*Math.pow(16, i);}
            else if (hexadec.charAt(j) == '2') {
            decimal += 2*Math.pow(16, i);}
            else if (hexadec.charAt(j) == '3') {
            decimal += 3*Math.pow(16, i);}
            else if (hexadec.charAt(j) == '4') {
            decimal += 4*Math.pow(16, i);}
            else if (hexadec.charAt(j) == '5') {
            decimal += 5*Math.pow(16, i);}
            else if (hexadec.charAt(j) == '6') {
            decimal += 6*Math.pow(16, i);}
            else if (hexadec.charAt(j) == '7') {
            decimal += 7*Math.pow(16, i);}
            else if (hexadec.charAt(j) == '8') {
            decimal += 8*Math.pow(16, i);}
            else if (hexadec.charAt(j) == '9') {
            decimal += 9*Math.pow(16, i);}
            else if (hexadec.charAt(j) == 'A') {
            decimal += 10*Math.pow(16, i);}
            else if (hexadec.charAt(j) == 'B') {
            decimal += 11*Math.pow(16, i);}
            else if (hexadec.charAt(j) == 'C') {
            decimal += 12*Math.pow(16, i);}
            else if (hexadec.charAt(j) == 'D') {
            decimal += 13*Math.pow(16, i);}
            else if (hexadec.charAt(j) == 'E') {
            decimal += 14*Math.pow(16, i);}
            else if (hexadec.charAt(j) == 'F') {
            decimal += 15*Math.pow(16, i);}
            else{}
            j++;
        }
    }
    /**
     * Performs conversion to binary
     */
    private void toBin() {
        for (int i = hexadec.length()-1; i >= 0; i--) {
            if (hexadec.charAt(i) == '0') {
            binString.insert(0, "0000 ");}
            else if (hexadec.charAt(i) == '1') {
            binString.insert(0, "0001 ");}
            else if (hexadec.charAt(i) == '2') {
            binString.insert(0, "0010 ");}
            else if (hexadec.charAt(i) == '3') {
            binString.insert(0, "0011 ");}
            else if (hexadec.charAt(i) == '4') {
            binString.insert(0, "0100 ");}
            else if (hexadec.charAt(i) == '5') {
            binString.insert(0, "0101 ");}
            else if (hexadec.charAt(i) == '6') {
            binString.insert(0, "0110 ");}
            else if (hexadec.charAt(i) == '7') {
            binString.insert(0, "0111 ");}
            else if (hexadec.charAt(i) == '8') {
            binString.insert(0, "1000 ");}
            else if (hexadec.charAt(i) == '9') {
            binString.insert(0, "1001 ");}
            else if (hexadec.charAt(i) == 'A') {
            binString.insert(0, "1010 ");}
            else if (hexadec.charAt(i) == 'B') {
            binString.insert(0, "1011 ");}
            else if (hexadec.charAt(i) == 'C') {
            binString.insert(0, "1100 ");}
            else if (hexadec.charAt(i) == 'D') {
            binString.insert(0, "1101 ");}
            else if (hexadec.charAt(i) == 'E') {
            binString.insert(0, "1110 ");}
            else if (hexadec.charAt(i) == 'F') {
            binString.insert(0, "1111 ");}
            else{}
        }
    }
    /**
     * Outputs Decimal to terminal and file
     */
    private void outDec() {
        System.out.println(decimal);
        pw.println(decimal);
        decimal = 0;
        j = 0;;
    }
    /**
     * Outputs Binary to terminal and file
     */
    private void outBin() {
        System.out.println(binString);
        pw.println(binString);
        binString.setLength(0);
    }
}
