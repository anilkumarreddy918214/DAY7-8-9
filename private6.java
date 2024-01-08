import java.util.Scanner;
class trainer{
private int tid;
private String tname;
private String course;
public void setTid(int tid){
this.tid=tid;
}
public void setTname(String tname){
this.tname=tname;
}
public void setCourse(String course){
this.course=course;
}
public int getTid(){
return this.tid;
}
public String getTname(){return this.tname;}
public String getCourse(){return this.course;}
public trainer(int tid,String tname,String course)
{
this.tid=tid;
this.tname=tname;
this.course=course;
}
public trainer(){
this.tid=0;
this.tname=null;
this.course=null;
}
}
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Teacher ID:");
int tidin=sc.nextInt();
System.out.println("Enter Teacher Name:");
String tnamein=sc.next();
System.out.println("Enter course Name:");
String coursein=sc.next();
trainer ob=new trainer(tidin,tnamein,coursein);
System.out.println("tid:"+ob.getTid());
System.out.println("tname:"+ob.getTname());
System.out.println("Course:"+ob.getCourse());

}
}
