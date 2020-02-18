//水仙花数 153=1*1*1+3*3*3+5*5*5
import java.util.Scanner;
//import java.util.Math;
public class homework9{
public static void main(String args[]){
System.out.println("请输入您的数字：");
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
while(s>99){
int a=s/100;
int b=s/10%10;
int c=s%10;
if(s==Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)){
System.out.println("这是水仙花数："+s+"="+a+"三次方+"+b+"三次方+"+c+"三次方");
}
s=s-1;
}
}
}
