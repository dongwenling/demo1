//将输入的一串数字倒序输出
import java.util.Scanner;
public class homework2{
   
    public static void main(String args[]){

     System.out.println("请输入任何您想要的数字：");
     Scanner str = new Scanner(System.in);
     int i = str.nextInt();
     String s =i+"";
     char[] c=s.toCharArray();
     System.out.println("数字的长度是："+(c.length));
     String t = "";

     for(int j=c.length-1;j>=0;j--){
         t=t+c[j];
     }
     
      System.out.println("结果是："+t);
     }
}