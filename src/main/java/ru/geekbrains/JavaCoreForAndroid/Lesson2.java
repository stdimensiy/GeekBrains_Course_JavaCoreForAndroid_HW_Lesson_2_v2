package ru.geekbrains.JavaCoreForAndroid;

/**
 * Сourse: java core for android
 * Faculty of Geek University Android Development
 *
 * @Author Student Dmitry Veremeenko aka StDimensiy
 * Group 24.12.2020
 * <p>
 * HomeWork for lesson2
 * Created 05.02.2021
 * v2.0
 */
public class Lesson2 {
    public static void main(String[] args) {
        // Переменные
        int[] originIntArray = {0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0};

        //Задание №1 (второй способ решения задачи закомментирован)
        System.out.println("Задание №1 (1 строка оригинальный массив, 2 строка инвертированный массив (для наглядности)");
        printArrLine(originIntArray);
        inversionArray(originIntArray); // обращение к методу как к НЕвозвращающему значение (как к процедуре)
        printArrLine(originIntArray);
        // printArrLine(inversionArray(originIntArray)); второй способ получить результат обращаясь к методу как к возвращающему значение
        System.out.println("            *** Массив обработан методом inversionArray() - задача выполнена.");
        System.out.println();

        //Задание №2
        System.out.println("Задание №2 с помощь цикла создан массив из 8 элементов, первый элемент имеет значение 0, шаг 3");
        printArrLine(getArithmeticProgression(8,3,0));
        System.out.println("            *** Массив обработан методом getArithmeticProgression(int length, int increment, int firstElem) - задача выполнена.");
        System.out.println();

    }

    // Дополнительный метод - выводит элементы массива тип int в форматированную строку (для удобства )
    // Самоподготовка (СамПо) вне занятия
    public static void printArrLine(int[] a) {
        for (int elem : a) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    // Дополнительный перегруженный метод - выводит элементы массива строк в форматированную строку (для удобства)
    // Самоподготовка (СамПо) вне занятия
    public static void printArrLine(String[] a) {
        for (String elem : a) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    // Задание №1 - метод инвертирует элементы массива 1 в 0 и наоборот (ели не 0, тогда тоже переведет в 0)
    public static int[] inversionArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
        }
        return arr;
    }

    // Задание №2
    public static int[] getArithmeticProgression(int length, int increment, int firstElem) {
        int[] arr;
        arr = new int[length];
        arr[0] = firstElem;
        for (int i = 1; i < arr.length; i++){
            arr[i] = arr[i - 1] + increment;
        }
        return arr;
    }

}
