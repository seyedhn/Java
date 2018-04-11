public class Cat implements Pet{

private int age, length, height;
private String species, foodlvl;

public Cat(){
age=0;
length=0;
height=0;
species="";
foodlvl="";
}

public Cat(int sen, int tool, int ghad, String nejad, String ghaza){
age = sen;
length = tool;
height = ghad;
species = nejad;
foodlvl = ghaza;
}


public String speak(){
String talk = "meeuww";
return talk;
}

public int lifetime(){
	int lifetime=0;

	if(foodlvl =="high" && age >= 8)
	lifetime = 11;
	if(foodlvl =="high" && age <8)
	lifetime = 13;
	if(foodlvl == "medium" && age >=8)
	lifetime = 14;
	if(foodlvl == "medium" && age <8)
	lifetime = 12;
	if(foodlvl =="low" && age >=8)
	lifetime = 15;
	if(foodlvl == "low" && age <8)
	lifetime = 10;
return lifetime;
}

public int maxspeed(){
	int maxspeed=0;

	if((length/height) >= 2 && species == "persian")
	maxspeed = 20;
	if((length/height) < 2 && species == "persian")
		maxspeed = 17;
	if((length/height) >= 2 && species == "not persian")
		maxspeed = 14;
	if((length/height) < 2 && species == "not persian")
		maxspeed = 11;
	return maxspeed;
}

public int getLifetime(){
	return lifetime;
}

public int getMaxspeed(){
	return maxspeed;
}



public String toString(){
	String str = "CAT\n"
	+ "Lifetime: ("lifetime")\n"
	+ "Maximum speed: ("maxspeed")\n"
	+ "Speak: " + speak();
	return str;
}









}