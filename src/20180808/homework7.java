public class homework7{
public static void main(String args[]){
int i=200;

while(i<=300){
boolean b=true;
for(int j=2;j<i;j++){
if(i%j==0){
  b=false;
  break;
}
}
if(b){
System.out.println(i);}

i+=1;
}
}

}