import java.util.Scanner;
public class homework13{
public static void main(String args[]){
int s=0;

Scanner sc= new Scanner(System.in);
int i = sc.nextInt();
System.out.println("请输入月份："+i);
System.out.println(fun(i));

}


public static int fun(int i){

if(i==1|i==2){

return 1;
}else{
return fun(i-1)+fun(i-2); 
}
}

}