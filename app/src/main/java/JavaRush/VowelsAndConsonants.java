package JavaRush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

// истина в вине

public class VowelsAndConsonants {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        // 4
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer();

        for (char c : text.toCharArray()) {
            if (isVowel(c)) {
                stringBuffer.append(c).append(" ");
            } else if (c != ' ') {
                stringBuffer1.append(c).append(" ");
            }
        }
        System.out.println(stringBuffer);
        System.out.println(stringBuffer1);

//        // 3
//        String text = reader.readLine().replaceAll("\\s+", ""), stVowels = "", stConsonant = "";
//
//        for (char c : text.toCharArray()) {
//            if (isVowel(c)) {
//                stVowels += c + " ";
//            } else {
//                stConsonant += c + " ";
//            }
//        }
//        System.out.println(stVowels);
//        System.out.println(stConsonant);

//        // 2
//        for (int i = 0; i < text.length(); i++) {
//            if (isVowel(text.charAt(i))) {
//                stVowels += text.charAt(i) + " ";
//            } else {
//                stConsonant += text.charAt(i) + " ";
//            }
//        }
//        System.out.println(stVowels);
//        System.out.println(stConsonant);


//        // 1
//        ArrayList<Character> charactersVowels = new ArrayList<>();
//        ArrayList<Character> charactersConsonant = new ArrayList<>();
//        char[] chars = text.toCharArray();
//
//        for (int i = 0; i < text.length(); i++) {
//            if (isVowel(chars[i])) {
//                charactersVowels.add(chars[i]);
//            } else if (!isVowel(chars[i]) && chars[i] != ' ') {
//                charactersConsonant.add(chars[i]);
//            }
//        }
//
//        for (Character characterVowel : charactersVowels) {
//            System.out.print(characterVowel + " ");
//        }
//
//        System.out.println();
//
//        for (Character character : charactersConsonant) {
//            System.out.print(character + " ");
//        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}














