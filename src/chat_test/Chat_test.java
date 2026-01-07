
package chat_test;

public class Chat_test {

    public static void main(String[] args) {
         Book bookOne=new Book();
         Book bookTwo=new Book();
         Book bookThree=new Book();
        
        
        
      bookOne.setAuthor("ran");
      bookOne.setPages(300);
      bookOne.setTitle("Queen ran");
      //bookOne.displayInfo();
      System.out.print("Book (1) info:\nTitle: "+bookOne.getTitle()+"\nAuthor: "+bookOne.getAuthor()+"\nPages: "+bookOne.getPages()+"\n");
      System.out.println("\n--------------------------------------");
     //////////-------------
      bookTwo.setAuthor("rno");
      bookTwo.setPages(1200);
      bookTwo.setTitle("the only Queen");
      //bookTwo.displayInfo();
      System.out.print("Book (2) info:\nTitle: "+bookTwo.getTitle()+"\nAuthor: "+bookTwo.getAuthor()+"\nPages: "+bookTwo.getPages()+"\n");
      System.out.println("\n--------------------------------------");
      //////////-------------
      bookThree.setAuthor("R");
      bookThree.setPages(400);
      bookThree.setTitle("ur fav");
      //bookThree.displayInfo();
      System.out.print("Book (3) info:\nTitle: "+bookThree.getTitle()+"\nAuthor: "+bookThree.getAuthor()+"\nPages: "+bookThree.getPages()+"\n");
      System.out.println("\n--------------------------------------\nthe output u asked for(SOORRYYY):");
      System.out.println("Book Titles:");
      System.out.println("1."+bookOne.getTitle());
      System.out.println("2."+bookTwo.getTitle());
      System.out.println("3."+bookThree.getTitle());
      
      
      
      
      
      
      
      
      
    }
    
}
