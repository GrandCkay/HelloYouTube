package JavaRush;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;


enum Sex {
    MALE,
    FEMALE
}

/*
               За основу берем код class CrUD
*/
public class CrUD2 {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    public static SimpleDateFormat simpleDateFormatCreate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public static SimpleDateFormat simpleDateFormatInfo = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);


    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
        allPeople.add(Person.createMale("Иван", new Date()));  //сегодня родился    id=2
        allPeople.add(Person.createMale("Петр", new Date()));  //сегодня родился    id=3
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
//        args = new String[]{"-i", "0", "1", "2", "3"};

        switch (args[0]) {
            case "-c":                              // -c name1 sex1 bd1 name2 sex2 bd2 ...
                synchronized (allPeople) {
                    create(args);
                }
                break;
            case "-u":                              // -u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
                synchronized (allPeople) {
                    update(args);
                }
                break;
            case "-d":                              // -d id1 id2 id3 id4 ...
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        delete(Integer.parseInt(args[i]));
                    }
                }
                break;
            case "-i":                              // -i id1 id2 id3 id4 ...
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        info(Integer.parseInt(args[i]));
                    }
                }
                break;
        }
    }


    // 0   1    2    3   4     5    6      7     8    9   10    11   12
// -c name1 sex1 bd1 name2 sex2 bd2 ...name1 sex1 bd1 name2 sex2 bd2
    public static void create(String[] strings) throws ParseException {
        for (int i = 1; i < strings.length; i += 3) {
            String name = strings[i];
            String stringSex = strings[i + 1];
            Date date = simpleDateFormatCreate.parse(strings[i + 2]);


            if (stringSex.equals("м")) {
                allPeople.add(Person.createMale(name, date));
            } else {
                allPeople.add(Person.createFemale(name, date));
            }
            System.out.println(allPeople.size() - 1);
        }
    }


    // 0   1    2    3   4     5    6   7    8      9   10    11   12  13   14   15  16
// -u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...id1 name1 sex1 bd1 id2 name2 sex2 bd
    public static void update(String[] strings) throws ParseException {
        for (int i = 1; i < strings.length; i += 4) {
            int index = Integer.parseInt(strings[i]);
            Sex sex = strings[i + 2].equals("м") ? Sex.MALE : Sex.FEMALE;
            String name = strings[i + 1];
            Date date = simpleDateFormatCreate.parse(strings[i + 3]);

            allPeople.get(index).setSex(sex);
            allPeople.get(index).setName(name);
            allPeople.get(index).setBirthDate(date);
        }
    }

    // -d id1 id2 id3 id4 ...
    public static void delete(int i) {
        allPeople.get(i).setName(null);
        allPeople.get(i).setSex(null);
        allPeople.get(i).setBirthDate(null);
    }


    // "м" "ж"
    // -i id1 id2 id3 id4 ...
    public static void info(int i) {
        String s = (allPeople.get(i).getSex().equals(Sex.MALE)) ? "м" : "ж";

        System.out.println(allPeople.get(i).getName() + " " + s + " "
                + simpleDateFormatInfo.format(allPeople.get(i).getBirthDate()));
    }
}

class Person {
    private String name;
    private Sex sex;
    private Date birthDate;

    private Person(String name, Sex sex, Date birthDate) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public static Person createMale(String name, Date birthDate) {
        return new Person(name, Sex.MALE, birthDate);
    }

    public static Person createFemale(String name, Date birthDate) {
        return new Person(name, Sex.FEMALE, birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
