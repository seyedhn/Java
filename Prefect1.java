public class Prefect1{
public static void main (String [] args){

Prefect p1, p2, p3;
p1 = new Prefect();

p1.setName("Behrad");
p1.setResp1("Data Management");
p1.setResp2("Head Office");
p1.setPoint1(75);
p1.setPoint2(90);
	System.out.println(p1 + "\n");

p2 = new Prefect("Hossein", "Outdoor", "Anti-Bullying", 35, 55);
	System.out.println(p2 + "\n");

/*p3 = new Prefect(p2);
System.out.println(p3);
*/
}

}
