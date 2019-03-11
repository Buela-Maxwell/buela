import java.util.*;
public class armstrong
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=in.nextInt();
        int x=n,a,sum=0;
        while(x!=0)
        {
            a=x%10;
            sum+=(a*a*a);
            x=x/10;
        }
        if(n==sum)
            System.out.println("n is an armstrong number");
        else
            System.out.println("n is not an armstrong number");
    }
 }
