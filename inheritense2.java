//inheritense we use extends keyword

class animal{
void eat(){
System.out.println("eating---");
}
}
class dog extends animal{
void bark(){
System.out.println("barking---");
}
}
class babydog extends dog{
void weep(){
System.out.println("weeping----");
}
}
class Testinheritence{
public static void main(String args[]){
babydog b=new babydog();
b.eat();
b.bark();
b.weep();
}
} 