class animal{
void eat(){
System.out.println("eating----");
}
}
class dog extends animal{
void bark(){System.out.println("barking---");}
}
class cat extends animal{
void meow(){System.out.println("meow----");}
}
class Testinheritence{
public static void main(String args[]){
cat c=new cat();
c.eat();
c.meow();
dog d=new dog();
d.eat();
d.bark();
}
}



