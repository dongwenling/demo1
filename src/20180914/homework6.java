import java.util.Scanner;
public class homework6{
public static void main(String args[]){
int[] arr={22,45,50,56,109};
Scanner sc=new Scanner(System.in);
System.out.println();
int num=sc.nextInt();
int len=arr.length;
int min=0;
int max=len-1;
int mid=(min+max)/2;
for(int i=0;i<len;i++){
if(arr[mid]>num){
max=mid-1;
mid=(min+max)/2;
}else if(arr[mid]<num){
min=mid+1;
mid=(min+max)/2;
}else{
System.out.println("有这个数，index为："+mid);
System.exit(0);
}
}
System.out.println("no this number");
}
}