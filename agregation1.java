class Adress{
String city,state,country;
public Adress(String city,String state,String country){
this.city=city;
this.state=state;
this.country=country;
}
}
class Employ{
int id;
String name;
Adress obadress;
public Employ(int id,String name,Adress obadress){
this.id=id;
this.name=name;
this.obadress=obadress;
}
void display(){
System.out.println(id+" "+name);
System.out.println(obadress.city+" "+obadress.state+" "+obadress.country);
}
public static void main(String args[]){
Adress a1=new Adress("anu","ani","ponnu");
Adress a2=new Adress("anil","nani","jishnu");

Employ e1=new Employ(11,"ali:",a1);
Employ e2=new Employ(22,"mastan:",a2);
e1.display();
e2.display();
}
}

