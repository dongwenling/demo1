import java.util.Scanner;
public class homework8{
public static void main(String[] args){
int m=0;
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int t=s/2+1;

for(int i=0;i<s;i++){


if(i<t){
m=i*2+1;
for(int j=0;j<m;j++){
System.out.print("*");
}
System.out.println("");
}

if(i>=t){
m=m-2;
while(m>0){
for(int n=0;n<m;n++){
System.out.print("*");
}
System.out.println("");
break;
}
}

}

}
}

