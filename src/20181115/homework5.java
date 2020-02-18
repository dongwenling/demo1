//    *
//   ***
//  *****
// *******
import java.util.Scanner;
public class homework5{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int m=s;
for(int i=1;i<=s;i++){
for(int n=m-i;n>=0;n--){
System.out.print(" ");
}
for(int j=1;j<=i*2-1;j++){
System.out.print("*");
}
System.out.println("");
}

}
}