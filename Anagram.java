import java.util.*;
import java.lang.String;
class Anagram
{

 public static void main(String args[])
 { 
   Scanner s=new Scanner(System.in);
   System.out.println("ENTER STRINGS");
    String s1=s.next();
    String s2=s.next();
    if(s1.length()==s2.length()){
    char c1[]=s1.toCharArray();
    char c2[]=s2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    if(Arrays.equals(c1,c2))
      System.out.println("anagram");
    else
      System.out.println("not a anagaram");
    }
  
 }
}