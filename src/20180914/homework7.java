import java.util.Scanner;
public class homework7{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
while(s>0){

//Arraylist<int> arrlist=new ArrayList<int>();
int t=0;
int sum=0;
for(int i=1;i<s;i++){
if(s%i==0){
//arr[t]=i;
sum=sum+i;
//arrlist.add(i);
t=t+1;
}
}

if(sum==s){
System.out.println("这个数字是个完全数："+s);
}
s=s-1;
}

}
}