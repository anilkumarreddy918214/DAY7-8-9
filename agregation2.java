class Author{
String authorName;
int age;
String place;
public Author(String authorName,int age,String place){
this.authorName=authorName;
this.age=age;
this.place=place;
}
}
class Book{
String name;
int price;
Author author;
public Book(String name,int price,Author author){
this.name=name;
this.price=price;
this.author=author;
}
public static void main(String args[]){
Author author=new Author("nani",23,"USA");
Book b=new Book("java is begginer:",50,author);
System.out.println("Book name:"+b.name);
System.out.println("Book Price:"+b.price);
System.out.println("---------author details---------");
System.out.println("Author name:"+b.author.authorName);
System.out.println("Author age:"+b.author.age);
System.out.println("Author place:"+b.author.place);
}}




