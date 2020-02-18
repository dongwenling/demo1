import java.util.Scanner;
public  class homework2{
public static void main(String args[]){
System.out.println("请输入你的年份：");
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
if((s%4==0)&&(s%100!=0)||(s%400==0)){
System.out.println("这是闰年：");
}else{
System.out.println("这不是闰年：");
}
}
}