import java.util.Scanner;
public class count
{
   static void main(){
       Scanner in=new Scanner(System.in);System.out.println("Enter string");
       String x=in.nextLine(), y="";
       int v=0,c=0,uc=0,lc=0;
       for(int i=0;i<x.length();i++){
           char ch=x.charAt(i);
           if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
               v++; 
           else { if (ch!=' ')c++;else y+=ch;}
           
           if (ch>64 && ch<91){uc++;ch=Character.toLowerCase(ch);y+=ch;
       }else if(ch>96 && ch<123){ lc++; ch=Character.toUpperCase(ch);y+=ch;}}
   System.out.println("Vowels+="+v);
   System.out.println("Consonants="+c);
   System.out.println("Upper case="+uc);
   System.out.println("Lower case="+lc);
   System.out.println(y);
 }
}
