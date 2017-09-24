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
public class String1 {
     public static void main(String[] args) {
        // TODO code application logic here
    }
     
    //http://codingbat.com/prob/p171896
    public String helloName(String name) {
  return "Hello "+name+"!";

}
    
    //http://codingbat.com/prob/p162477
    public String theEnd(String str, boolean front) {
  if (front==true)
  return str.charAt(0)+"";
  else return str.charAt(str.length()-1)+"";
}
    
    //http://codingbat.com/prob/p138183
    public String lastChars(String a, String b) {
  if(a.length()==0&&b.length()==0)
  return "@@";
  else if(a.length()==0&&b.length()>0)
  return "@"+b.charAt(b.length()-1);
   else if(b.length()==0&&a.length()>0)
  return a.charAt(0)+"@";
  else return a.charAt(0)+""+b.charAt(b.length()-1)+"";
  
}
    
    //http://codingbat.com/prob/p141494
    public String startWord(String str, String word) {
  if(word.length()==1&&str.length()>=1)
  return str.charAt(0)+"";
   else if(word.length()==1&&str.length()==0||(str.length()==1))
  return "";
  else if ( str.substring(1,word.length()).equals(word.substring(1,word.length())))
  return str.charAt(0)+""+word.substring(1,word.length()) ;
  else return "";
}
    
    //http://codingbat.com/prob/p142247
    public String without2(String str) {
  if(str.length()==3)
  return str.charAt(1)+"";
 else  if((str.length()==0)||(str.length()==2))
  return "";
  if(str.length()==1)
  return str;
  else if (str.substring(0,2).equals(str.substring(str.length()-2,str.length()))
   !=false&&str.length()>3) 
         return str.substring(2,str.length());
  else 
       return str;
        
}
    
    //http://codingbat.com/prob/p174254
    public String withouEnd2(String str) {
  if(str.length()<=2)
  return "";
 
  else return str.substring(1,str.length()-1);
}
    
    //http://codingbat.com/prob/p108853
    public String extraEnd(String str) {
  return str.substring(str.length()-2,str.length())+ str.substring(str.length()-2,str.length())+ 
  str.substring(str.length()-2,str.length());
}

    
}
