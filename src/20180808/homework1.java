import java.util.Scanner;
public class homework1{

           public static void main(String args[]){
		   
		   Scanner str = new Scanner(System.in);
		   char s = str.next();
		   System.out.println("�������ĸ��"+s);
		   if (s>=97&&s<=122){
		        System.out.println("���Ǹ�Сд��ĸ");
		        char d = (char)(s-32);
    	        System.out.println("ת���ɴ�д��ĸ"+d);
		   }else{
		        System.out.println("�ⲻ�Ǹ�Сд��ĸ");
		   }
		   }


}