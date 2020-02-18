public class homework1{
public static void main(String args[]){
int[] arr=new int[5];
int[] brr=new int[5];

for(int i=0;i<5;i++){
arr[i]=i+1;
System.out.print(arr[i]+" ");
}
System.out.println();

for(int i=0;i<5;i++){
brr[i]=arr[4-i];
System.out.print(brr[i]+" ");

}

}

}