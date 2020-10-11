package JavaRush;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class More10NotFit {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 1; i < 21; i++) {
            integerSet.add(i);
        }

        return integerSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Set<Integer> integerSet = new HashSet<>(set);
        for (Integer integer : integerSet) {
            if (integer > 10) {
                set.remove(integer);
            }
        }

//        Iterator<Integer> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            int i = iterator.next();
//            if (i > 10) {
//                iterator.remove();
//            }
//        }
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> set = createSet();
        for (Integer integer : set) {
            System.out.println(integer);
        }
        System.out.println("");

        set = removeAllNumbersGreaterThan10(set);
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}







