package JavaRush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


// 9        ||  Вишня
// Яблоко   ||  1
// 18       ||  Боб
// Перерыв  ||  3
// Скакун   ||  Яблоко
// 12       ||  22
// 11       ||  0
//          ||  Арбуз

public class HardTask {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }


    public static void sort(String[] array) {
        // напишите тут ваш код

        // 2
        ArrayList<String> arrayListString = new ArrayList<>();
        ArrayList<Integer> arrayListInt = new ArrayList<>();

        for (String s : array) {
            if (isNumber(s)) {
                arrayListInt.add(Integer.parseInt(s));
            } else {
                arrayListString.add(s);
            }
        }

        Collections.sort(arrayListInt);
        Collections.reverse(arrayListInt);

        String temp;
        boolean sort = false;
        while (!sort) {
            sort = true;
            for (int i = 0; i < arrayListString.size() - 1; i++) {
                if (isGreaterThan(arrayListString.get(i), arrayListString.get(i + 1))) {
                    temp = arrayListString.get(i);
                    arrayListString.set(i, arrayListString.get(i + 1));
                    arrayListString.set(i + 1, temp);
                    sort = false;
                }
            }
        }

        for (int i = 0, j = 0, k = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                array[i] = String.valueOf(arrayListInt.get(j));
                j++;
            } else {
                array[i] = arrayListString.get(k);
                k++;
            }
        }

//        // 1
//        String temp = "";
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (!isNumber(array[i]) && !isNumber(array[j])) {
//                    if (isGreaterThan(array[i], array[j])) {
//                        temp = array[i];
//                        array[i] = array[j];
//                        array[j] = temp;
//                    }
//                }
//                if (isNumber(array[i]) && isNumber(array[j])) {
//                    if (Integer.parseInt(array[i]) < Integer.parseInt(array[j])) {
//                        temp = array[i];
//                        array[i] = array[j];
//                        array[j] = temp;
//                    }
//                }
//            }
//        }

    }


    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if ((i != 0 && ch == '-') // Строка содержит '-'
                    || (!Character.isDigit(ch) && ch != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && ch == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
