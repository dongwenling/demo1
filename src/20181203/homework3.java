//1 1 2 3 5 8 13
import java.util.Scanner;
public class homework3{
	public static void main(String args[]){
		int[] a=new int[12];
		for(int i=0;i<=11;i++){
			if(i==0||i==1){
				a[i]=1;
				System.out.println("����������"+a[i]);
			}else{
				a[i]=a[i-1]+a[i-2];
			}
		}
		
		System.out.println("����֪���ڼ����µ���������");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		System.out.println("��"+s+"���µ���������Ϊ"+a[s-1]);
	}
}