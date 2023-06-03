import java.util.Scanner;
public class pg291_qn14
{static void main(){Scanner in=new Scanner (System.in);
    System.out.println("Enter string");String s=in.nextLine(),r="";
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||
        ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')r+=ch;
           else {char pn=(char)(ch-1);
               if(pn=='a' ||pn=='e' ||pn=='i' ||pn=='o' ||pn=='u' ||
        pn=='A' ||pn=='E' ||pn=='I' ||pn=='O' ||pn=='U')
            pn=(char)(ch+1);r+=pn;}
    }System.out.println(r);
}
}
