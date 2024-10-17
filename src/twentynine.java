import java.util.*;
public class twentynine
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, total1=0, total2=0, total3=0, total4=0, total=0;
        System.out.print("Input a: ");
        a=sc.nextInt();
        System.out.print("Input b: ");
        b=sc.nextInt();
        System.out.print("Input c: ");
        c=sc.nextInt();
        System.out.print("Input d: ");
        d=sc.nextInt();
        if (a>=1 && a<=13)
        {
            if (a==1 || a==10)
                total1 = total1+1;
            else if (a==9)
                total1 = total1+2;
            else if (a==11)
                total1 = total1+3;
            else
                total1 = total1+0;
        }
        if (b>=1 && b<=13)
        {
            if (b==1 || b==10)
                total2 = total2+1;
            else if (b==9)
                total2 = total2+2;
            else if (b==11)
                total2 = total2+3;
            else
                total2 = total2+0;
        }
        if (c>=1 && c<=13)
        {
            if (c==1 || c==10)
                total3 = total3+1;
            else if (c==9)
                total3 = total3+2;
            else if (c==11)
                total3 = total3+3;
            else
                total3 = total3+0;
        }
        if (d>=1 && d<=13)
        {
            if (d==1 || d==10)
                total4 = total4+1;
            else if (d==9)
                total4 = total4+2;
            else if (d==11)
                total4 = total4+3;
            else
                total4 = total4+0;
        }
        else
            System.out.println("Wrong Input");
        total=total1 + total2 + total3 + total4;
        System.out.println("Total Points: "+total);
    }
}
