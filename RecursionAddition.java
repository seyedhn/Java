public class RecursionAddition{

public static void main(String [] args){
	System.out.println(Addition(12));
}

 public static int Addition(int x){


 	if(x == 0)
		return 0;

 	if(x%2!=0)
 		return (Addition(x-1));

  		return (x+Addition(x-2));


}
}