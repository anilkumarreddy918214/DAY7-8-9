// super is used to refer immidiate parent class instance variable


class animal{
String color="Black";
}
class dog extends animal{
String color="red";
void printColor(){
System.out.println(color);
System.out.println(super.color);
}
}
class testsuper{
public static void main(String args[]){
dog d=new dog();
d.printColor();
}
}

