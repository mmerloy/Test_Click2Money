package model;

import java.math.BigInteger;

public class Fibonacci
{
    /**
     * fibonacciRecursion вычисление последовательности Фибоначчи с помощью рекурсии
     * @param num - номер элемента пос-ти, до которого необходимо вычисление пос-ти Фибоначчи.
     */
    public static BigInteger fibonacciRecursion(int num)
    {
        if (num <= 1) {
            return new BigInteger("0");
        } else if (num == 2) {
            return new BigInteger("1");
        } else {
            return fibonacciRecursion(num - 1).add(fibonacciRecursion(num - 2));
        }
    }

    /**
     * fastFibonacci вычисление последовательности Фибоначчи с помощью квадрирования.
     * @param n - номер элемента пос-ти, до которого необходимо вычисление пос-ти Фибоначчи.
     */
    public static BigInteger fastFibonacci(int n)
    {
        if(n <= 1) new BigInteger("0");
        if(n == 2) new BigInteger("1");
        BigInteger[] sol = fastFibonacciHelp(n);

        return sol[1];
    }

    /**
     * fastFibonacciHelp метод, помогающий в вычислении пос-ти Фибоначчи.
     * @param n - номер элемента пос-ти необходимого для вычисления пос-ти Фибоначчи.
     */
    public static BigInteger[] fastFibonacciHelp(int n)
    {
        if(n == 1)
        {
            return new BigInteger[]{
                    BigInteger.valueOf(0),
                    BigInteger.valueOf(1)
            };
        }
        int m = n / 2;

        BigInteger[] temp = fastFibonacciHelp(m);

        BigInteger fPrev = temp[0];
        BigInteger fCur = temp[1];

        BigInteger prev = (fPrev.multiply(fPrev)).add(fCur.multiply(fCur));
        BigInteger cur = fCur.multiply(fPrev.multiply(BigInteger.valueOf(2)).add(fCur));
        BigInteger next = prev.add(cur);

        if(n % 2 == 0)
        {
            return new BigInteger[] {prev, cur};
        }
        else
        {
            return new BigInteger[] {cur, next};
        }
    }
}

