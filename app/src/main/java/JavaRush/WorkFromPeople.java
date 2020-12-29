package JavaRush;


//  "coder" "loser" "proger" "user"

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


interface Person1 {
    class User implements Person1 {
        void live() {
            System.out.println("I usually just live.");
        }
    }

    class Loser implements Person1 {
        void doNothing() {
            System.out.println("I usually do nothing.");
        }
    }

    class Coder implements Person1 {
        void writeCode() {
            System.out.println("I usually write code.");
        }
    }


    class Proger implements Person1 {
        void enjoy() {
            System.out.println("It's a wonderful life!");
        }
    }
}

public class WorkFromPeople {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person1 person1 = null;
        String key = null;

        String[] keysString = {"coder", "loser", "proger", "user"};

        // 4
        while (Arrays.asList(keysString).contains(key = reader.readLine())) {
            String className = key.substring(0, 1).toUpperCase() + key.substring(1);
            Class newClass = Class.forName("JavaRush.Person1$" + className);

            person1 = (Person1) newClass.getConstructor().newInstance();

            doWork(person1);
        }

//        // 3
//        while (Arrays.asList(keysString).contains(key = reader.readLine())) {
//            if (key.equalsIgnoreCase(Person1.Loser.class.getSimpleName())) {
//                person1 = new Person1.Loser();
//            } else if (key.equalsIgnoreCase(Person1.User.class.getSimpleName())) {
//                person1 = new Person1.User();
//            } else if (key.equalsIgnoreCase(Person1.Proger.class.getSimpleName())) {
//                person1 = new Person1.Proger();
//            } else if (key.equalsIgnoreCase(Person1.Coder.class.getSimpleName())) {
//                person1 = new Person1.Coder();
//            }
//            doWork(person1);
//        }

//        // 2
//        //        //тут цикл по чтению ключей, пункт 1
//        while (true) {
//            key = reader.readLine();
//            boolean b = Arrays.asList(keysString).contains(key);
//            if (!b) break;
//                        //создаем объект, пункт 2
//            switch (key) {
//                case "coder":
//                    person1 = new Person1.Coder();
//                    break;
//                case "loser":
//                    person1 = new Person1.Loser();
//                    break;
//                case "proger":
//                    person1 = new Person1.Proger();
//                    break;
//                case "user":
//                    person1 = new Person1.User();
//                    break;
//            }
//            doWork(person1);
//        }

//        // 1.1
////        //тут цикл по чтению ключей, пункт 1
//        while (true) {
//            key = reader.readLine();
//
//            //создаем объект, пункт 2
//            if (key.equals("coder")) {
//                person1 = new Person1.Coder();
//                doWork(person1); //вызываем doWork
//            } else if (key.equals("loser")) {
//                person1 = new Person1.Loser();
//                doWork(person1); //вызываем doWork
//            } else if (key.equals("proger")) {
//                person1 = new Person1.Proger();
//                doWork(person1); //вызываем doWork
//            } else if (key.equals("user")) {
//                person1 = new Person1.User();
//                doWork(person1); //вызываем doWork
//            } else {
//                break;
//            }
//        }


        // 1
//        ArrayList<String> arrayList = new ArrayList<>();
////        //тут цикл по чтению ключей, пункт 1
//        while (true) {
//            key = reader.readLine();
//            if (Arrays.asList(keysString).contains(key)) {
//                arrayList.add(key);
//            } else {
//                break;
//            }
//        }
//
//        {
//            //создаем объект, пункт 2
//            for (String item : arrayList) {
//                if (item.equals("coder")) {
//                    person1 = new Person1.Coder();
//                } else if (item.equals("loser")) {
//                    person1 = new Person1.Loser();
//                } else if (item.equals("proger")) {
//                    person1 = new Person1.Proger();
//                } else if (item.equals("user")) {
//                    person1 = new Person1.User();
//                }
//                doWork(person1); //вызываем doWork
//            }
//        }
    }

    public static void doWork(Person1 person1) {
        // пункт 3
        if (person1 instanceof Person1.User) {
            ((Person1.User) person1).live();
        } else if (person1 instanceof Person1.Proger) {
            ((Person1.Proger) person1).enjoy();
        } else if (person1 instanceof Person1.Loser) {
            ((Person1.Loser) person1).doNothing();
        } else if (person1 instanceof Person1.Coder) {
            ((Person1.Coder) person1).writeCode();
        }
    }
}