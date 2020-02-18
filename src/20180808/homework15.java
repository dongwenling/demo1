import java.util.Scanner;
public class homework15{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int[] str=new int[7];
System.out.println("请输入7个数字");
for(int i=0;i<=6;i++){
str[i]=sc.nextInt();
System.out.println("第"+i+"个数字:"+str[i]);
}
System.out.println("对这7个数字进行排序");
for(int m=str.length;m>0;m--){
for(int n=0;n<m-1;n++){
if(str[n]>str[n+1]){
int temp=str[n];
str[n]=str[n+1];
str[n+1]=temp;
}
}
}
for(int j=0;j<str.length;j++){
System.out.println("结果");
System.out.println(str[j]);
}
}
}

