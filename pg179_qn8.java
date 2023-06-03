import java.util.Scanner;
public class pg179_qn8
{static void main(){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter 1 to see uppercase letters from Z to A and 2 to display lowercase letters from a to z.");
    int ch=in.nextInt();
    switch(ch){
        case 1:
            for(int i=26;i>0;i--)System.out.println((char) (64+i));
        break;
        
        case 2:
            for(int i=0;i<26;i++)System.out.println((char) (97+i));
        break;
        default: System.out.print ("GJG");    }
}
}
