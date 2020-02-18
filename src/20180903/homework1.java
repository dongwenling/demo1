import java.util.Scanner;

public class homework1{
public static void main(String args[]){
System.out.println("请输入月份");
Scanner sc = new Scanner(System.in);
int s = sc.nextInt();
System.out.println("第"+s+"个月的兔子数量是："+getnum(s));
}
public static int getnum(int d){
int r=0;
if(d==1||d==2){
r=1;}
else{

r=getnum(d-2)+getnum(d-1);
}
return r;


}
}