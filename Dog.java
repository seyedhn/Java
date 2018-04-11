public class Dog implements Pet{

private int age, length, height;
private String species, foodlvl;

public Dog(){
age=0;
length=0;
height=0;
species="";
foodlvl="";
}

public Dog(int sen, int tool, int ghad, String nejad, String ghaza){
age = sen;
length = tool;
height = ghad;
species = nejad;
foodlvl = ghaza;
}


public String speak(){
String talk = "vaaaaagh";
return talk;
}

public int lifetime(){
	int lifetime=0;

	if(foodlvl =="high" && age >= 10)
	lifetime = 13;
	if(foodlvl =="high" && age <10)
	lifetime = 15;
	if(foodlvl == "medium" && age >=10)
	lifetime = 16;
	if(foodlvl == "medium" && age <10)
	lifetime = 13;
	if(foodlvl =="low" && age >=10)
	lifetime = 18;
	if(foodlvl == "low" && age <10)
	lifetime = 11;
return lifetime;
}

public int maxspeed(){
	int maxspeed=0;

	if((length/height) >= 2 && species == "chienloup")
	maxspeed = 35;
	if((length/height) < 2 && species == "chienloup")
		maxspeed = 30;
	if((length/height) >= 2 && species == "doberman")
		maxspeed = 26;
	if((length/height) < 2 && species == "doberman")
		maxspeed = 23;
	return maxspeed;
}












}