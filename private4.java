import java.util.Scanner;
class employ{
private int id;
private String name;
private String department;
public void setId(int id){
this.id=id;
}
public void setName(String name){
this.name=name;
}
public void setDepartment(String department){
this.department=department;
}
public int getId(){
return this.id;
}
public String getName(){
return this.name;
}
public String getDepartment(){
return this.department;
}
}
class TestEmploy{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
employ[] ob=new employ[3];
for(int i=0;i<3;i++){
ob[i]=new employ();
ob[i].setId(sc.nextInt());
ob[i].setName(sc.next());
ob[i].setDepartment(sc.next());

}
System.out.println("Details are:\n");
for(int j=0;j<3;j++){
System.out.println("ID:"+ob[j].getId());
System.out.println("Name:"+ob[j].getName());
System.out.println("Department:"+ob[j].getDepartment());

}
}
}