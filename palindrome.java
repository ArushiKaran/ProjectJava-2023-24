import java.util.Scanner;
public class palindrome
{
   static void main(){
       Scanner in=new Scanner (System.in);
       System.out.println("enter word");
       String w=in.next(), s="";
       int j=w.length();
      for(int i=--j;i>-1;i--)s+=w.charAt(i);
           if(s.equalsIgnoreCase(w)) System.out.println("palindrome");
           else System.out.println("not palindrome");
       }
   }

