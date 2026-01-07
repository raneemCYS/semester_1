/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;
import java.util.Scanner;

public class JavaApplication12 {

    public static void main(String[] args) {
       int ranlist[]=new int [10];
       Scanner raneemahmad=new Scanner(System.in);
       int tot=0;
       double ave=0;
       System.out.print("Enter the scores :");
       for(int i=0;i<ranlist.length;i++){
       ranlist[i]=raneemahmad.nextInt();
       tot+=ranlist[i];
       } 
       ave+=(double)tot/ranlist.length;
       System.out.print("the scores :"); 
       for (int i=0;i<ranlist.length;i++){
       System.out.print(" "+ranlist[i]);
       }
       
      int min=ranlist[0],max=ranlist[0];
       System.out.println("\nthe average of the scores is: "+ave);
      
       for (int i=1;i<ranlist.length;i++){
            if(ranlist[i]>max){
       max=ranlist[i];  }if (ranlist[i]<min) min=ranlist[i];
        }
       System.out.println("the minimum of the scores is: "+min);
       System.out.println("the maximum of the scores is: "+max);
     
       
       
       
       
       
       
    }
    
}
