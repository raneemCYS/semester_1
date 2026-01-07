/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package final_test;
import java.util.Scanner;

public class Final_test {

    static Scanner input=new Scanner(System.in);
    
    
    public static void modifyList(String[] s,int d){
    System.out.println("choose a new name for the "+s[d]+" book:");
    s[d]=input.next();}
     
    public static void modifyList(int [] s){
     for (int i =0;i<s.length;i++){
     System.out.println("chapters for "+i+":");
     s[i]=input.nextInt();} }
            
   public static void printPricesList(String s[],int n[])
   { final double TAX=0.10;
   System.out.println("name:\t\tChapters:\t\t\tprice:");
   for (int i=0;i<s.length;i++){
   System.out.println(s[i]+"\t\t"+n[i]+"\t\t\t\t\t"+cprice(TAX,n[i]));
   
   }
   
   
   
   }
    
    
    
    public static double cprice(double a,int b ){
    double price=b*5;
    double totprice=price+price*a;
    return totprice;
    
    }
    
    
    
    public static void main(String[] args) {
     
      String a[]=new String[6];
        a[0]="Wonder";
        a[1]="Math";
        a[2]="Giver";   
        a[3]="Hamlet";
        a[4]="Alice";
        a[5]="Wish";
      int n[]=new int[6];
      int o=0;
      while(o!=4){
      System.out.println("*********MENUE*********\n1-Modify abook name\n2-Modify number of chapters for all books\n3-print books list with prices\n4-Exit");
        o=input.nextInt();
        
        switch(o){
            case 1: System.out.println("Enter book index number (between 0-5):");
                  int t=input.nextInt();
                  modifyList(a,t);break;
                  
            case 2: modifyList(n);break;
                
            case 3:printPricesList(a,n);break;
                
            case 4:System.out.println("thank you for using our book store system");break;
              
            default:System.out.println("invalid choice,please choose item from menu");break;
        
        }}
        
        
      }}
        
        
        
    
    

