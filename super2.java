// superclass overriding

class anil{
void eat(){System.out.println("starving---");}
}
class nani extends anil{
void eat(){System.out.println("eating---");}
}
class dog extends nani{
void eat(){System.out.println("eating bread---");}
void bark(){System.out.println("barking---");}
void work(){
super.eat();
bark();
}
}
class super1{
public static void main(String args[]){
dog d=new dog();
d.work();

}
}