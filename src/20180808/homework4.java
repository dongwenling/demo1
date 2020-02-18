import java.util.Scanner;
public class homework4{
public static void main(String agrs[]){

System.out.println("请您输入年：");
Scanner y = new Scanner(System.in);
int yy=y.nextInt();
System.out.println("请您输入月：");
Scanner m = new Scanner(System.in);
int mm=m.nextInt();
System.out.println("请您输入日：");
Scanner d = new Scanner(System.in);
int dd=d.nextInt();
int s = 0;
switch(mm){
case 12:
   s=s+30;
case 11:
   s=s+31;
case 10:
   s=s+30;
case 9:
   s=s+31;
case 8:
   s=s+31;
case 7:
   s=s+30;
case 6:
   s=s+31;
case 5:
   s=s+30;
case 4:
   s=s+31;
case 3:
     s=s+28;
case 2:
   s=s+31;
case 1:
   s=s+dd;
}
System.out.println("结果为："+s);

}


}