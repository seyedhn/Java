/* Find a four-digit number that if multiplied by 4, will become its reverse */

public class riddle8{
public static void main(String [] args){

int a,b,c,d, num;

for(d=1;  d<10; d++){
for(c=1;  c<10; c++){
for(b=1;  b<10; b++){
for(a=1;  a<10; a++){

num = 1000*d + 100*c + 10*b + a;

if(num*4 == (1000*a + 100*b + 10*c + d))
System.out.println(num);

}}}}

}}
