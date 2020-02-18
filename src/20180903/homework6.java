import java.util.Scanner;
public class homework6{

static Scanner sc=new Scanner(System.in);
//System.out.println("please input your num");
static int s=sc.nextInt();
//System.out.println("please input your size")£»
static int w=sc.nextInt();
static int[] arr=new int[w];


public static void main(String args[]){
int su=0;
getNum();
for(int y=0;y<w;y++){
System.out.print(arr[y]+"+");
su=su+arr[y];
}
System.out.println("="+su);
}


public static void getNum(){
for(int i=0;i<w;i++){
arr[i]=sumNum(i);
}
}


public static int sumNum(int l){
int sum=0;
for(int j=0;j<=l;j++){
sum=sum+(int)(s*Math.pow(10,j));
}
return sum;
}


}