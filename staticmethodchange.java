class student{
int id;
String name;
static String college="MTIE";
static void change(){
college="VISWAM";
}
student(int i,String n){
id=i;
name=n;
}
void display(){
System.out.println(id+" "+name+" "+college);
}
}
class student1{
public static void main(String args[]){
student s1=new student(111,"ani");
student s2=new student(222,"nani");
s1.display();
s2.display();

student s3=new student(333,"anu");
student.change();
s1.display();
s2.display();



s3.display();
}
}




