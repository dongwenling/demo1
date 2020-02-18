import java.util.Scanner;

public class homework10{


static Scanner sc=new Scanner(System.in);
static int s=sc.nextInt();
static int[] arr=new int[s];


public static void main(String args[]){
for(int i=0;i<s;i++){
getNum(i);
}
System.out.println("num:");
int n=sc.nextInt();
System.out.println(arr[n]);
}


public static void getNum(int i){
if(i==0|i==1){
arr[i]=1;
}else{
arr[i]=arr[i-1]+arr[i-2];
}
}

}

