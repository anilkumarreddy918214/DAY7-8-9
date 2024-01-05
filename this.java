class A{
void m(){System.out.println("helo m");}
void n(){System.out.println("hello n");
this.m();
}
}
class b{
public static void main(String args[]){
A a=new A();
a.n();
}
}
