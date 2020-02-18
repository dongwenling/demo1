import java.util.Scanner;
public class homework1{

           public static void main(String args[]){
		   
		   Scanner str = new Scanner(System.in);
		   char s = str.next();
		   System.out.println("输入的字母是"+s);
		   if (s>=97&&s<=122){
		        System.out.println("这是个小写字母");
		        char d = (char)(s-32);
    	        System.out.println("转换成大写字母"+d);
		   }else{
		        System.out.println("这不是个小写字母");
		   }
		   }


}