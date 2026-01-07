/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package final__4;
import java.util.Scanner;
public class Final__4 {
static Scanner input=new Scanner(System.in);
    


















   

public static void main(String[] args) {
        
       int []Array={30,40,50,60,70,80,90}; 
         
       
       
       
       for(int x :Array){
       System.out.print(x+" ");
       
       }
       
       
       
       
       
       
       
       
        int count=Array.length;
        for (int i=0;i<count/2;i++){
        int temp=Array[i];
        Array[i]=Array[count-1-i];
        Array[count-1-i]=temp;
        }
        System.out.println("\ninverse :");
        for (int i=0;i<Array.length;i++)
        System.out.print(Array[i]+" ");
        
        System.out.println("");
        
        
        
        
        
        
        
    }
    
}
