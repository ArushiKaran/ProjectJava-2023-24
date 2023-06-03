import java.util.Scanner;
public class pg180_qn12_2
{static void main(){
    Scanner in=new Scanner(System.in);
    System.out.println("enter");
    char ch=in.next().charAt(0);
    switch(ch){
        case 'e':
            for(int i=5;i>0;i--){
                for(int j=1;j<=i;j++){
                    System.out.print((char)(64+j)+"*");
                }System.out.println("");
            }
            break;
        case 'f':
            for(int i=0;i<4;i++){for(int j=0;j<5;j++) {
                      if(i<2)System.out.print((char)(97+i)+" ");
                      else System.out.print((char) (63+i)+" ");
            }System.out.println("");
    }
}
}   
 }
