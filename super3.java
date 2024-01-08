//super is used to invoke parent class constructer



class a{
a(){System.out.println("animal is created");
}
}
class b extends a{
b(){

System.out.println("dog is created");}
}
class test{
public static void main(String args[]){
 b d=new b();
}
}
