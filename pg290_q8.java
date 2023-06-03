import java.util.Scanner;
public class pg290_q8
{static void main(){ Scanner in=new Scanner(System.in);
System.out.println("Enter string");
String s=in.nextLine(),a="";s=s.trim();a+=s.charAt(0);
for(int i=0;i<s.length();i++){
    if (s.charAt(i)==' ')
         a+=s.charAt(i+1);
         else
            continue;
}
a=a.toUpperCase();System.out.println(a);
}
}
