
package final_2;
import java.util.Scanner;
public class FINAL_2 {
static Scanner input=new Scanner(System.in);
    

public static double[] FindMaxAndMinDuration(double[]a){
   double min=a[0],max=a[0];
   
   for (int i=0;i<a.length;i++){
   if(a[i]>max){
   max=a[i];}
   if(a[i]<min){
       min=a[i];}}
   double result[]={min,max};
   return result;}

public static double totalDuration(double[]a){
     double total=0;
     for (int i=0;i<a.length;i++){
     total+=a[i];}
     double result=total/60;
    
     return result;}

public static void daysBelowAverage(double[]a,double average){
    
   for (int i=0;i<a.length;i++){
   if (a[i]<average){
    System.out.println("day "+(i+1)+":   "+a[i]+"minutes");
   }}}
  



public static void main(String[] args) {
       System.out.println("****welcom to exercise routine system***");
      System.out.println("enter the number of days you exercise :");
       int days=input.nextInt();
       double[] Array=new double[days];
       System.out.println("enter your exercise duration(in minutes)for "+days+" days:");
       for (int i=0;i<Array.length;i++){
       System.out.println("day " +(i+1)+":");
       Array[i]=input.nextDouble();
       }
       
       int choice;
       do{System.out.println("Menu:\n1- display the day with the longest ans shortest exercise\n2- Calclulate and display the total exercise time in hours\n3- Calclulate and display the avarage daily exercise\n4- identify and display the days where the exercise was below the average\n5- Exit");
       System.out.println("Enter your choice:");
       choice=input.nextInt();
        switch(choice){
        
            case 1: double []result=FindMaxAndMinDuration(Array);
                    double min=result[0];
                    double max=result[1];
               System.out.println("the shortest exercise duration : "+min+"minutes");
               System.out.println("the longest exercise duration : "+max+"minutes");break;
        
            case 2:System.out.println("Total exercise duration : "+totalDuration(Array)+"Hour/s");break;
        
            
            case 3:
             
             System.out.println("the avarage daily exercise : "+((totalDuration(Array)*60)/Array.length)+" minutes");break;
        
            case 4: double Result=(totalDuration(Array)*60)/Array.length;
                    System.out.println("Days with exercise duration below the Average("+((totalDuration(Array)*60)/Array.length)+" minutes):");
                    daysBelowAverage(Array,Result);break;
        
            case 5:System.out.println(" Exiting program, Keep up the great work on your fitness journey!"); break;
                    
                    
                    
        
        }}while(choice !=5);


}
    
}
