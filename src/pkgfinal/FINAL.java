
package pkgfinal;
import java.util.Scanner;
public class FINAL {
static Scanner input=new Scanner(System.in);
    
public static void Displayservices(String a[],int b[]){
                  System.out.println("Services:\t\t\tCosts:");
                  for (int i=0;i<a.length;i++) {
                  System.out.println(a[i]+"\t\t\t"+b[i]+"$");}}



public static int Displayservices(String a[],String b){
   
    for (int i=0;i<a.length;i++){
     if (a[i].equals(b))
     return i;} 
     return -1;}
    


public static double CalculateTotalCost(int a,double c){
  return a*c;
}


    public static void main(String[] args) {
       String []Services={"room cleaning","window cleaning","carpet cleaning","kitchen cleaning"};
       int []Costs={100,80,120,150};
       int choice=0;
       System.out.println("*****Welcom to our system*****");
       do{
           System.out.println("1-View all Services and their costs\n2-Book a service by name\n3-calculate the total cost for a service");
           System.out.println("Enter your choice or 4 to Exit the system");
           choice=input.nextInt();
       
           switch(choice)  {
                     case 1: Displayservices(Services,Costs);break;
                             
                     case 2:  System.out.println("enter the name of the services you want to book? "); 
                              input.nextLine();
                              String serv=input.nextLine();
                              if (Displayservices(Services,serv)==-1){
                              System.out.println("the service dose not exist");
                              }else
                              {System.out.printf("%s it will cost %d$\n",serv,Costs[Displayservices(Services,serv)]);}
                              break;
                     
                     case 3:System.out.println("1-room cleaning\n2-window cleaning\n3-carpet cleaning\n4-kitchen cleaning");
                             System.out.println("Enter the number of the service :");
                             int seRvice=input.nextInt();
                             int service=Costs[seRvice-1];
                             System.out.println("how many times do you want the service?");
                             int times=input.nextInt();
                             System.out.println("the total cost :"+CalculateTotalCost(service,times));break;
      
                     case 4:System.out.println("Exiting the System , goodbye!");break;
                     
                     default:System.out.println("invalid choice");break;
      
      }}while (choice!=4);
     
     }}  
       
       
       
       
    
    

























