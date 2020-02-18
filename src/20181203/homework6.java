import java.util.Scanner;
public class homework6{
public static void main(String args[]){
	char grade;
	Scanner sc=new Scanner(System.in);
	int s=sc.nextInt();
	grade=s >= 90 ? 'A' :s >= 80 ? 'B' :'c';
	System.out.println(grade);
}
}