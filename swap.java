import java.util.Random;
public class swap{
public static void main(String [] args){
Random generator = new Random();

int [] array = new int[11];

for(int k=0; k<array.length; k++){
array[k] = generator.nextInt(100);

System.out.print(array[k] + " ");
}




int right=array.length-1, left=0, temp=left;

while(right > left){

array[temp] = array[left];
array[left] = array[right];
array[right] = array[temp];

left++;
right--;
}
System.out.println();


for(int j=0; j<array.length; j++){
System.out.print(array[j]+ " ");
}

}
}
