/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lap4_2;

import java.util.Scanner;

public class Lap4_2 {
    
   
       
    public static void main(String[] args) { 
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the amount in Halalah: \n ");
        int tot = r.nextInt();
        
        
        int riyals = tot/100;
        int rem=tot%100;
        
        
        int half=rem/50;
        rem=rem%50;
                
        int quar=rem/25;
        rem=rem%25;
        
        int tenh=rem/10;
         rem=rem%10;
        
         int five=rem/5;
          rem=rem%5;
          
          int one=rem;
     System.out.println("CHANGE BREAKDOWN:");
      System.out.println("riyal coins:"+riyals);
     System.out.println("half riyal cons:"+half);
     System.out.println("quarter riyals coins:"+quar);
     System.out.println("10-halalah coins:"+tenh);
     System.out.println("5-halalah coins :"+five);
     System.out.println("1-halalah coins :"+one);

    }
    
}
