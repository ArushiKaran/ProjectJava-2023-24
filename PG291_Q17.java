import java.util.Scanner;
public class PG291_Q17
{
    static void main(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter string");
        String s=in.nextLine();s=s.toUpperCase();int c=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1))c++;
        }System.out.println(c);
    }
}
