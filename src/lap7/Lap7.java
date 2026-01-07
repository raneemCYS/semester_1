
package lap7;
   import java.util.Scanner;




public class Lap7 {
   
    
    
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       double result;
       int num=0;
       while (num!=5){
      System.out.println("Choose from the list: \n" +"1. Addition \n" +"2. Subtraction \n" +"3. Multiplication \n" +"4. Division \n" +"5. Exit ");
      System.out.print("Enter your choice (1-5):");
      
      num=input.nextInt();
     
      
      
      
      switch(num){
          case 1:
    System.out.print("Enter first number:"); 
    double num1=input.nextDouble();
    System.out.print("Enter second number:"); 
    double num2=input.nextDouble();
    result=num1+num2;
    System.out.print("Result:"+result+"\n\n");
    break;
             
          case 2:
      System.out.print("Enter first number:"); 
    double num4=input.nextDouble();
    System.out.print("Enter second number:"); 
    double num3=input.nextDouble();
    result=num4-num3;
    System.out.print("Result:"+result+"\n\n");
    break; 
      
          case 3:
    System.out.print("Enter first number:"); 
    double num5=input.nextDouble();
    System.out.print("Enter second number:"); 
    double num6=input.nextDouble();
    result=num5*num6;
    System.out.print("Result:"+result+"\n\n");
    break;  
     
          case 4:
    System.out.print("Enter first number:"); 
    double num7=input.nextDouble();
    System.out.print("Enter second number:"); 
    double num8=input.nextDouble();
    result=(num7/num8);
    System.out.print("Result:"+result+"\n\n");
    break; }}
    if (num==5) 
        System.out.print("Exiting the program." );
      
    
    
    
    
        }}
        
        
        
        
        
        
        
    

    

