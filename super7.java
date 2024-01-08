final class a{}

class b extends a{
void run(){
System.out.println("not running");}
}
class test{
public static void main(String args[]){
b d=new b();
b.run();
}
}