import java.util.Scanner;
public  class homework2{
public static void main(String args[]){
System.out.println("�����������ݣ�");
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
if((s%4==0)&&(s%100!=0)||(s%400==0)){
System.out.println("�������꣺");
}else{
System.out.println("�ⲻ�����꣺");
}
}
}