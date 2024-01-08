class student{
int id;
String name;
static String college;
student(int n,String i){
id=n;
name=i;
}
void display(){System.out.println(id+" "+name+" "+college);
}
public static void main(String args[]){
student s1=new student(11,"ani");
student s2=new student(1,"anil");
student.college="NANI";
s1.display();
s2.display();
}


}