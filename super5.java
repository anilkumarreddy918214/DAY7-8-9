class person{
int id;
String name;
person(int id,String name){
this.id=id;
this.name=name;
}
}
class emp extends person{
float salary;
emp(int id,String name,float salary){
super(id,name);
this.salary=salary;
}
void display(){
System.out.println(id+" "+name+" "+salary);
}
}
class main{
public static void main(String args[]){
emp e1=new emp(1,"nani",30087);
e1.display();
}
}