
package lap12_2; 
import java.util.Scanner;
public class Lap12_2 {

    public static int[][] CreatAndFill(int r,int c) {
    Scanner input=new Scanner(System.in);
     int [][]array=new int[r][c];   
     System.out.println("the elements of the array:");
        for (int i=0;i<array.length;i++){
        for (int j=0;j<array[i].length;j++){
        System.out.print("Enter value for position ["+i+"]["+j+"]: ");
        array[i][j]=input.nextInt();
        
        System.out.println("");
        }}
        
        return array; }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=input.nextInt();
        System.out.println("Enter the number of columns:");
        int columns=input.nextInt();
        int array[][]=CreatAndFill(rows,columns);
        System.out.println("Array:");
        for (int i=0;i<array.length;i++){
        for (int j=0;j<array[i].length;j++){
        System.out.print(array[i][j]+" "); }
        System.out.println();
       
        
        
        }
        
        
        
        
    }
    
}
