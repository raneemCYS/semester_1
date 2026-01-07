
package lap_9_1;
import java.util.Scanner;
public class Lap_9_1 {
    
    public static boolean isEven(int x){
    boolean result=(x%2==0)?true:false;
    
    return result;
    }
    

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer number:");
        int num=input.nextInt();
        boolean o=isEven (num);
        if(o==true)
        System.out.println(" "+num+" is even");
        else
            System.out.println(" "+num+" is odd");
    }
    
    
}
