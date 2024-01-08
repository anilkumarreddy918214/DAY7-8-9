import java.util.Scanner;
class trainer{
private int tid;
public void setTid(int tid){
this.tid=tid;
}
public int getTid(){
return this.tid;
}
public trainer(int tid){
this.tid=tid;}
public trainer(){this.tid=0;}
}
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Teacher ID:");
int tidin=sc.nextInt();
trainer ob=new trainer(tidin);
System.out.println("tid:"+ob.getTid());
}
}

