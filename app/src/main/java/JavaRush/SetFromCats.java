package JavaRush;

import java.util.HashSet;
import java.util.Set;

public class SetFromCats {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        //напишите тут ваш код. step 3 - пункт 3
        printCats(cats);
        System.out.println("\nAfter remove");
        cats.remove(cats.toArray()[0]);
        printCats(cats);
        System.out.println();
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> catSet = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            catSet.add(new Cat());
        }
        return catSet;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    // step 1 - пункт 1
    public static class Cat {
    }
}
