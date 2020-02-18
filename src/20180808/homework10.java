public class homework10{
public static void main(String args[]){

int a=1;

for(int i=1;i<=10000;i++){
int s=1;
for(int j=2;j<i;j++){
if(i%j==0){
s=s+j;
}
}


if(s==i&&i!=1){
System.out.println(i);
}
}


}

}