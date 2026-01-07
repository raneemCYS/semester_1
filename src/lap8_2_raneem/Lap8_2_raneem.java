
package lap8_2_raneem;
import java.util.*;

public class Lap8_2_raneem {
    
    public static void mult(int n){ 
    
        
    for (int i =0;i<=10;i++){
      System.out.println(n+"x"+i+"="+(n*i));
    }  }
    
    public static void main(String[] args) {
      
    Scanner park=new Scanner(System.in);
 System.out.print("enter num to show the multiplication table of it:"); 
 int n1=park.nextInt();
   mult(n1);

     
    }
    
}
    
    
    
    
    
    
    
    
    
    /*for (int i=1;i<4;i++){
    for (int j=1; j<4;j++){
    if (i*j>2)
    continue;
    System.out.println(i*j);
    }   
    System.out.println(i);
    }*/
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   /* final int tcost=120;
    System.out.print("inter the number of tickets you want to purchase: ");
    int tickets_num=park.nextInt();
    double cost=tickets_num*tcost;
    double discount;
   
    if (tickets_num>4){
    discount= cost*0.1;
    cost-=discount;}
    else
     cost=tickets_num*tcost;
  
    
    System.out.printf("Total price :%.1f SR \n",cost);*/

    }
    
}
