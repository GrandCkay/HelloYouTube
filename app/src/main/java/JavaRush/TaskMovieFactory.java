package JavaRush;


import android.graphics.Movie;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TaskMovieFactory {

    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        /*
            8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
                8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
                8.2 вывести на экран movie.getClass().getSimpleName()
                "cartoon" "soapOpera" "thriller" Cartoon Thriller
        */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;

        // 3
        while ((key = reader.readLine()) != null) {
            Movie movie = MovieFactory.getMovie(key);
            if (movie == null) {
                return;
            }
            System.out.println(movie.getClass().getSimpleName());
        }


//        String[] strings = {"cartoon", "soapOpera", "thriller"};

//        // 2
//        Movie movie;
//        while (Arrays.asList(strings).contains(key = reader.readLine())) {
//            movie = MovieFactory.getMovie(key);
//            System.out.println(movie.getClass().getSimpleName());
//        }


//        // 1
//        while (true) {
//            key = reader.readLine();
//            Movie movie = MovieFactory.getMovie(key);
//            if (!Arrays.asList(strings).contains(key)) {
//                break;
//            } else {
//                System.out.println(movie.getClass().getSimpleName());
//            }
//        }

    }

    static class MovieFactory {
        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }


    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }

//Напишите тут ваши классы, пункт 3
}
