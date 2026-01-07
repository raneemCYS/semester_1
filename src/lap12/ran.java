
package lap12;

public class ran {

    
    public static void print_array(int [][]a){
        for(int x=0;x<a.length;x++){
       for(int y=0;y<a[x].length;y++){
       System.out.print(a[x][y]+" "); }
       System.out.println();}}
    
    public static void transplse(int [][]a){
    
    for(int x=0;x<a.length;x++){
    for(int y=x+1;y<a.length;y++){
     int s=a[x][y];
    a[x][y]=a[y][x];
    a[y][x]=s;
    
    }
    }
    
    
    
    }
    
    
    
    
public static void main(String[] args) {
   int [][]array2d;
array2d=new int[][]{ {1,2,3},{4,5,6},{7,8,9}};
   System.out.println("Original Array: ");
print_array(array2d);
System.out.println("After changing the rows and columns of the said array: ");
transplse(array2d);
print_array(array2d);




    }

}
