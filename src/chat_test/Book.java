
package chat_test;


public class Book {
   private String title;
   private int pages;
   private String author;
   public void displayInfo(){
    System.out.print("Book info:\nTitle: "+title+"\nAuthor: "+author+"\nPages: "+pages);
    System.out.println("\n--------------------------------------"); }
////---------------
  public String getTitle(){
  return title;}
  public String getAuthor(){
  return author;}
  public int getPages(){
  return pages;}
 ////---------------
  public void setTitle(String title){
  this.title=title;  }
  public void setAuthor(String author){
  this.author=author;  }
  public void setPages(int pages){
  this.pages=pages;  }
  
  
  
  
  
  
}
     






//  public void setName(String s){
//  name=s;} 
//  public String getName(){
//  return name;} 
//  public int getId(){
//  return id ;}
//     