import java.util.Scanner;
class employ{
private int id;
private String student_name;
private String branch_name;
private String adress;
private int phon_no;
public void setId(int id){
this.id=id;
}
public void setStudent_name(String student_name){
this.student_name=student_name;
}
public void setBranch_name(String branch_name){
this.branch_name=branch_name;
}
public void setAdress(String adress){
this.adress=adress;
}
public void setPhon_no(int phon_no){
this.phon_no=phon_no;
}

public int getId(){
return this.id;
}
public String getStudent_name(){
return this.student_name;
}
public String getBranch_name(){
return this.branch_name;
}
public String getAdress(){
return this.adress;
}
public int getPhon_no(){
return this.phon_no;
}
}
class TestEmploy{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
employ[] ob=new employ[5];
for(int i=0;i<5;i++){
ob[i]=new employ();
ob[i].setId(sc.nextInt());
ob[i].setStudent_name(sc.next());
ob[i].setBranch_name(sc.next());
ob[i].setAdress(sc.next());
ob[i].setPhon_no(sc.nextInt());
}
System.out.println("Details are:\n");
for(int j=0;j<5;j++){
System.out.println("ID:"+ob[j].getId());
System.out.println("Student_name:"+ob[j].getStudent_name());
System.out.println("Branch_name:"+ob[j].getBranch_name());
System.out.println("Adress:"+ob[j].getAdress());
System.out.println("Phon_no:"+ob[j].getPhon_no());
}
}
}
