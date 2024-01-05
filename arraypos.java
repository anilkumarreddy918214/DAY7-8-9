import java.util.Scanner;
class Array{

public static void main(String args[]){
int n,x,flag=0,i=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter no.of element you need:");
	n=sc.nextInt();
	int a[]=new int[n];
System.out.println("Enyer all elements");
	for(i=0;i<n;i++){
	a[i]=sc.nextInt();}
System.out.print("enter element you find:");
	x=sc.nextInt();
	for(i=0;i<n;i++){
	if(a[i]==x){
	flag=1;break;
}
}
if(flag==1){System.out.print("Element found at position:"+(i+1));}
else{
System.out.print("element not found");}
}
}

