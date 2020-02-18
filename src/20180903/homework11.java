import java.util.Scanner;
public class homework11{

static Scanner sc=new Scanner(System.in);
static int s=sc.nextInt();
static int n=s/2;
public static void main(String args[]){
getNum();
}

public static void getNum(){
int m=1;
while(m<=s){
for(int j=0;j<n;j++){
System.out.print(" ");
}
n=n-1;
for(int i=0;i<m;i++){
System.out.print("*");
}
m+=2;
System.out.println("");
}
}


}