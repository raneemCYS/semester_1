/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;
import java.util.Scanner;
public class Arrays {

    public static void Arrays(int a ,int s){
    Scanner input=new Scanner(System.in);
        
        
        int [][]array=new int [a][s];
    for (int i=0;i<array.length;i++){
    for (int j=0;j<array[i].length;j++){
    System.out.println("Enter the element at ["+i+"]["+j+"]:");
    int ind=input.nextInt();
    array[i][j]=ind;
    }
    
    }
     System.out.println("the array:");
    for (int i=0;i<array.length;i++){
    for (int j=0;j<array[i].length;j++){
     System.out.print(array[i][j]+" ");
    
    
    }
     System.out.println();
    
    
    }
    }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
    public static void main(String[] args) {
       
       Scanner input=new Scanner(System.in);
        System.out.println("enter number of studies:");
        int s=input.nextInt();
        int a[]=new int [s];
        int tot=0;
        double ava=0;
       
        
       System.out.println("enter grades:");
       for (int i=0;i<a.length;i++){
       int p=input.nextInt();
       a[i]=p;
       tot+=a[i];
       }
       ava+=tot/a.length;
       System.out.println("avrage:"+ava);
       System.out.println("total:"+tot);
       int max=a[0],min=a[0];
       for (int i=0;i<a.length;i++){
       if (a[i]>max)
       max=a[i];
       if (a[i]<min)
       min=a[i]; }
      System.out.println("the max:"+max);
      System.out.println("the min"+min);
       
       
       
       
       
       
       
       
       
       
       
       
       
         System.out.print("enter the number of colmes:");
       int c=input.nextInt();
       System.out.print("enter the number of rows:");
       int r=input.nextInt();
       Arrays(r,c);
       
    }
    
}
