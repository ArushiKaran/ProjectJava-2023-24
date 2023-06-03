import java.util.Scanner;
public class pg180_qn10
{static void main(){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter 1 to see uppercase letters from Z to A and 2 to display lowercase letters from a to z.");
    int ch=in.nextInt();
    switch(ch){
        case 1:
            for(int i=0;i<5;i++)System.out.println((char) (65+i));
        break;
        
        case 2:
            for(int i=26;i>21;i--)System.out.println((char) (96+i));
        break;
    }
}
}
