import java.util.Scanner;

public class homework2{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int s = sc.nextInt();
boolean b=true;
for(int i=2;i<=s/2;i++){
if(s%i==0)
b=false;
}
if(b==false)
System.out.println("1");
else
System.out.println("2");

}

}