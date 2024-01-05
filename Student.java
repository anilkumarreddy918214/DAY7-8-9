class student{
int id;
String name;
student(int i,String n){
id=i;
name=n;
}
void display(){System.out.println(id+" "+name);}
public static void main(String args[]){
student s1=new student(111,"anil");
student s2=new student(222,"nani");
s1.display();
s2.display();
}
}