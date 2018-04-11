/* An interactive TicTacToe game with multiplayer and single player options.
The single player has three difficulties: Easy, Medium, Hard.
The Hard difficulty is unbeatable. */

import java.util.Scanner;
import java.util.Random;

public class TicTacToe{

private static int turns;
private static boolean show;
private static int secondary;

//-----------------------------------------------------------------------
public static void main(String [] args){

String [][] table = {{" "," "," "},
					 {" "," "," "},
					 {" "," "," "}};

Type();

Showtable(table);

for(int i=0; i<9; i=turns){

	if(Input(table,turns) < 10){


		if(show == true){
		Showtable(table);
		System.out.println();}


		if(!(Condition(table).equals("")))
			turns = 9;

		if(turns == 9 && Condition(table).equals(""))
			System.out.println("Tie");

		}

	System.out.print(Condition(table));
	}
	System.out.println();
}

//-----------------------------------------------------------------------
public static int Type(){

Scanner question = new Scanner(System.in);
System.out.println("1.Multiplayer    2.Beginner    3.Medium    4.Expert");
secondary = question.nextInt();
return secondary;

}

//-----------------------------------------------------------------------
public static void GoRandom(String [][] table){

Random generator = new Random();
int Xger = generator.nextInt(3);
int Yger = generator.nextInt(3);

	if(table[Xger][Yger].equals(" ")){
		table [Xger][Yger] = "O";
		turns++;
		show = true;}

}

//-----------------------------------------------------------------------
public static void FillCell(String [][] table, int x, int y){

	if(table[x][y].equals(" ")){
		table[x][y] = "O";
		turns++;
		show =true;}

}

//-----------------------------------------------------------------------
public static void Showtable(String [][] table){

System.out.println(table[0][0]+"|"+table[0][1]+"|"+table[0][2]);
System.out.println("- - -");
System.out.println(table[1][0]+"|"+table[1][1]+"|"+table[1][2]);
System.out.println("- - -");
System.out.println(table[2][0]+"|"+table[2][1]+"|"+table[2][2]);

}

//-----------------------------------------------------------------------
public static int Input(String [][] table, int x){

show = false;

	if(secondary == 1)
		Multi(table);


	if(secondary == 2){
		Beginner(table);}


	if(secondary == 3){
		Beginner(table);
		Medium(table);
		Fill2Row(table);}


	if(secondary == 4){
		Beginner(table);
		Medium(table);
		Fill2Row(table);
		Expert(table);}


	if(show == false && turns%2 != 0)
		GoRandom(table);

	if(secondary > 4 || secondary < 1)
		turns =9;

return turns;

}

//-----------------------------------------------------------------------
public static void Multi(String [][] table){

Scanner reader = new Scanner(System.in);

int Xcoor = reader.nextInt();
int  Ycoor = reader.nextInt();


	if(table[Xcoor][Ycoor].equals(" ")){

		if (turns%2 == 0)
		table [Xcoor][Ycoor] =  "X";

			else
			table [Xcoor][Ycoor] =  "O";

	show = true;
	turns++;
		}

}

//-----------------------------------------------------------------------
public static void Beginner(String [][] table){

Scanner reader = new Scanner(System.in);

	if(turns%2 == 0){

		int Xcoor = reader.nextInt();
		int  Ycoor = reader.nextInt();

		if(table[Xcoor][Ycoor].equals(" ")){
			table [Xcoor][Ycoor] = "X";
			turns++;
			show = true;}

	}

}

//-----------------------------------------------------------------------
public static void Medium(String [][] table){


	if(turns == 1 && table[1][1].equals(" "))
	  	FillCell(table,1,1);
	else if(turns ==1 && table[1][1].equals("X"))
		FillCell(table,0,0);

}

//-----------------------------------------------------------------------
public static void Fill2Row(String [][] table){

	if(turns != 1 && turns%2 != 0){
		int i=0;

			while(show == false && i<3){


				 if(table[i][0].equals("O") && table[i][1].equals("O") && table[i][2].equals(" "))
				 FillCell(table,i,2);
			else if(table[i][0].equals("O") && table[i][2].equals("O") && table[i][1].equals(" "))
				FillCell(table,i,1);
			else if(table[i][1].equals("O") && table[i][2].equals("O") && table[i][0].equals(" "))
				FillCell(table,i,0);
			else if(table[0][i].equals("O") && table[1][i].equals("O") && table[2][i].equals(" "))
				FillCell(table,2,i);
			else if(table[0][i].equals("O") && table[2][i].equals("O") && table[1][i].equals(" "))
				FillCell(table,1,i);
			else if(table[1][i].equals("O") && table[2][i].equals("O") && table[0][i].equals(" "))
				FillCell(table,0,i);
			else if(table[0][2].equals("O") && table[2][0].equals("O") && table[1][1].equals(" "))
				FillCell(table,1,1);
			else if(table[0][2].equals("O") && table[1][1].equals("O") && table[2][0].equals(" "))
				FillCell(table,2,0);
			else if(table[1][1].equals("O") && table[2][0].equals("O") && table[0][2].equals(" "))
				FillCell(table,0,2);
			else if(table[0][0].equals("O") && table[1][1].equals("O") && table[2][2].equals(" "))
				FillCell(table,2,2);
			else if(table[0][0].equals("O") && table[2][2].equals("O") && table[1][1].equals(" "))
				FillCell(table,1,1);
			else if(table[1][1].equals("O") && table[2][2].equals("O") && table[0][0].equals(" "))
				FillCell(table,0,0);

				i++;

		}
	}

	if(turns != 1 && turns%2 != 0 && show == false){
		int i=0;

			while(show == false && i<3){

				 if(table[i][0].equals("X") && table[i][1].equals("X") && table[i][2].equals(" "))
				FillCell(table,i,2);
			else if(table[i][0].equals("X") && table[i][2].equals("X") && table[i][1].equals(" "))
				FillCell(table,i,1);
			else if(table[i][1].equals("X") && table[i][2].equals("X") && table[i][0].equals(" "))
				FillCell(table,i,0);
			else if(table[0][i].equals("X") && table[1][i].equals("X") && table[2][i].equals(" "))
				FillCell(table,2,i);
			else if(table[0][i].equals("X") && table[2][i].equals("X") && table[1][i].equals(" "))
				FillCell(table,1,i);
			else if(table[1][i].equals("X") && table[2][i].equals("X") && table[0][i].equals(" "))
				FillCell(table,0,i);
			else if(table[0][2].equals("X") && table[2][0].equals("X") && table[1][1].equals(" "))
				FillCell(table,1,1);
			else if(table[0][2].equals("X") && table[1][1].equals("X") && table[2][0].equals(" "))
				FillCell(table,2,0);
			else if(table[1][1].equals("X") && table[2][0].equals("X") && table[0][2].equals(" "))
				FillCell(table,0,2);
			else if(table[0][0].equals("X") && table[1][1].equals("X") && table[2][2].equals(" "))
				FillCell(table,2,2);
			else if(table[0][0].equals("X") && table[2][2].equals("X") && table[1][1].equals(" "))
				FillCell(table,1,1);
			else if(table[1][1].equals("X") && table[2][2].equals("X") && table[0][0].equals(" "))
				FillCell(table,0,0);

				i++;

		}
	}
}

//-----------------------------------------------------------------------
public static void Expert(String [][] table){

	if(turns == 3){

				if(show == false && table[1][1].equals("O") && table[0][0].equals("X") && table[2][2].equals("X") ||
				   show == false && table[1][1].equals("O") && table[0][2].equals("X") && table[2][0].equals("X"))
				   	FillCell(table,0,1);


				if(table[0][0].equals("O") && table[1][1].equals("X") && table[2][2].equals("X"))
					FillCell(table,2,0);

				if(table[1][1].equals("O") && table[2][2].equals("X") && table[1][0].equals("X") ||
				   table[1][1].equals("O") && table[0][0].equals("X") && table[2][1].equals("X"))
					FillCell(table,2,0);

				if(table[1][1].equals("O") && table[2][2].equals("X") && table[0][1].equals("X") ||
				   table[1][1].equals("O") && table[0][0].equals("X") && table[1][2].equals("X"))
					FillCell(table,0,2);

				if(table[1][1].equals("O") && table[0][2].equals("X") && table[2][1].equals("X") ||
				   table[1][1].equals("O") && table[2][0].equals("X") && table[1][2].equals("X"))
					FillCell(table,2,2);

				if(table[1][1].equals("O") && table[0][2].equals("X") && table[1][0].equals("X") ||
				   table[1][1].equals("O") && table[0][1].equals("X") && table[2][0].equals("X"))
					FillCell(table,0,0);

				if(table[1][1].equals("O") && table[0][1].equals("X") && table[1][0].equals("X"))
					FillCell(table,0,0);

				if(table[1][1].equals("O") && table[0][1].equals("X") && table[1][2].equals("X"))
					FillCell(table,0,2);

				if(table[1][1].equals("O") && table[1][2].equals("X") && table[2][1].equals("X"))
					FillCell(table,2,2);

				if(table[1][1].equals("O") && table[1][0].equals("X") && table[2][1].equals("X"))
					FillCell(table,2,0);

	}

}

//-----------------------------------------------------------------------
public static String Condition(String [][] table){

for(int i=0; i<3; i++){


	 if(table[i][0].equals("X") && table[i][1].equals("X") && table[i][2].equals("X") ||
		table[0][i].equals("X") && table[1][i].equals("X") && table[2][i].equals("X") ||
		table[0][0].equals("X") && table[1][1].equals("X") && table[2][2].equals("X") ||
		table[0][2].equals("X") && table[1][1].equals("X") && table[2][0].equals("X"))
	  return "X is winner";


	 if(table[i][0].equals("O") && table[i][1].equals("O") && table[i][2].equals("O") ||
		table[0][i].equals("O") && table[1][i].equals("O") && table[2][i].equals("O") ||
		table[0][0].equals("O") && table[1][1].equals("O") && table[2][2].equals("O") ||
		table[0][2].equals("O") && table[1][1].equals("O") && table[2][0].equals("O"))
	  return "O is winner";

		}
	  return "";

}



}
