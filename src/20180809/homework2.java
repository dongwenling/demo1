import java.util.Scanner;
public class homework2{
public static void main(String args[]){
System.out.println("����������Ҫ������");
int[] ii=new int[5];
for(int o=0;o<=4;o++){
Scanner sc = new Scanner(System.in);
ii[o]=sc.nextInt();

}
int oolen=ii.length;

for(int l=oolen-1;l>0;l--){
for(int n=0;n<l;n++){
if(ii[n]>ii[n+1]){
int temp=ii[n];
ii[n]=ii[n+1];
ii[n+1]=temp;
}
}
}
int min=0;

System.out.println("����������ֵĳ���Ϊ��"+oolen);
int max=oolen-1;

for(int m=0;m<=4;m++){
System.out.print(ii[m]+" ");
}

Scanner sc= new Scanner(System.in);
int value=sc.nextInt();
System.out.println("��������ؼ���:"+value);

int mid=(min+max)/2;
while(min<=max){
if(ii[mid]==value){
System.out.println("�������������index�ڣ�"+mid);
break;
}else if(value>ii[mid]&&min<max){
min=mid+1;
mid=(min+max)/2;
}else if(value<ii[mid]&&min<max){
max=mid-1;
mid=(mid+max)/2;
}else{
System.out.println("�����ڴ˹ؼ��֣���");
break;
}

}
}



}