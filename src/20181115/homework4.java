//1 1 2 3 5 8 13 21 34
import java.util.Scanner;
public class homework4{
public static void main(String args[]){
System.out.println("请输入您的数字：");
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int[] arr=new int[s];
int sum=0;
for(int i=0;i<s;i++){
if(i==0||i==1){
arr[i]=1;
sum=sum+arr[i];
}else{
arr[i]=arr[i-1]+arr[i-2];
sum=sum+arr[i];
}
}

Scanner c=new Scanner(System.in);
int cc=c.nextInt();
System.out.println("请输入第"+cc+"个数字:"+arr[cc-1]);
System.out.println("和："+sum);
}
}