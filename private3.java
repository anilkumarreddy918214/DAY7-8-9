import java.util.Scanner;
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
Scanner sc=new Scanner(System.in);
student[] ob=new student[3];
for(int i=0;i<3;i++){
ob[i]=new student();
ob[i].setId(sc.nextInt());
ob[i].setName(sc.next());
}
System.out.println("Details are:\n");
for(int j=0;j<3;j++){
System.out.println("ID:"+ob[j].getId());
System.out.println("Name:"+ob[j].getName());
}
}
}