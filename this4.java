class A{
void m(A obj){
System.out.println("hello mine");
}
void p(){
m(this);
}
public static void main(String args[]){
A a=new A();
a.p();
}
}