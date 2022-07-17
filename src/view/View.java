package view;

public class View
{
    /**
     * mainMenu()- выводит начальное меню пользователя для выбора способа вычисления.
     */
    public static void mainMenu()
    {
        System.out.println("Вычисление последовательности Фибоначчи ");
        System.out.println("Завершение работы программы.......... 0 ");
        System.out.println("Рекурсия............................. 1 ");
        System.out.println("Улучшенная рекурсия.................. 2 ");
    }

    /**
     * userMenu()- выводит меню пользователя для выбора способа вывода полученных вычислений.
     */
    public static void userMenu()
    {
        System.out.println("1 - одно число, которое находится на n-ом месте последовательности");
        System.out.println("2 - все числа последовательности до n-го элемента последовательности");
        System.out.println("3 - все числа последовательности после n-го элемента последовательности(первые 100 чисел)");
        System.out.println("Вы хотите вывести:");
    }

    /**
     * Метод print - выводит на устройство вывода значение свойства или строку
     * @param message передаем ключ для отображения значения свойства или строку для печати
     */
    public static void print(String message)
    {
        System.out.println( message +"\n");
    }

    public enum TitlesType
    {
        FistFunction,
        SecondFunction,
        ThirdFunction
    }

    public static void delimeter()
    {
        System.out.println("\n---------------------------------------------------");
    }

    public static void showMenuTitle(TitlesType menuType){
        switch (menuType)
        {
            case FistFunction -> print("Введите номер элемента ряда Фибоначчи, который вы хотите вывести");
            case SecondFunction -> print("Введите номер элемента, до которого вы хотите вывести последовательность Фибоначчи");
            case ThirdFunction -> print("Введите номер элемента, после которого вы хотите вывести последовательность Фибоначчи");
        }
    }
}
