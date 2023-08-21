import java.util.*;
import java.lang.String;
class Anagram
{

 public static void main(String args[])
 { 
   Scanner s=new Scanner(System.in);
   System.out.println("ENTER STRINGS");
    String a=s.next();
    String b=s.next();
    if(a.length()==b.length()){
    char c1[]=a.toCharArray();
    char c2[]=b.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    if(Arrays.equals(c1,c2))
      System.out.println("anagram");
    else
      System.out.println("not a anagaram");
    }
  
 }
}