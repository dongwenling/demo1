//�������һ�����ֵ������
import java.util.Scanner;
public class homework2{
   
    public static void main(String args[]){

     System.out.println("�������κ�����Ҫ�����֣�");
     Scanner str = new Scanner(System.in);
     int i = str.nextInt();
     String s =i+"";
     char[] c=s.toCharArray();
     System.out.println("���ֵĳ����ǣ�"+(c.length));
     String t = "";

     for(int j=c.length-1;j>=0;j--){
         t=t+c[j];
     }
     
      System.out.println("����ǣ�"+t);
     }
}