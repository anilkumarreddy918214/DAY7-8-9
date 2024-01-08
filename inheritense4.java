class animal{
public void eat(){System.out.println("i can eat");}
}
class dog extends animal{
//@override
public void eat(){
super.eat();
System.out.println("i can eat dog food");
}
public void bark(){
System.out.println("i can bark");}
}
class main{
public static void main(String args[]){

dog d=new dog();
d.eat();
d.bark();
}
}

