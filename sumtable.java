public class sumtable{
public static void main(String [] args){

int [][] table = new int [5][5];

int [] sums = new int [5];
sums [0] = 0;
int i, j, sum=0 ;
for(i = 0; i<table.length; i++){
	for(j = 0; j<table.length; j++){
	table[i][j]= (i+1)*(j+1);
}

for(int [] row : table){
for(int element : row){

sums[i] = sums[i] + element;

}
//System.out.println(sums[i]);//
}

}

for(i=0; i < 5; i++)
System.out.println(sums[i]);
}
}