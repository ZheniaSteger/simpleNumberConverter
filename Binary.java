//Binary.java

import java.lang.StringBuilder;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Zhenia Steger
 *
 */
public class Binary {
/**
 * Binary class converts binary numbers to decimal and hexadecimal.
 * @param binary is the binary string to be converted
 * @return converted binary in decimal or hexadecimal notation
 */
    private PrintWriter pw;
    private int decimal;
    private int pow;
    private String binary;
    private StringBuilder hexadec = new StringBuilder();
    Scanner scan = new Scanner(System.in);

    /**
     * Binary class constructor. PrintWriter as parameter for access to PrintWriter
     */
    public Binary (PrintWriter pw) {
        this.pw = pw;
    }
    /**
     * Wrapper method for binary to decimal conversion
     */
    public void binToDec() {
        getBin();
        toDec();
        outDec();
    }
    /**
     * Wrapper method for binary to hexadecimal conversion
     */
    public void binToHex() {
        getBin();
        toHex();
        outHex();
    }
    /**
     * Gets binary input from the user and stores into decimal parameter
     * @param binary parameter to be converted
     */
    private void getBin() {
        System.out.println("Enter a Binary Number:");
        binary = scan.nextLine();
    }
    /**
     * Performs conversion to decimal
     */
    private void toDec() {
        for (int i = binary.length()-1; i>=0; i--) {
            if (binary.charAt(i) == ' ') {
            }
            else if (binary.charAt(i) == '1') {
                decimal += Math.pow(2,pow);
                pow++;}
            else if (binary.charAt(i) == '0') {
                pow++;}
        }
    }
    /**
     * Performs conversion to hexadecimal
     */
    private void toHex() {
        if (binary.length()%4 != 0) {
            StringBuilder paddedBin = new StringBuilder();
            paddedBin.append(binary);
            for(int i = binary.length()%4; i < 4; i++) {
                paddedBin.insert(0, '0');
            }
            binary = paddedBin.toString();
        }
        for (int i = 0; i < binary.length(); i += 4) {
            if (binary.substring(i, i + 4).equals("0000"))
                hexadec.append('0');
            else if (binary.substring(i, i + 4).equals("0001"))
                hexadec.append('1');
            else if (binary.substring(i, i + 4).equals("0010"))
                hexadec.append('2');
            else if (binary.substring(i, i + 4).equals("0011"))
                hexadec.append('3');
            else if (binary.substring(i, i + 4).equals("0100"))
                hexadec.append('4');
            else if (binary.substring(i, i + 4).equals("0101"))
                hexadec.append('5');
            else if (binary.substring(i, i + 4).equals("0110"))
                hexadec.append('6');
            else if (binary.substring(i, i + 4).equals("0111"))
                hexadec.append('7');
            else if (binary.substring(i, i + 4).equals("1000"))
                hexadec.append('8');
            else if (binary.substring(i, i + 4).equals("1001"))
                hexadec.append('9');
            else if (binary.substring(i, i + 4).equals("1010"))
                hexadec.append('A');
            else if (binary.substring(i, i + 4).equals("1011"))
                hexadec.append('B');
            else if (binary.substring(i, i + 4).equals("1100"))
                hexadec.append('C');
            else if (binary.substring(i, i + 4).equals("1101"))
                hexadec.append('D');
            else if (binary.substring(i, i + 4).equals("1110"))
                hexadec.append('E');
            else if (binary.substring(i, i + 4).equals("1111"))
                hexadec.append('F');
        }
    }
    /**
     * Outputs Decimal to terminal and file
     */
    private void outDec() {
        System.out.println("\n" + decimal);
        pw.println(decimal);
        decimal = 0;
        pow = 0;
    }
    /**
     * Outputs Hexadecimal to terminal and file
     */
    private void outHex() {
        System.out.println(hexadec);
        pw.println(hexadec);
        hexadec.setLength(0);
    }
}
