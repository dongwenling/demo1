public class homework7{


static int arr[]=new int[21];
static double brr[]=new double[20];

public static void main(String args[]){
getNum();
for(int i=0;i<20;i++){
brr[i]=(double)(arr[i+1]/arr[i]);
System.out.print(arr[i+1]+"/"+arr[i]+"+");
}
double sum=0;
for(int m=0;m<20;m++){
sum=sum+brr[m];
}
System.out.println("="+sum);
}


public static void getNum(){
arr[0]=1;
arr[1]=2;
for(int j=2;j<=20;j++){
arr[j]=arr[j-1]+arr[j-2];
}

}
}