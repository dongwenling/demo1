import java.util.Scanner;
public class homework1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
char c=sc.next().charAt(0);
if(c>=97&&c<=122){

System.out.print("这是小写字母"+c);
char cc = (char)(c-32);
System.out.print("转成大写字母为"+cc);
}else{

System.out.print("这是个大写字母"+c);

}
}



}