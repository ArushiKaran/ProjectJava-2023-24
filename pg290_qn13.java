import java.util.Scanner;
public class pg290_qn13
{static void man(){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter string");
    String s=in.next(),r="";
    s=s.toLowerCase();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
        r+=(char)(ch+1);
        else r+=ch;
    }
System.out.println(r);}
}
