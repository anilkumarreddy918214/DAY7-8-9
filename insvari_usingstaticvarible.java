//program for illustrate to use of static variabe
//is shared with all objects
class counter{
static int count=0;
counter(){
count++;
System.out.println(count);
}
public static void main(String args[]){
counter c1=new counter();
counter c2=new counter();
counter c3=new counter();
}
}