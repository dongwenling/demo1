import java.util.Scanner;
public class homework14{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int in = sc.nextInt();
int s=in;

for(int i=2;i<=in;i++){


if(s%i==0&&s!=i){
s=s/i;
System.out.println(i);
}

if(s==i){
System.out.println(i);
break;

}

}

}



}