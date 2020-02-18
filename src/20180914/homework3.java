import java.util.Scanner;
public class homework3{
public static void main(String args[]){
System.out.println("请输入您的成绩");
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
if(s>=90&&s<=100){
System.out.println("A");
}else if(s>=80&&s<90){
System.out.println("B");
}else if(s>=70&&s<80){
System.out.println("C");
}else if(s>=60&&s<80){
System.out.println("D");
}else{
System.out.println("不及格");
}

}
}