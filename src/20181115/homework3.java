import java.util.Scanner;
public class homework3{
public static void main(String args[]){
double fm=1;
double fz=4;
double s=0;
System.out.println("ÇëÊäÈëÄúµÄÊı×Ö£º");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<n;i++){
s=s+fz/fm;
fz=-fz;
fm=fm+2;
}
System.out.println("s£º"+s);


}
}