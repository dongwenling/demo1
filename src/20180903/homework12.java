import java.util.Scanner;
import java.util.Random;
public class homework12{
public static void main(String args[]){

//Scanner sc=new Scanner(System.in);
//int s=sc.nextInt();
int arr[]=new int[10];
Random r=new Random();
for(int i=0;i<10;i++){
arr[i]=r.nextInt(101);
System.out.println(arr[i]);
}
getNum(arr);
}



//System.out.println("avg="+(double)sum/10);
public static void getNum(int[] brr){
int sum=0;
int max=brr[0];
int min=brr[0];

for(int j=0;j<9;j++){
sum=sum+brr[j];
if(brr[j+1]>max){
max=brr[j+1];
}
if(brr[j+1]<min){
min=brr[j+1];
}
}

double avg=(double)sum/10;
System.out.println("max="+max);
System.out.println("min="+min);
System.out.println("sum="+sum);
System.out.println("avg="+avg);
}

}