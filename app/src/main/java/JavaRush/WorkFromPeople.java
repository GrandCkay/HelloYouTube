package JavaRush;


//  "coder" "loser" "proger" "user"

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


interface Person {
    class User implements Person {
        void live() {
            System.out.println("I usually just live.");
        }
    }

    class Loser implements Person {
        void doNothing() {
            System.out.println("I usually do nothing.");
        }
    }

    class Coder implements Person {
        void writeCode() {
            System.out.println("I usually write code.");
        }
    }


    class Proger implements Person {
        void enjoy() {
            System.out.println("It's a wonderful life!");
        }
    }
}

public class WorkFromPeople {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        String[] keysString = {"coder", "loser", "proger", "user"};

        // 4
        while (Arrays.asList(keysString).contains(key = reader.readLine())) {
            String className = key.substring(0, 1).toUpperCase() + key.substring(1);
            Class newClass = Class.forName("JavaRush.Person$" + className);

            person = (Person) newClass.getConstructor().newInstance();

            doWork(person);
        }

//        // 3
//        while (Arrays.asList(keysString).contains(key = reader.readLine())) {
//            if (key.equalsIgnoreCase(Person.Loser.class.getSimpleName())) {
//                person = new Person.Loser();
//            } else if (key.equalsIgnoreCase(Person.User.class.getSimpleName())) {
//                person = new Person.User();
//            } else if (key.equalsIgnoreCase(Person.Proger.class.getSimpleName())) {
//                person = new Person.Proger();
//            } else if (key.equalsIgnoreCase(Person.Coder.class.getSimpleName())) {
//                person = new Person.Coder();
//            }
//            doWork(person);
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
//                    person = new Person.Coder();
//                    break;
//                case "loser":
//                    person = new Person.Loser();
//                    break;
//                case "proger":
//                    person = new Person.Proger();
//                    break;
//                case "user":
//                    person = new Person.User();
//                    break;
//            }
//            doWork(person);
//        }

//        // 1.1
////        //тут цикл по чтению ключей, пункт 1
//        while (true) {
//            key = reader.readLine();
//
//            //создаем объект, пункт 2
//            if (key.equals("coder")) {
//                person = new Person.Coder();
//                doWork(person); //вызываем doWork
//            } else if (key.equals("loser")) {
//                person = new Person.Loser();
//                doWork(person); //вызываем doWork
//            } else if (key.equals("proger")) {
//                person = new Person.Proger();
//                doWork(person); //вызываем doWork
//            } else if (key.equals("user")) {
//                person = new Person.User();
//                doWork(person); //вызываем doWork
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
//                    person = new Person.Coder();
//                } else if (item.equals("loser")) {
//                    person = new Person.Loser();
//                } else if (item.equals("proger")) {
//                    person = new Person.Proger();
//                } else if (item.equals("user")) {
//                    person = new Person.User();
//                }
//                doWork(person); //вызываем doWork
//            }
//        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        }
    }
}