import java.util.Scanner;
public class pg180_qn11
{static void main(){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a to see letters A to Z along with their unicode, and b to see letters z to a along with their unicode");
    char ch=in.next().charAt(0);
    System.out.println("Letters \tUnicode");
    switch(ch){
        case 'a':
            for(int i=0;i<26;i++)System.out.println((char) (65+i) +"\t \t"+ (65+i));
        break;
        
        case 'b':
            for(int i=26;i>0;i--)System.out.println((char) (96+i) +"\t \t"+ (96+i));
        break;
    }
}
}
