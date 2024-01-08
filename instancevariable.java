class student{
int count=0;
student(){
count++;
System.out.println(count);
}
public static void main(String args[]){
student s1=new student();
student s2=new student();
student s3=new student();
}
}