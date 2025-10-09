import java.util.Scanner;
public class лабораторная {
    public static void main(String[] args) {
        // Объявляем объект класса Scanner для ввода данных
        Scanner in = new Scanner(System.in);
        // Считываем с клавиатуры два целых числа
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a * (-1);
        if ((b==0) || ((a==0) && (b < 0)))
            System.out.println("Решения нет");
        else
            if ((a==0) && (b > 0))
                System.out.println("x < 0" + " " + "and" + " " + "x > 0");
            else
                if ((a < 0 && b < 0))  {
                // Если обе переменные отрицательны, то выводим ответ по схеме выше
                    System.out.println("x <= " + "" + c + " "+ "and" + " "  + "x > 0");
                } else {
                    if (a > 0 && b > 0)
                        System.out.println("x <= " + "" + c + " "+ "or" + " "  + "x > 0");
                    else
                        if (a < 0 && b > 0) {
                    // Если а отрицательна, а b положительна, то выводим ответ по схеме выше
                            System.out.println("x >= " + "" + c + " "+ "or" + " "  + "x < 0");
                        } else {
                            System.out.println("x >= " + "" + c + " "+ "and" + " "  + "x < 0");
            }
        }
    }
}

