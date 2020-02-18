public class homework6{
public static void main(String args[]){
int[] a=new int[10];
for(int i=0;i<10;i++){
a[i]=(int)(100*Math.random());
}
int min=a[0];
int max=a[0];
int mid=0;
int sum=0;
for(int j=0;j<10;j++){
if(a[j]>max){
max=a[j];
}else if(a[j]<min){
min=a[j];
}else{
}
sum=sum+a[j];
System.out.println(j+":"+a[j]);
}
mid=sum/10;
System.out.println("最大数为："+max);
System.out.println("最小数为："+min);
System.out.println("平均数为："+mid);

}
}