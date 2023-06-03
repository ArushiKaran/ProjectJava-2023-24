import java.util.Scanner;
public class pg180_qn12_1
{static void main(){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a to see the first pattern and b to see the second pattern");
    char ch=in.next().charAt(0);
    switch(ch){
        case 'a':
            for(int i=0;i<5;i++){
                if(i%2==0) {
                    for(int j=0;j<(i+1);j++) System.out.print((char) (65+j));
                    System.out.println("");
                        }
                        else {
                            for(int j=0;j<(i+1);j++) System.out.print((char)(97+j));
                            System.out.println("");
                        }
            }
            break;
        case 'b':
            for(int i=5;i>0;i--){
                    for(int j=1;j<=i;j++){if(j==5)System.out.print((char)(90-j));else System.out.print((char)(91-j));
                    }System.out.println("");
    }}
}
}
