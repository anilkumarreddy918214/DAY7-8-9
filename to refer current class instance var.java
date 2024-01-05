//to refer current class instance varable
class student{
int id;
String name;
float fee;
student(int i,String n,float fee){
this.i=i;
this.n=n;
this.fee=fee;
}
void diplay(){System.out.println(id+" "+name+" "+fee);}
}
class student1{
public static void main(String args[]){
student s1=new student(111,"anil"5000f);
student s2=new student(222,"nani",3000f);
s1.display();	
s2.display();
}
}
