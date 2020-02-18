import java.util.Scanner;

public class homework6{
public static void main(String args[]){

System.out.println("请输入三角形的三条边：");
Scanner aa=new Scanner(System.in);
int a=aa.nextInt();
Scanner bb=new Scanner(System.in);
int b=bb.nextInt();
Scanner cc=new Scanner(System.in);
int c=cc.nextInt();
if((a+b)>c&&(b+c)>a&&(a+c)>b){
System.out.println("这是三角形");
}else{
System.out.println("这不是三角形");
}

}

}