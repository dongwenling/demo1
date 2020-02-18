public class homework5{
public static void main(String args[]){


int[] arr={67,89,90,34,66};
int len=arr.length;
System.out.println("length"+len);
for(int i=0;i<len;i++){
for(int j=0;j<len-i-1;j++){
if(arr[j]<arr[j+1]){
int t=arr[j];
arr[j]=arr[j+1];
arr[j+1]=t;
}
}
}

for(int m=0;m<len;m++){
System.out.println(arr[m]);
}
}
}