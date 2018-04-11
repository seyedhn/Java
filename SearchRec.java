public class SearchRec{

public static void main(String [] args){

int [] array = {12,14,17,21,22,23,32,34,66,75,80,91,98};

System.out.println(Search(array, 99 , 0 ,array.length-1));

}






public static int Search(int [] array, int SearchValue, int left,int right){


int midpoint = (left+right)/2;


if(array[midpoint] < SearchValue)
	left = midpoint+1;

	else
	right = midpoint-1;

if(left< right+1)
return Search(array, SearchValue, left, right);
else
if(array[midpoint] != SearchValue)
return -1;
return midpoint;


}
}