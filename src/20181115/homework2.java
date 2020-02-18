import java.util.Scanner;
//*
//***
//*****
//***
//*
public class homework2{
public static void main(String args[]){

System.out.println("ÇëÊäÈëÄúµÄÊı×Ö");
Scanner sc= new Scanner(System.in);
int s=sc.nextInt();
int m=s/2;
int b=1;
for(int i=0;i<s;i++){
if(i<=m){
b=1+i*2;
jisuan(b);
System.out.println("");
}else{
b=b-2;
jisuan(b);
System.out.println("");
}
}
}

public static void jisuan(int b){
for(int j=0;j<b;j++){
System.out.print("*");
}
}
}