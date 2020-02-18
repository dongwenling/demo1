public class homework1{
public static void main(String args[]){
int[] a=new int[100];
boolean b=true;
for(int i=0;i<5;i++){
int num=(int)(100*Math.random());
//num=8;
	for(int j=2;j<=num/2;j++){
		if(num>1&&num%j==0){
			b=false;	
		}
		
	}
	          	System.out.println(num+" " );			

    if(b==true||num==2||num==3){		
		System.out.println("ÕâÊÇËØÊı£º"+num+" " );
	}
}	

}	
}