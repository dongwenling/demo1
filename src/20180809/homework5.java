import java.util.*;

public class homework5{


static Scanner sc = new Scanner(System.in);
static int a=sc.nextInt(10);

public static void  main(String args[]){
int sum=0;
for(int i=1;i<=9;i++){
System.out.println(i+"值");
int t = getge(i);
System.out.println(i+"返回值是："+t);
sum=sum+t;
}
System.out.println("和为："+sum);
}

public static int getge(int c){
int y=a;
while(c>0&&c!=1){  
y=y+a*(int)Math.pow(10,c-1);
c--;
}
System.out.println("第"+c+"个数字是："+y);

return y;

}

}