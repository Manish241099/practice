import java.util.*;
public class FizzBuzz
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the limits");
        int n =sc.nextInt();
        for (int i =1;i<n;i++)
        {
            if(i%3==0)
            {
                System.out.println("fizz "+i);
            }
            if (i%5==0) {
                System.out.println("Buzz "+i);
        }
            if (i%3 ==0 & i%7==0)
            {
                System.out.println("Fizzbuzz"+i);
            }
        }
    }
}
