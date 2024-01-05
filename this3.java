class student{
int id;
String name,course;
float fee;
student(int id,String name,String course){
this.id=id;
this.name=name;
this.course=course;
}
student(int id,String name,String course,float fee){
this(id,name,course);
this.fee=fee;
}
void display(){
System.out.println(id+" "+name+" "+course+" "+fee);
}
}
class b{
public static void main(String args[]){
student s1=new student(111,"NANI","boy",23f);
student s2=new student(222,"ANU","girl");
s1.display();
s2.display();
}
}
