public class homework4{
	public static void main(String args[]){
		boolean b=true;
		for(int i=101;i<=200;i++){
			for(int j=2;j<i;j++){
				if(i%j==0){
					b=false;
				}
			}
		if(b==true){
			System.out.println(i+" ");
		}
		}
		
	}
}