package JavaRush;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public class GoodAndSummer {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();

        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        //напишите тут ваш код
        map.put("Jon", dateFormat.parse("MAY 2 1988"));
        map.put("Connor", dateFormat.parse("MARCH 12 1918"));
        map.put("Sara", dateFormat.parse("SEPTEMBER 20 2008"));
        map.put("Bob", dateFormat.parse("APRIL 21 1990"));
        map.put("Ron", dateFormat.parse("JULY 15 1998"));
        map.put("Dog", dateFormat.parse("JUNE 11 1973"));
        map.put("Bird", dateFormat.parse("AUGUST 9 2018"));
        map.put("Lord", dateFormat.parse("OCTOBER 29 2000"));
        map.put("Cat", dateFormat.parse("DECEMBER 17 1995"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) throws ParseException {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            String dateS = iterator.next().toString();
            if (dateS.contains("Aug") || dateS.contains("Jul") || dateS.contains("Jun")) {
                iterator.remove();
            }
        }

//        while (iterator.hasNext()) {
//            Map.Entry<String, Date> dateEntry = iterator.next();
//            Date date = dateEntry.getValue();
//            int dateMonth = date.getMonth();
//            if (dateMonth == 5 || dateMonth == 6 || dateMonth == 7) {
//                iterator.remove();
//            }
//        }
//
//        Map<String, Date> mapDate = new HashMap<>(map);
//        for (Map.Entry<String, Date> pair : mapDate.entrySet()) {
//            String key = pair.getKey();
//            Date date = pair.getValue();
//            int dateMonth = date.getMonth();
//            if (dateMonth > 4 && dateMonth < 8) {
//                map.remove(key);
//            }
//        }
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> stringDateMap = createMap();
        int i = 1;
        for (Map.Entry<String, Date> pair : stringDateMap.entrySet()) {
            String key = pair.getKey();
            Date value = pair.getValue();
            System.out.println(i + " " + key + " - " + value);
            i++;
        }
        System.out.println("\nAfter remove");

        removeAllSummerPeople(stringDateMap);
        i = 1;
        for (Map.Entry<String, Date> pair : stringDateMap.entrySet()) {
            String key = pair.getKey();
            Date value = pair.getValue();
            System.out.println(i + " " + key + " - " + value);
            i++;
        }
    }
}






