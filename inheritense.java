class Employ{
float salary=30000;
}
class program extends Employ{
int bonus=1000;
public static void main(String args[]){
program p=new program();
System.out.println("program salary:"+p.salary);

System.out.println("program Bonus:"+p.bonus);
}
}
