import java.util.Scanner;
public class homework1{
static double  a=2;
static double  b=1;
static double  sum=0;
static double  t=0;
public static void main(String args[]){
//2/1+3/2+5/3+8/5+13/8.....前20项之和
Scanner sc =new Scanner(System.in);
int s=sc.nextInt();
double[] arr=new double[20];
for(int i=0;i<s;i++){

if(i==0){
arr[i]=a/b;
jisuan();
sum=sum+arr[i];
}else{
arr[i]=a/b;
jisuan();
sum=sum+arr[i];
}
}
System.out.println("sum:"+sum);
}

public static void jisuan(){
t=b;
b=a;
a=t+b;
}
}