import java.util.Scanner;
public class voweltonextchar
{static void main(){Scanner in =new Scanner (System.in);
    System.out.println("Enter what you want");
    String g=in.nextLine(),u=""; g=g.trim();
    for(int i=0;i<g.length();i++){
        String h="";h+=g.charAt(i);
        if(h.matches("[aeiouAEIOU]")){if(i!=g.length()-1)u+=g.charAt(i+1) ;
    else u+=' ';}
            else u+=g.charAt(i);}System.out.println(u);
}
}
