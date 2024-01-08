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
student ob1=new student();
ob1.setId(111);
ob1.setName("ANIL");
System.out.println("ID:"+ob1.getId());
System.out.println("Name:"+ob1.getName());
student ob2=new student();
ob2.setId(99);
ob2.setName("ANU");
System.out.println("ID:"+ob2.getId());
System.out.println("Name:"+ob2.getName());
student ob3=new student();
ob3.setId(88);
ob3.setName("JISHNU");
System.out.println("ID:"+ob3.getId());
System.out.println("Name:"+ob3.getName());
student ob4=new student();
ob4.setId(77);
ob4.setName("NANNA");
System.out.println("ID:"+ob4.getId());
System.out.println("Name:"+ob4.getName());
student ob5=new student();
ob5.setId(66);
ob5.setName("AMMA");
System.out.println("ID:"+ob5.getId());
System.out.println("Name:"+ob5.getName());
}
}