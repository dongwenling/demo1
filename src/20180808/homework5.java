import java.util.Scanner;
public class homework5{

public static void main(String args[]){

System.out.println("������0~99999֮�ڵ�����");
Scanner s= new Scanner(System.in);
int i= s.nextInt();
if(i>=10000&&i<=99999){
System.out.println("���Ǹ���λ��");
}else if(i<=9999&&i>=1000){
System.out.println("���Ǹ�4λ��");
}else if(i<=999&&i>=100){
System.out.println("���Ǹ�3λ��");
}else if(i<=99&&i>=10){
System.out.println("���Ǹ�2λ��");
}else if(i<=9&&i>=0){
System.out.println("���Ǹ�1λ��");
}else{
System.out.println("���ֲ��Ϸ�");
}
}

}