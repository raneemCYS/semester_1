
package raneemahmad_4;
  

import java.util.Scanner;
  
public class Raneemahmad_4 {

    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        int accountb=12000;
        System.out.println("**welcome to the phone banking System**");
        System.out.println("select one of the following options :\n1:inquiring about account type\n2:inquiring about bank's working hours\n3:withdraw\n4:deposit\n");
         int num =o.nextInt();
         switch (num){
             
             
             case 1:
        System.out.println("please enter your account number :");
        long phone=o.nextLong();
        if (phone%2==0)   
        System.out.println("you have a saving account");
        else System.out.println("you have a checking account");
        break;
             
             case 2:
        System.out.println("please enter D for weekend or E for weekdays :");
        char char1=o.next().charAt(0);
         if (char1=='D')
         System.out.println("bank working hours during weekends are from 9AM to 5PM");
         else 
         System.out.println("bank working hours during weekdays are from 10AM to 2PM");
         break;
            
             case 3: 
       
        System.out.println("enter the amount of money to be withdrawn:");
        int with=o.nextInt();
        int total=accountb-with;
         if (total>0)
        System.out.printf("%nyour total bank account after the withdrawn:%d",total);
        else 
        System.out.println("No available funds to perform the transaction");
         break;
              
             case 4: 
       
        System.out.println("enter the amount of money to be deposit :");
        int de=o.nextInt();         
        int tot2=de+accountb;
        System.out.printf("%nyou total now is :%d",tot2);
         break;
         }
      
             
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
         
}}
//System.out.print