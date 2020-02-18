import java.util.Scanner;
public class homework7{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int y = sc.nextInt();
if(y<0||y>3000){
System.out.println("您输入的年不合法");
System.exit(0);
}
if((y%4==0&&y%100!=0)||y%400==0){
System.out.println("这是闰年");
}else{
System.out.println("这不是闰年");
}

}

}