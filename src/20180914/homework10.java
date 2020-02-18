import java.util.Scanner;
public class homework10{
public static void main(String args[]){
System.out.println("请输入您的数字。");
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
System.out.println("请输入您的项数");
Scanner bs=new Scanner(System.in);
int b=bs.nextInt();
int[] arr=new int[b]; 
for(int i=0;i<b;i++){
for(int j=i;j<=i;j++){
if(i==0){
arr[i]=s;
System.out.println(arr[i]);
}else{
System.out.println("i="+i);
arr[i]=arr[i-1]+s*(int)Math.pow(10,j);
}
}
}
int sum=0;
for(int m=0;m<b;m++){
	sum=sum+arr[m];
	System.out.print(arr[m]+" ");
}
	System.out.print("和："+sum);

}
}