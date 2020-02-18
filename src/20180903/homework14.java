public class homework14{
public static void main(String args[]){

int[] arr=new int[40];

for(int i=0;i<arr.length;i++){
arr[i]=(int)(100*Math.random());
System.out.print(arr[i]+" ");
}



for(int i=0;i<arr.length;i++){
for(int j=0;j<arr.length-i-1;j++){
if(arr[j]<arr[j+1]){
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
System.out.println();
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}


System.out.println();
for(int j=0;j<arr.length;j++){
if(arr[j]<60){
System.out.print(arr[j]+" ");
}
}



}
}