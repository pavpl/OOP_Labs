package lab1;
import java.util.InputMismatchException;
import java.util.Scanner;

class Lab1
{

    public static void main(String[] args)
    {
        int n = 0;
        while (true)
        {
            System.out.println("Введите число строк");
            Scanner sc1 = new Scanner(System.in);

            try
            {
                n=sc1.nextInt();
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.print("Вы ввели не число. ");
            }
        }
        //массив строк
        String[] str = new String[n];
        Scanner sc2 = new Scanner(System.in);
        //
        for (int i = 0; i < str.length; i++)
        {
            System.out.println("Введите строку №" + (i+1));
            str[i] = sc2.nextLine();
        }
        //поиск среднего значения длины строки
        float average = 0f;
        //общая длина строк
        for(String item: str) {
            average += (float) item.length();
        }
        //среднее арифметическое
        average /= str.length;

        System.out.println("Средняя длина строки = (" + average + ")");
        //Вывод результата
        for (int i = 0; i < n; i++)
        {
            if (str[i].length() < average)
            {
                System.out.println("Строка меньшая средней длины: ");
                System.out.println(str[i] + " , так же ее длина = " + str[i].length());
            }
        }
    }
}
