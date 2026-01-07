
package lap8_raneem;
import java.util.Scanner;
public class Lap8_raneem {

    
    
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int even;
       int tot=1;
       int i=1;
       while(i<=10){
       i++;
      System.out.println("Enter even number or -1 to quit :");
      even =input.nextInt();
       if (even==-1)
       break;
        if (even%2==0){
        for(int o=0;o<even;o++){
          tot*=(even-o);
        }
        System.out.println("factorial of  "+even+"  is  "+tot);
        
        
        
        
        
        
        
        
        
        
        
       
       }
        
       }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
