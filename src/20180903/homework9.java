import java.util.Scanner;
public class homework9{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
double sum=0;
double p=1;
System.out.print("PI=");
for(double i=0;i<=s;i++){
if(i%2==0){
sum=sum+4/p;
System.out.print("+4/"+p);
p+=2;
}else{
sum=sum-4/p;
System.out.print("-4/"+p);
p+=2;
}
}

System.out.println("="+sum);

}
}