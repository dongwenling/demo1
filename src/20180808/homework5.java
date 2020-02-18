import java.util.Scanner;
public class homework5{

public static void main(String args[]){

System.out.println("请输入0~99999之内的数字");
Scanner s= new Scanner(System.in);
int i= s.nextInt();
if(i>=10000&&i<=99999){
System.out.println("这是个五位数");
}else if(i<=9999&&i>=1000){
System.out.println("这是个4位数");
}else if(i<=999&&i>=100){
System.out.println("这是个3位数");
}else if(i<=99&&i>=10){
System.out.println("这是个2位数");
}else if(i<=9&&i>=0){
System.out.println("这是个1位数");
}else{
System.out.println("数字不合法");
}
}

}