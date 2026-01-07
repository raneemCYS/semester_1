
package lap11_raneem;
import java.util.Scanner;
public class Lap11_raneem {

    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
     
              System.out.print("Enter the size ofthe array :");
             int arraySize=input.nextInt();
             int[]array=new int[arraySize];  
               System.out.println("Enter "+arraySize+" elements:");
               for (int i=0;i<array.length;i++){
               array[i]=input.nextInt();
               } System.out.print("original Array :");
               for (int i=0;i<array.length;i++){
              System.out.print(array[i]+" ");               
               }System.out.println();
               for (int i=0;i<array.length/2;i++)
               { int x=array[i];
                   array[i]=array[array.length-1-i];
                   array[array.length-1-i]=x;}
               System.out.print("Reversed Array :");
               for (int i=0;i<array.length;i++){
              System.out.print(array[i]+" "); }
               
               
               
               
               
               
               
               
    }
    
}
