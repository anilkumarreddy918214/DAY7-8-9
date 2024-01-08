class student{
private int id;
private String name;
public void setId(int id){
this.id=id;
}
public void setName(String name){
this.name=name;
}
public int getId(){
return this.id;
}
public String getName(){
return this.name;
}
}
class Teststudent{
public static void main(String args[]){
student obj=new student();
obj.setId(111);
obj.setName("ANIL");
System.out.println("ID:"+obj.getId());
System.out.println("Name:"+obj.getName());
}
}