
package lap_9_2;

import java.util.Scanner;
public class Lap_9_2 {
    
    static double tot=0;//the total for the bank account
    
     public static void deposit(double x){
     if (x<=0)
          System.out.println("Error");
     else{
          tot+=x;
          System.out.println("Deposit successful . Current balance:"+"$"+tot); }}
   
    public static void withdraw(double x){
    
    if (tot<x||x==0)
      System.out.println("Error");
    else{
        tot-=x;
      System.out.println("withdrawal successful . Current balance:"+"$"+tot);}}
    

    public static void main(String[] args) {
         Scanner input=new Scanner(System.in); 
         System.out.print("1.Deposit\n2.Withdraw\n3.Exit\nEnter your choice:");
         int num=input.nextInt();
      
      while(num!=3) {
     
         switch(num){
     
            case (1) : { 
               System.out.print("Enter the amount to deposit: $");
               int num1=input.nextInt();
               deposit(num1);break;  }
               
            case (2) : {
               System.out.print("Enter the amount to withdraw: $");
               int num2=input.nextInt();
               withdraw(num2);break; }}
    
      System.out.print("1.Deposit\n2.Withdraw\n3.Exit\nEnter your choice:");
      num=input.nextInt();  }
       
       System.out.println("Thank you for using the banking system.");
       
    }
    
}
