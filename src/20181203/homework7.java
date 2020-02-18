import java.util.Scanner;
public class homework7{
	public static void main(String args[]){
		char[] c;
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		c=s.toCharArray();
		System.out.println(s.toCharArray());
		
		for(int i=0;i<c.length;i++){
			if(c[i]>='0'&&c[i]<='9'){
				num1++;
			}else if((c[i]>='a'&&c[i]<='z')||(c[i]>='A'&&c[i]<='Z')){
				num2++;
			}else if(c[i]==' '){
				num3++;
			}else{
				num4++;
			}
		}
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		System.out.println("num3:"+num3);
		System.out.println("num4:"+num4);
	}
}