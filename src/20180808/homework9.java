import java.util.Random;
public class homework9{
public static void main(String args[]){
Random r= new Random();
int rr=1+r.nextInt(Integer.MAX_VALUE);
System.out.println("原数："+rr);
while(rr!=1){
if(rr%2==0){
rr=rr/2;
}else{
rr=rr*3+1;
}
System.out.println("现数："+rr);

}



}

}