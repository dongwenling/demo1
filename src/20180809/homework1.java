import java.util.Scanner;
public class homework1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
char c=sc.next().charAt(0);
if(c>=97&&c<=122){

System.out.print("����Сд��ĸ"+c);
char cc = (char)(c-32);
System.out.print("ת�ɴ�д��ĸΪ"+cc);
}else{

System.out.print("���Ǹ���д��ĸ"+c);

}
}



}