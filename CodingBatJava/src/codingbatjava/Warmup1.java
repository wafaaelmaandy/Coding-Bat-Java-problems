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
public class Warmup1 {
     public static void main(String[] args) {
        // TODO code application logic here
    }
     
     
    // http://codingbat.com/prob/p187868
    public boolean sleepIn(boolean weekday, boolean vacation) {
  boolean r = true ;
  if(weekday== true&&vacation==false)
  r=false ;
  return r;
}
    
    //http://codingbat.com/prob/p116624
    public int diff21(int n) {
   int r = 0 ;
  if (n>21)
  r= 2*Math.abs(n-21) ;
  else r = Math.abs(21-n);
  return r ;
}
    //http://codingbat.com/prob/p190570
    public String missingChar(String str, int n) {
   String s ="";
  if(n==0)
  s =str.substring(1,str.length()) ;
  else
   s = str.substring(0,n) +str.substring(n+1,str.length()) ;
      return s ;

}
     //http://codingbat.com/prob/p151713
    public boolean mixStart(String str) {
  if(str.length()>=3)
  return(str.charAt(1)=='i'&&str.charAt(2)=='x') ;
  else return false ;
}
    //http://codingbat.com/prob/p173784
    public boolean stringE(String str) {
   int j =0 ;
  for(int i =0 ; i<=str.length()-1 ; i++){
    if (str.charAt(i)=='e')
           j++;
  }
  if (j<=3&&j!=0)
  return true ;
  else 
  return false ;
}
    
//http://codingbat.com/prob/p196441
    public String everyNth(String str, int n) {
    String d = "" ;
  for(int  i =0 ; i<=str.length()-1 ; i=i+n)
  { 
   
      d+=str.charAt(i)  ;
    
  }
  return d ;
}
    
    //http://codingbat.com/prob/p140449
    public boolean parrotTrouble(boolean talking, int hour) {
  if (talking ==true &&
  hour>20||talking==true &&hour <7 )
  return true ;
  else 
 return false ;
}
    
    //http://codingbat.com/prob/p192082
    public boolean icyHot(int temp1, int temp2) {
  return (temp1<0&&temp2>100) ||(temp2<0&&temp1>100) ;
}
    
    //http://codingbat.com/prob/p132134
    public boolean in3050(int a, int b) {
  if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
    return true;
  }
  if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
    return true;
  }
  return false;
  // This could be written as one very large expression,
  // connecting the two main parts with ||
}
    
    //http://codingbat.com/prob/p191914
    public String notString(String str) {
  if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
    return str;
  }
  
  return "not " + str;
}
    
   // http://codingbat.com/prob/p144535
    public boolean in1020(int a, int b) {
  return a>=10 &&a<=20 ||b<=20&&b>=20||b>=10 &&b<=20||a<=20&&a>=20 ;
}
    
    //http://codingbat.com/prob/p177372
    public int max1020(int a, int b) {
  int x = Math.max(a,b);
  if (x>=10&&x<=20 )
  return x ;
  else if(a==x&&b>=10&&b<=20) return b ;
  else if(b==x&&a>=10&&a<=20) return a ;
  else return 0 ;
}
    
//http://codingbat.com/prob/p125268
    public String endUp(String str) {
  if (str.length()<=3)
  return str.toUpperCase();
  else
  return str.substring(0,str.length()-3)+(str.substring(str.length()-3,str.length()).toUpperCase());
}

    
    
}
