import java.util.*;
interface AdvancedArithmetic
{
    int divisor_sum(int n);
}

class calledMyCalculator implements AdvancedArithmetic
{
    @Override
    public int divisor_sum(int n)
    {
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            if(n % i ==0)
            {
                sum += i;
            }
        }
        return sum;
    }
}
public class p22
{
    public static void main(String[] args) {
        calledMyCalculator ob1 = new calledMyCalculator();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();
        if(n > 1000)
        {
            System.out.print("The value of n will be atmost 1000.");
        }
        else
        {
            System.out.print("sum of all its divisors : " + ob1.divisor_sum(n));
        }
        sc.close();
    }
}