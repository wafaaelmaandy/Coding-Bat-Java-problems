/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatjava;

/**
 *
 * @author Wafaa Elsaeed
 */
public class Logic2 {
     public static void main(String[] args) {
        // TODO code application logic here
    }
     
    //http://codingbat.com/prob/p183562
     
       public boolean makeBricks(int small, int big, int goal) {
  
            return  small+(5*big)==goal ||
          small+(5*big)>goal&&((goal-small)%5==0||5*big<goal&&small>=goal-5*big)
          ||5*big==goal||small==goal||goal%5!=0&&5*big>goal&&small>=goal%5;
        
}
       
       
       //http://codingbat.com/prob/p117019
       public int blackjack(int a, int b) {
  if (a>21&&b>21)
  return 0 ;
  else if ((a<21&&b<21&&a>b)||(a<21&&b>21))
  return a ;
  else if ((a<21&&b<21&&a<b)||(a>21&&b<21))
  return b ;
  else
  return 21;
}
       
       
       //http://codingbat.com/prob/p186753
       public int roundSum(int a, int b, int c) {
  return round10(a)+round10(b)+round10(c) ;
}
public int round10(int num ){
  String s = (num+"") ;
  String f =s.charAt(s.length()-1)+"" ;
  int d= Integer.parseInt(f);
  if(s.length()==1&&d<5)
  return 0;
  else if(s.length()==1&&d>=5)
  return 10;
   else if (d>=5)
  return ((s.length()-1)*10)*(num/((s.length()-1)*10)) +10 ;
  else return (s.length()-1)*10*(num/((s.length()-1)*10)) ;
}




//http://codingbat.com/prob/p130788
public int luckySum(int a, int b, int c) {
  if (a!=13&&b!=13&&c!=13)
  return a+b+c ;
  else if (a==13)
  return 0 ;
  else if (b==13)
  return a;
  else
  return a+b;
}


//http://codingbat.com/prob/p191363
public int makeChocolate(int small, int big, int goal) {
  if((small+(5*big))>goal&&5*big<goal)
  return goal-(5*big) ;
  else if((small+(5*big))>goal&&5*big>=goal&&goal%5==0)
  return 0 ;
   else if((small+(5*big))>goal&&5*big>goal&&goal%5!=0&&goal%5<=small)
  return goal%5;
   else if(((small+(5*big))<goal)||((small+(5*big))>goal&&5*big>goal&&goal%5!=0&&goal%5>small))
   return -1;
   else
   return small;
   
}

       
    
}
