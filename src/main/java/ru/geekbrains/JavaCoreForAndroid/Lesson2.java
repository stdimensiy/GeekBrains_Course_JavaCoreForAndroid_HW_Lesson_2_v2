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
        int[] originRandIntArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};


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
        printArrLine(getArithmeticProgression(8, 3, 0));
        System.out.println("            *** Массив обработан методом getArithmeticProgression(int length, int increment, int firstElem) - задача выполнена.");
        System.out.println();

        //Задание №3
        System.out.println("Задание №3 оригинальный массив в цикле обрабатывается и все значения элементов меньше заданного удваиваются");
        System.out.println("            для тестирования принят массив (1 строка) пороговое значение 6. Результирующий массив строка 2 (для наглядности)");
        printArrLine(originRandIntArray);
        printArrLine(getDoublingIfLess(originRandIntArray, 6));
        System.out.println("            *** Массив обработан методом getArithmeticProgression(int length, int increment, int firstElem) - задача выполнена.");
        System.out.println();

        //Задание №4
        int[][] unitMatrix;
        System.out.println("Задание №4 создаем квадратный двумерный массив и заполняем его по диагональные элементы значением 1");
        System.out.println("наглядно представление сгенерированного массива:");
        unitMatrix = getUnitMatrixExtVer(8);
        for (int[] unitMatrixLine : unitMatrix) {
            printArrLine(unitMatrixLine);
        }
        System.out.println("            *** Массив обработан методом getUnitMatrix() с параметром равным 8 - задача выполнена.");
        System.out.println();

        //Задание №4.1 более широкий взгляд на задачу (это на случай если я ошибся)
        System.out.println("Задание №4.1 расширенный вариант решения (заполняется побочная диагональ)");
        System.out.println("наглядно представление сгенерированного массива:");
        unitMatrix = getUnitMatrixExtVer(8, 0, 1);
        for (int[] unitMatrixLine : unitMatrix) {
            printArrLine(unitMatrixLine);
        }
        System.out.println("            *** Массив обработан расширенной версией метода getUnitMatrixExtVer(8, 0, 1) - задача выполнена.");
        System.out.println();

        //Задание №4.1(бис) более широкий взгляд на задачу (это на случай если я ошибся)
        System.out.println("Задание №4.1(бис) расширенный вариант решения (заполняются все диагонали)");
        System.out.println("наглядно представление сгенерированного массива:");
        unitMatrix = getUnitMatrixExtVer(8, 1, 1);
        for (int[] unitMatrixLine : unitMatrix) {
            printArrLine(unitMatrixLine);
        }
        System.out.println("            *** Массив обработан расширенной версией метода getUnitMatrixExtVer(8, 1, 1) - задача выполнена.");
        System.out.println();

        //Задание №5
        System.out.println("Задание №5 нахождение максимального и минимального значения элемента массива");
        System.out.println("           массив передаваемый для обработки в методы getMax() и getMin ");
        printArrLine(originRandIntArray);
        System.out.println("Максимальное значение элемента массива: " + getMax(originRandIntArray));
        System.out.println("Минимальное значение элемента массива: " + getMin(originRandIntArray));
        System.out.println("            *** Массив обработан методами getMax() и getMin() - задача выполнена.");
        System.out.println();

        //Задание №6
        System.out.println("Задание №6  определение существования границы между элементами массива справа и слева от которой сумма ");
        System.out.println("            элементов массива будет одинакова (таких границ в массивах может не быть вовсе, а может быть и несколько).");
        System.out.println("            Попытка №1 Передаваемый массив для тестирования метода isPlaceSumLREqual(): ");
        printArrLine(originRandIntArray);
        // System.out.println("Сумма элементов массива" + getSum(originRandIntArray)); // метод создан дополнительно как сервисный он нужен для первичного анализа
        // формируем строку ответа сразу в выводе в консоль при помощи тернарного оператора (мне понравилось им пользоваться)
        System.out.println("В переданном массиве, место в котором суммы элементов правой и левой части равны: " + (isPlaceSumLREqual(originRandIntArray) ? "ПРИСУТСТВУЕТ!" : "Отсутствует"));
        // System.out.println("Сумма элементов массива" + getSum(originIntArray));
        System.out.println("            Попытка №2 Передаваемый массив для тестирования метода isPlaceSumLREqual(): ");
        printArrLine(originIntArray);
        System.out.println("В переданном массиве, место в котором суммы элементов правой и левой частиравны: " + (isPlaceSumLREqual(originIntArray) ? "ПРИСУТСТВУЕТ!" : "Отсутствует"));
        System.out.println("            *** Массив обработан методами getSum() и  isPlaceSumLREqual() - все работает задача выполнена.");
        System.out.println();

        //Задание №7
        int[] intArrTest;
        System.out.println("Задание №7  реализация метода осуществляющего смещение элементов массива на заданное число позиций ");
        System.out.println("            количество позиций смещения - число (может быть положительным или отрицательным)");
        System.out.println("            Попытка №1 смещение влево (передаваемый параметр n=2)");
        intArrTest=getArithmeticProgression(10,1,0); // создаю массив арифм. последовательности с шагом 1
        printArrLine(intArrTest);                                           // вывожу оригинальный массив
        printArrLine(getArrayWithShift(intArrTest,2));                 // вывожу результирующий массив (смещенный)
        System.out.println("            !!! все работает массив сместился вправо на 2 элемента");
        System.out.println("            Попытка №2 смещение влево (передаваемый параметр n=-3)");
        intArrTest=getArithmeticProgression(10,1,0); // создаю массив арифм. последовательности с шагом 1 заново
        printArrLine(intArrTest);
        printArrLine(getArrayWithShift(intArrTest,-3));                 // вывожу результирующий массив (смещенный)
        System.out.println("            !!! все работает массив сместился влево на 3 элемента");
        System.out.println("            *** Массив обработан методом getArrayWithShift() - все работает задача выполнена.");
        System.out.println();

    }

    // Дополнительный метод - выводит элементы массива тип int в форматированную строку (для удобства )
    // Самоподготовка (СамПо) вне занятия
    public static void printArrLine(int[] a) {
        for (int elem : a) {
            System.out.print(elem + "\t");
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

    // Дополнительный метод - вычисляет сумму элементов массива (нужен в задании №6)
    public static int getSum(int[] arr) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) sum += arr[i];
        return sum;
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
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + increment;
        }
        return arr;
    }

    // Задание №3
    public static int[] getDoublingIfLess(int[] arr, int min) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] < min ? arr[i] <<= 1 : arr[i];
        }
        return arr;
    }

    // Задание №4
    public static int[][] getUnitMatrixExtVer(int length, int elemMainDiag, int elemSideDiag) {
        int[][] arr;
        arr = new int[length][length];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = elemMainDiag;
            arr[i][(length - 1) - i] = elemSideDiag;
        }
        return arr;
    }

    // Задание №4 - перегруженный метод, для создания единичной матрицы, просто.
    public static int[][] getUnitMatrixExtVer(int length) {
        int[][] arr;
        arr = new int[length][length];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
        return arr;
    }

    // Задание №5.1 метод для нахождения максимального значения из элементов массива
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) if (arr[i] > max) max = arr[i];
        return max;
    }

    // Задание №5.2 метод для нахождения минимального значения из элемента массива
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) if (arr[i] < min) min = arr[i];
        return min;
    }

    /* Задание №6 метод для нахождения в массиве границы, где сумма элементов слева от границы
    /  равна сумме элементов справа от границы.*/
    public static boolean isPlaceSumLREqual(int[] arr) {
        int sum = getSum(arr);      // Логично предположить, что только если сумма четная, тогда есть граница, (эт элементарно)
        // при такой проверке метод адекватно найдет границу и в массиве с нулевым значением суммы и
        // отсеет массив с недостаточным количеством элементов
        if (sum % 2 == 0 && arr.length > 1) {
            int kontrSum = 0;
            for (int o : arr) {
                kontrSum += o;
                if (kontrSum == sum) return true;
            }
        }
        return false;
    }

    /* Задание №7 метод реализующий смещение элементов массива влево или вправо циклически
    / без использования дополнительных пакетов и временных массивов
    / смещение осуществляется при shift > 0 вправо при shift < 0 влево */
    public static int[] getArrayWithShift(int[] arr, int shift) {
        if (shift > 0) {
            for (int s = 1; s <= shift; s++) {
                int elemshift = arr[arr.length - 1];
                for (int i = arr.length - 2; i >= 0; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[0] = elemshift;
            }
        } else if (shift < 0) {
            for (int s = shift; s <= -1; s++) {
                int elemshift = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    arr[i - 1] = arr[i];
                }
                arr[arr.length - 1] = elemshift;
            }
        }
        return arr;
    }


}
