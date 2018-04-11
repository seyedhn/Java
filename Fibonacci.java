public class Fibonacci{

public static void main(String [] args){

System.out.println(Fino(9));
}

public static int Fino(int n){


while(n>2){


return Fino(n-2)+Fino(n-1);

}
if(n==1)
return 0;
if(n==2);
return 1;

}
}
