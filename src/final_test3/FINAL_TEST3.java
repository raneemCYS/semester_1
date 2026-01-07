
package final_test3;


import java.util.Scanner;
public class FINAL_TEST3 {

    public static void count(int []a){
   int sum=a.length;
    System.out.println("There is "+sum+" Members in the family");
     
    }
    public static int oldest(int []a){
    int oldest=a[0];
    for (int i =0;i<a.length;i++){
    if (a[i]>oldest){
    oldest=a[i];
    }}
        return oldest; }
   public static void ageGroup(int []a){
   String groupAge=" ";
    System.out.println("the ages of the family members:");
     for (int i =0;i<a.length;i++){
    
  if (a[i]<=16)groupAge="a child" ;else
  if (a[i]>16&&a[i]<=30) groupAge="a Young Adult";else
  if (a[i]>30&&a[i]<=45)groupAge="a Middle-aged Adult";else
  if (a[i]>45)groupAge="an Older Adult";
   System.out.println("Member # "+(i+1)+" is "+groupAge);}}
   public static void inverse(int []a){
   int count=a.length;
   for(int i=0;i<count/2;i++){
   int tem=a[i];
   a[i]=a[count-1-i];
   a[count-1-i]=tem;
   }
   
   
   }
   

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int []Ages={33,51,57,23,16,9,4,77,35};
        System.out.println("1:Calculate the family members number\n2:Find the oldest member age\n3:Determine the group age of each member\n0:Exit the program\nEnter the number of operation:");
        int x=input.nextInt();
        while(x!=0){
        switch(x){
        
            case 1:count(Ages);break;
                
            case 2:System.out.println("THe oldest member of the family is "+oldest(Ages)+" years old");break;
                
            case 3: ageGroup(Ages);break;
           
                
            default :System.out.println("Enter a number from the list!");break;
            case 0:break;
            case 5:inverse(Ages);for (int i=0;i<Ages.length;i++){
                       System.out.print("  "+Ages[i]);}
                 
        
        }
        System.out.println("Enter the number of operation to continue or 0 to exit:");
        x=input.nextInt();
        } }}
        
       
   
    

