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
public class Logic1 {
     public static void main(String[] args) {
        // TODO code application logic here
    }
     
    //http://codingbat.com/prob/p159531
    public boolean cigarParty(int cigars, boolean isWeekend) {
  return(isWeekend==true&&cigars>=40) || (isWeekend==false&&cigars<=60 &&cigars>=40) ;
  
}
    
    //http://codingbat.com/prob/p193613
    public boolean nearTen(int num) {
  return (num%10<=2||num%10>=8);
}
    
    //http://codingbat.com/prob/p169213
    public boolean lastDigit(int a, int b, int c) {
  String d = a+""; 
  String s =b+"";
  String k =c+"";
  int l=1 ; 
  return d.charAt(d.length()-1)==s.charAt(s.length()-1) 
  || k.charAt(k.length()-1)==s.charAt(s.length()-1)
  ||d.charAt(d.length()-1)==k.charAt(k.length()-1) ;
}
    
//http://codingbat.com/prob/p137365
    public boolean in1To10(int n, boolean outsideMode) {
  return (n>=1 &&n<=10 &&outsideMode==false )|| ((n<=1||n>=10)&&outsideMode==true);
}
    
    //http://codingbat.com/prob/p178728
    public int teenSum(int a, int b) {
  if (a>=13 && a<=19||b>=13 && b<=19)
  return 19 ;
  else return a+b ;
}
    
    //http://codingbat.com/prob/p179196
    public boolean lessBy10(int a, int b, int c) {
  int high = Math.max(a,b);
  high = Math.max(high, c);
   return (high - a >= 10 || high - b >= 10 || high - c >=10) ;
}
    
    //http://codingbat.com/prob/p141061
    public boolean squirrelPlay(int temp, boolean isSummer) {
  return (isSummer==false&&temp>=60&&temp<=90)||(isSummer==true&&temp>=60&&temp<=100) ;
}
    
    //http://codingbat.com/prob/p110973
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if((isMorning==true&&isMom==false)||isAsleep==true)
  return false ;
  else 
  return true ;
}
    
    //http://codingbat.com/prob/p140272
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  return(a<b&&a<c&&b<c)||(a==b&&a<c&&equalOk==true)||(a==b&&a==c&&equalOk==true)||
  (c==b&&b>a&&equalOk==true);
}
    
//http://codingbat.com/prob/p115233
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  if( noDoubles ==true&&die1==die2&&die1!=6)
  return (die1*2)+1;
  else if(noDoubles ==true&&die1==die2&&die1==6)
  return 7;
  else
  return die1+die2;
}
    
//http://codingbat.com/prob/p120633
    public int greenTicket(int a, int b, int c) {
  if(a==b&&a==c)
  return 20 ;
  else if(a!=b&&b!=c&&a!=c)
  return 0 ;
   else 
   return 10 ;
}
    
//http://codingbat.com/prob/p118077
    public   int sumLimit(int a, int b) {

   if ((a+"").length()!= (a+b+"").length())
   return a;
     else 
     return a+b ;
}
    
}
