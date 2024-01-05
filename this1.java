class A{
A(){System.out.println("the default constructer");}
A(int x){
this();
System.out.print(x);
}
}
class b{
public static void main(String args[]){
A a=new A(10);
}}