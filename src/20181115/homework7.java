public class homework7{
public static void main(String args[]){
int[] a=new int[100];
int[] b=new int[10];
for(int i=-0;i<10;i++){
b[i]=0;
}
for(int i=-0;i<100;i++){
a[i]=(int)(1000*Math.random());
if(a[i]%10==0){
b[0]=b[0]+1;	
}else if(a[i]%10==1){
b[1]=b[1]+1;	
}else if(a[i]%10==2){
b[2]=b[2]+1;	
}else if(a[i]%10==3){
b[3]=b[3]+1;	
}else if(a[i]%10==4){
b[4]=b[4]+1;	
}else if(a[i]%10==5){
b[5]=b[5]+1;	
}else if(a[i]%10==6){
b[6]=b[6]+1;	
}else if(a[i]%10==7){
b[7]=b[7]+1;	
}else if(a[i]%10==8){
b[8]=b[8]+1;	
}else{
b[9]=b[9]+1;	
}
}


for(int i=0;i<10;i++){
System.out.println("b["+i+"]="+b[i]);
}

}	
}