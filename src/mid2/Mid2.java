
package mid2;
public class Mid2{

static int sum=0;
public static void oddNum(){
for (int i =0;i<=10;i++){
    if (i%2!=0){
    System.out.print(i+" ");
    
    sum+=i;}
    
}
System.out.println();


}
    
    public static void main (String[]args)
    {
    
    
    oddNum();
      System.out.println("the sum of these numbers :"+sum); } 
    
    
    
    
    
}