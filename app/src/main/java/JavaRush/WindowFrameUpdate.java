package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//              должна   заменять   в тексте   первые  буквы   всех   слов   на   заглавные.  hello java
public class WindowFrameUpdate {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine().trim();

        //напишите тут ваш код
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || chars[i - 1] == ' ') {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        System.out.println(new String(chars));
    }
}
