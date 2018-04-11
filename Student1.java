public class Student1{
public static void main(String [] args){
Student s1, s2;

s1 = new Student();
s1.setName("Aref");
s1.setScore(1,57);
s1.setScore(2,59);
s1.setScore(3,76);
System.out.println(s1);

s2 = new Student();
s2.setName("Behrad");
s2.setScore(1,100);
s2.setScore(2,98);
s2.setScore(3,99);
System.out.println(s2);


int stu1, stu2, aver;
stu1 = s1.getAverage();
stu2 = s2.getAverage();
aver = (stu1 + stu2) / 2;
System.out.println("The average of both students is " + aver);

int score12, score22, scoreav;
score12 = s1.getScore(2);
score22 = s2.getScore(2);
scoreav = (score12 + score22) / 2;
System.out.println("The average of the second tests of the 2 students is " + scoreav);


}
}