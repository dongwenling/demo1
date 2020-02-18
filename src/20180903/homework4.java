import java.util.ArrayList;
import java.util.Scanner;
public class homework4{

public static void main(String args[]){


for(int j=1000;j<=2000;j++){
if(getNum(j)){
System.out.println(j+"  this is true");
getInt(j);
}
}
}


public static boolean  getNum(int y){
boolean type=false;
for(int i=2;i<y;i++){
if(y%i==0){
type=true;
}

}
return type;
}
  
public static void  getInt(int k){
int tmp=k;
ArrayList<Integer> a=new ArrayList<Integer>();
for(int p=1;p<k;p++){

for(int l=2;l<tmp;l++){
if(tmp%l==0){
tmp=tmp/l;
a.add(l);
break;
}
}
}
a.add(tmp);
for(int e=0;e<a.size();e++){
System.out.println(a.get(e)+" ");
}
}

}