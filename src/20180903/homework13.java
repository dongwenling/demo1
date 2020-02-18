public class homework13{
public static void main(String args[]){
int[] arr=new int[10];
for(int i=0;i<9;i++){
arr[i]=i+1;
System.out.print(arr[i]);
}


int tem=arr[0];
for(int i=0;i<8;i++){
arr[i]=arr[i+1];
}
arr[8]=tem;
System.out.println("");
for(int i=0;i<9;i++){
System.out.print(arr[i]);
}

int k=7;
while(k>0){
int pem=arr[0];
for(int i=0;i<8;i++){
arr[i]=arr[i+1];
}
arr[8]=pem;
System.out.println("");
for(int i=0;i<9;i++){
System.out.print(arr[i]);
}
k--;
}
}
}