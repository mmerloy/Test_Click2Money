package model;

import java.util.*;

/**
 * @author mmerloy
 */
public class Check
{

    public static int intCheck()
    {
        int number = 0;
        boolean CorrectValues;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        do
        {
            try
            {
                CorrectValues = true;
                number = in.nextInt();
                if (number < 0)
                    throw new InputMismatchException ();
            }
            catch (InputMismatchException e)
            {
                CorrectValues = false;
                System.out.println("\nЭто должно быть целое положительное число число. Попробуйте ещё раз\n");
                in.nextLine();
            }
        }
        while (!CorrectValues);

        return number;
    }
}