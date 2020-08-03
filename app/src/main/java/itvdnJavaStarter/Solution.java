package itvdnJavaStarter;

public class Solution {
    public static void main(String[] args) {
        /*
        // 1
        С помощью тернарного оператора замените инициализацию переменной b в указанном коде
        if (a > 0) {
            if (a < 100) {
                b = 1;
            } else {
                b = 0;
            }
        } else {
            b = -1;
        }
******************************
        int a = 0;
        int b = 0;
        int b = (a > 0) ? ((a < 100) ? 1 : 0) : -1;


        System.out.println(b);

        */

        /*
        // 2
        int a = 1000;
        while (a <= 9999) {
            System.out.print(a + " ");
            a += 3;
        }
         */

        /*
        // 3
        С помощью цикла do while подсчитайте и выведите в консоль сумму парных чисел от 1 до 10 включительно.
        Заданную переменную "a" используйте в качестве счетчика итераций цикла, "sum" - в качестве счетчика суммы чисел.

        int a = 1;
        int sum = 0;
        do {
            if (a % 2 == 0) {
                sum += a;
            }
            a++;
        } while (a < 11);
        System.out.println(sum);

         */

        /*
        // 4

         */


        /*
        // 5
        С помощью цикла do while подсчитайте и выведите в консоль факториал переменной а.
        Заданную переменную factSum используйте в качестве счетчика факториала.

        int a = 5;
        int factSum = 1;
        do {
            factSum *= a;
            a--;
        } while (a > 1 );
        System.out.println(factSum);

         */

        /*
        // 6
        int a = 10;
        do {
            System.out.print(a + " ");
            a  -= 2;
        } while (a >= 0);

         */

        /*
        // 7
        int a = 1;
        while (a <= 1000) {
            System.out.print(a);
            a *= 2;
        }

         */

        /*
        // 8
        printMsg("Saaas");

         */

        /*
        // 9
        printNumInterval(2, 6);

         */

        /*
        // 10
            int res = pow(10);
            if (res == 100) {
                System.out.println("true");
            }

         */

        /*
        // 11
        С помощью рекурсии реализуйте метод print для построчного вывода на экран последовательности чисел от заданного числа (аргумент num)
        до нуля включительно. Например: print(5); Вывод в консоль:
        5
        4
        ...
        0

        print(5);

         */

        /*
        // 12
        С помощью рекурсии реализуйте метод fact для вычисления факториала переданной переменной num

        System.out.println( fact(5));

         */

        /*
        // 13
        С помощью рекурсии реализуйте метод fib, который должен возвращать указанное число в последовательности Фибоначчи.
        Например, последовательность чисел Фибоначчи 1 1 2 3 5 8 13 21 34 55 ...
            System.out.println(fib(5)); // 5
            System.out.println(fib(6)); // 8
            System.out.println(fib(7)); // 13

        System.out.println((fib(4)));

         */

        /*
        // 14
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

         */

        /*
        // 15
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);

         */

        /*
        // 16
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int sum = 0;
        int avg;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println(avg);

         */

        /*
        // 17  выведите построчно в консоль первую половину заданного массива
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println(arr[i]);
        }

         */

        /*
        // 18 выведите построчно в консоль вторую половину заданного массива
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int i = arr.length / 2; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

         */

        /*
        // 19*  выведите построчно в консоль все элементы заданного массива arr в обратном порядке
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int j = 0, i = arr.length - 1; j < arr.length; j++, i--) {
            System.out.println(arr[i]);
        }

         */

        /*
        // 20 Метод должен заменять в переданном массиве все отрицательные числа на ноль.
        int[] second = {-1, 2, -3, 4, -5};
        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i] + " ");
        }
        changeToZero(second);

         */

        // 21* Метод должен возвращать максимальное значение переданного массива
        int[] arr = {1, 2, 4, 5, 6, 7, 30, 3};
        int i = getArrayMaxElem(arr);
        System.out.println(i);


    }

    /*
        МЕТОДЫ
     */

    /*
    // 8
    public static void printMsg(String msg) {
        System.out.println(msg);
    }

     */

    /*
    // 9
    public static void printNumInterval(int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.print(i + " ");
        }

        int i = from;
        while (i <= to) {
            System.out.print(i + " ");
            i++;
        }
    }

     */

    /*
    // 10
    public static int pow(int num) {
        return num * num;
    }

     */

    /*
    // 11
    public static void print(int num) {
            System.out.println(num);
            num--;
            if (num >= 0) {
                print(num);
            }

     */

    /*
    // 12
    С помощью рекурсии реализуйте метод fact для вычисления факториала переданной переменной num

    public static int fact(int num) {
        if (num == 1 ) {
            return 1;
        }
        return fact(num - 1) * num;
    }

     */

    /*
    // 13
    С помощью рекурсии реализуйте метод fib, который должен возвращать указанное число в последовательности Фибоначчи.
    Например, последовательность чисел Фибоначчи 1 1 2 3 5 8 13 21 34 55 ...

    public static int fib(int num) {
        if (num == 0){
            return 0;
        }
        if (num == 1){
            return 1;
        }
        else{
            return fib(num - 1) + fib(num - 2);
        }
    }

     */

    /*
    // 20 Метод должен заменять в переданном массиве все отрицательные числа на ноль.
    public static void changeToZero(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

     */

    // 21* Метод должен возвращать максимальное значение переданного массива
    public static int getArrayMaxElem(int[] arr) {
        int max;
        boolean sort = false;

        while (!sort) {
            sort = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    max = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = max;
                    sort = false;
                }
            }
        }
        max = arr[0];
        return max;
    }


}
