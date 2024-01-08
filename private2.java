
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
class demo{
student[] ob=new student();
student ob2=new student();
student ob3=new student();
student ob4=new student();
student ob5=new student();
ob[0]=ob2;
ob[1]=ob3;
ob[2]=ob4;
ob[3]=ob5;

ob2[0].setId(111);
ob2[0].setName("ANIL");
System.out.println("ID:"+ob2[0].getId());
System.out.println("Name:"+ob1[0].getName());
ob3[1].setId(111);
ob3[1].setName("ANIL");
System.out.println("ID:"+ob3[1].getId());
System.out.println("Name:"+ob3[1].getName());
ob4[2].setId(111);
ob4[2].setName("ANIL");
System.out.println("ID:"+ob4[2].getId());
System.out.println("Name:"+ob4[2].getName());
ob5[3].setId(111);
ob5[3].setName("ANIL");
System.out.println("ID:"+ob5[3].getId());
System.out.println("Name:"+ob5[3].getName());
}
}
