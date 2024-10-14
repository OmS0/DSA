import java.util.*;
public class fibonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1=0, n2=1, n3, i, c;
        System.out.print("Enter The Count :");
        c=sc.nextInt();
        System.out.print(n1+" "+n2);
        for(i=2; i<c; i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }

}
