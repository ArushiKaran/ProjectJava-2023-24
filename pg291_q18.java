import java.util.Scanner;
public class pg291_q18
{
    static void main(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter string");
        String s=in.next(),p="";int x=s.length();
        for(int i=--x;i>-1;i--)
           p+=s.charAt(i);
           
       if(p.equalsIgnoreCase(s))
       System.out.println("palindrome");
       else if (Character.toUpperCase(s.charAt(0))== Character.toUpperCase( s.charAt(x)))
       System.out.println("special");
       else System.out.println("neither");
    }
}
