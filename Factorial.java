public class Factorial{

public static void main(String [] args){
	System.out.println(Factorial(8));
}

 public static int Factorial(int x){



 	if(x == 0)
	return 1;

 	return (x*Factorial(x-1));


}
}
