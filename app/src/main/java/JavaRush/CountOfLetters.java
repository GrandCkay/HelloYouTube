package JavaRush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


//        Машина
//        Перерыв
//        Скакун
//        Телефон
//        Игра
//        пророк
//        Яблоко
//        платок
//        дерево
//        уксус
//  Маша

public class CountOfLetters {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код

        // 2
        for (Character character : alphabet) {
            int num = 0;
            for (String s : list) {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == character) {
                        num++;
                    }
                }
            }
            System.out.println(character + " " + num);
        }

////        // 1
////        Map<Character, Integer> map = new TreeMap<>();
//
//        // 1.1
////        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
//
//        for (int i = 0; i < alphabet.size(); i++) {
//            int count = 0;
//            for (int j = 0; j < list.size(); j++) {
//                char[] chars = list.get(j).toCharArray();
//                for (int k = 0; k < chars.length; k++) {
//                    if (chars[k] == alphabet.get(i)) {
//                        count++;
//                    }
//                }
//            }
////            map.put(alphabet.get(i), count);
//
//            // 1.2
//            System.out.println(alphabet.get(i) + " " + count);
//        }
//
//
////        // 1.1
////        for (Character character : alphabet) {
////            System.out.println(character + " " + map.get(character));
////        }
//
////        // 1
////        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
////            System.out.println(entry.getKey() + " " + entry.getValue());
////        }
    }
}












