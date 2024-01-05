class Array{
public static void main(String args[]){
int[] s={12,4,5,7,-3,-6};
int sum=0;
Double average;
for(int a:s){
sum+=a;
}
int arrayLength=s.length;
average=((double)sum/(double)arrayLength);
System.out.println("sum="+sum);
System.out.println("Average="+average);
}
}
