import java.util.Scanner;
public class homework5{
	public static void main(String args[]){
		System.out.println("����������3λ����");
		Scanner sc=new Scanner(System.in);
		int s =sc.nextInt();
		for(int i=100;i<=s;i++){
		int a=i%10;
		int b=i%100/10;
		int c=i/100;
		if(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)==i){
			System.out.println("����ˮ�ɻ�"+i);
		}
		}
		
	}
}