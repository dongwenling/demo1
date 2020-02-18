//200以内可被3整除的数字之和
public class homework3{
   public static void main(String args[]){
    int s=0;
    for(int i=1;i<=200;i++){
       if(i%3==0)
       {         
       s=s+i ;
        }
        }
      System.out.println("200以内可被3整除的数字之和为："+s);
   }
}