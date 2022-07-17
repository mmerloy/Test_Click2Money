package controller;

import model.*;
import view.*;

import java.math.BigInteger;
import java.util.function.Function;

/**
 * @author Марина Алина(telegram:@mmerloy)
 * @version 0.0.5
 * @since 18.07.2022 2:36
 */
public class Controller {

    //Вопросы
    public static void main(String[] args) {

        while (true)
        {
            int choose = 0, m;
            View.mainMenu();
            m = Check.intCheck();
            Function<Integer, BigInteger> fibonacciFunc = Fibonacci::fastFibonacciRecursion;
            if (m == 1)
            {
                fibonacciFunc = Fibonacci::fibonacciRecursion;
                View.userMenu();
                choose = Check.intCheck();
            }
            else if (m == 2)
            {
                View.userMenu();
                choose = Check.intCheck();
            }
            else if (m == 0)
                break;
            else if (m > 3 || m < 0)
            {
                View.print("Извините, система не может принять такой ответ. Попробуйте еще раз.");
                continue;
            }

            switch (choose)
            {
                case 1 -> {
                    View.showMenuTitle(View.TitlesType.FistFunction);
                    int n = Check.intCheck();
                    System.out.printf("%d\n", fibonacciFunc.apply(n));
                    View.delimeter();
                }
                case 2 -> {
                    View.showMenuTitle(View.TitlesType.SecondFunction);
                    int n = Check.intCheck();
                    int i = 1;
                    while (i <= n) {
                        System.out.printf("%d\s", fibonacciFunc.apply(i));
                        i++;
                    }
                    View.delimeter();
                }
                case 3 -> {
                    View.showMenuTitle(View.TitlesType.ThirdFunction);
                    int n = Check.intCheck();
                    int i = 100;
                    while (n <= i) {
                        System.out.printf("%d\s", fibonacciFunc.apply(n));
                        n++;
                    }
                    View.print("...");
                    View.delimeter();
                }
                default ->
                        View.print("Программа не может принять такой ответ, попробуйте еще раз.");
            }

        }
    }
}