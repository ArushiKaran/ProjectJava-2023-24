import java.util.Scanner;public class palindromesentence
{ static void main(){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter sentence");
    String s=in.nextLine(),r="";char ch=32;
    s=s.replaceAll("\\s+","");int y=s.length();
    for(int i=--y;i>-1;i--)r+=s.charAt(i);
    System.out.println(r);
    if(r.equals(s))System.out.println("Palindrome");
    else System.out.println("Not Palindrome");
  }
}
//dammit im mad