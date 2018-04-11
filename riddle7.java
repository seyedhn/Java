/*Find a 9-digit number in which every digit (1-9) appears only once. The whole
number should be divisible by 9. If the last digit (the unit) is dropped, the number
should be divisble by 8, and so on until the first digit.*/

public class riddle7{
public static void main(String [] args){

int a,b,c,d,e,f,g,h,i, num;

for(i=1;  i<10;  i++){
for(h=1;  h<10;  h++){
for(g=1;  g<10;  g++){
for(f=1;  f<10;  f++){
for(e=1;  e<10;  e++){
for(d=1;  d<10;  d++){
for(c=1;  c<10;  c++){
for(b=1;  b<10;  b++){
for(a=1;  a<10;  a++){

if(
	  (1*h +10*i) % 2 ==0
	&&(1*g + 10*h +100*i) % 3 ==0
	&&(1*f + 10*g + 100*h + 1000*i) % 4 ==0
	&&(1*e + 10*f + 100*g + 1000*h + 10000*i) % 5 ==0
	&&(1*d + 10*e + 100*f + 1000*g + 10000*h + 100000*i) % 6 ==0
	&&(1*c + 10*d + 100*e + 1000*f + 10000*g + 100000*h + 1000000*i) % 7 ==0
	&&(1*b + 10*c + 100*d + 1000*e + 10000*f + 100000*g + 1000000*h + 10000000*i) % 8 ==0
	&&(1*a + 10*b + 100*c + 1000*d + 10000*e + 100000*f + 1000000*g + 10000000*h +100000000*i) % 9 ==0

	&& (a != b)	&&(a !=c) && (a!=d) && (a!=e) && (a!=f) && (a!=g) && (a!=h) && (a!=i)
	&& (b!=c) && (b!=d) && (b!=e) && (b!=f) && (b!=g) && (b!=h) && (b!=i)
	&& (c!=d) && (c!=e) && (c!=f) && (c!=g) && (c!=h) && (c!=i)
	&& (d!=e) && (d!=f) && (d!=g) && (d!=h) && (d!=i)
	&& (e!=f) && (e!=g) && (e!=h) && (e!=i)
	&& (f!=g) && (f!=h) && (f!=i)
	&& (g!=h) && (g!=i)
	&& (h!=i)	){

num = a + 10*b + 100*c + 1000*d + 10000*e + 100000*f + 1000000*g + 10000000*h +100000000*i;

	System.out.println(num);

}

}}}}}}}}}

}}
