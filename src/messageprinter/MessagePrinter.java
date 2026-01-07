
package messageprinter;
import java.util.Scanner;
public class MessagePrinter {
    
public static void printMessage() {System.out.println("Welcome!");}
public static int printMessage(int s){ return s;}
public static String printMessage(String s){return s;}


    public static void main(String[] args) {
        Scanner raneem=new Scanner(System.in);
        printMessage();
        System.out.println("Enter the value to print: ");
        int num =raneem.nextInt();
        System.out.println("The value provided is : "+printMessage(num));
        System.out.println("Enter the message to print:");
        String s1=raneem.next();
        System.out.println(" Your message is "+printMessage(s1));
    }
    
}
