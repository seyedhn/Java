
public class Prefect {
private String name;
private String resp1;
private String resp2;
private int point1;
private int point2;
private int point3;

static private int prefectCount = 0;

public Prefect(){
	name = "";
	resp1 = "";
	resp2 = "";
	point1 = 0;
	point2 = 0;
	point3 = 0;

	prefectCount++;

}

public Prefect(String nm, String re1, String re2, int pnt1, int pnt2){
	name = nm;
	resp1 = re1;
	resp2 = re2;
	point1 = pnt1;
	point2 = pnt2;
	point3 = pnt1 + pnt2;

	prefectCount++;
}

public Prefect(Prefect p){
	name = p.name;
	resp1 = p.resp1;
	resp2 = p.resp2;
	point1 = p.point1;
	point2 = p.point2;
	point3 = p.point3;

}

public void setName (String nm){
	  name = nm;
}

public void setResp1 (String re1){
	  resp1 = re1;
}

public void setResp2 (String re2){
	  resp2 = re2;
}

public void setPoint1 (int pnt1){
	  point1 = pnt1;
}

public void setPoint2 (int pnt2){
	  point2 = pnt2;
	  point3= point2 + point1;
}

public String getName (){
	 return name;
}

public String toString(){

	  String str;
	  str = "Name:   " + name  + "\n" +
			"Resp1:  " + resp1 + "\n" +
			"Resp2:  " + resp2 + "\n" +
			"Point 1: " + point1 + "\n" +
			"Point 2: " + point2  + "\n" +
			"Sum of points: " + point3;
	  return str;
	}







public static void setPrefectCount(int prefectCount)
	{
		Prefect.prefectCount = prefectCount;
	}

	public static int getPrefectCount()
	{
		return prefectCount;
	}



}