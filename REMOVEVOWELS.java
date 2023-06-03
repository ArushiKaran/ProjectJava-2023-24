import java.util.*;
public class REMOVEVOWELS
{
    
    static void main(){
        Scanner in=new Scanner(System.in);
        String g=in.nextLine(),u=""; g=g.trim();
    for(int i=0;i<g.length();i++){
        String h="";h+=g.charAt(i);
        if(h.matches("[aeiouAEIOU]"))continue;
            else u+=g.charAt(i);}System.out.println(u);;
        
    }
}
