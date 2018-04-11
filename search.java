//Search for a number in a sorted array

public class search{

public static void main(String [] args){

int [] array = {12,14,17,21,22,23,32,34,66,75,80,91,98};

System.out.println(Search(array, 12));

}

public static int Search(int [] array, int SearchValue){

int left=0, right= array.length-1;

int midpoint;

while(left < right+1){

	 midpoint = (left+right)/2;

	if (array[midpoint] == SearchValue)
		return midpoint;

	else
	if(array[midpoint] < SearchValue)
		left = midpoint+1;

		else
			right = midpoint-1;

}
return -1;

}
}
