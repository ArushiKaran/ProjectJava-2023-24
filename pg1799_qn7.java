import java.util.Scanner;
public class pg1799_qn7
{public static void main(){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter Integers");
     int n, s=0,p=1;
    for(int i=0;i<10;i++){n=in.nextInt();s+=n;p*=n;}
    String c=(Integer.toString(s))+(Integer.toString(p));
    System.out.println(c);
}
}
