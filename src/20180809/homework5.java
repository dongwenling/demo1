import java.util.*;

public class homework5{


static Scanner sc = new Scanner(System.in);
static int a=sc.nextInt(10);

public static void  main(String args[]){
int sum=0;
for(int i=1;i<=9;i++){
System.out.println(i+"ֵ");
int t = getge(i);
System.out.println(i+"����ֵ�ǣ�"+t);
sum=sum+t;
}
System.out.println("��Ϊ��"+sum);
}

public static int getge(int c){
int y=a;
while(c>0&&c!=1){  
y=y+a*(int)Math.pow(10,c-1);
c--;
}
System.out.println("��"+c+"�������ǣ�"+y);

return y;

}

}