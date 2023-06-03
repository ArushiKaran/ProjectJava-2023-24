import java.util.Scanner;
public class reversesentence
{ static void main(){
       Scanner in=new Scanner(System.in);
    System.out.println("Enter sentence");
    String s=in.nextLine(),r="",w="";s=s.trim();
    int l=s.length()-1,b=0,v=s.indexOf(' ');
    for(int i=l;i>-1;i--){
        
        if( s.charAt(i)==' '){
           
            
            b=i+1;
            w=s.substring(b,l+1);
            l=i-1;r+=w+" ";}
             
        else continue;if(i==v){w=s.substring(0,++v);r+=w+" ";}
    }
    System.out.println(r);
   }}

