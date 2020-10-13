package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class NumberMonth {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        ArrayList<Integer> arrayList = new ArrayList<>();

//        String[] stringsMonth = {"January", "February", "March", "April",
//               "May", "June", "July", "August", "September", "October", "November", "December"};
//
//        for (int i = 0; i < stringsMonth.length; i++) {
//            if (stringsMonth[i].equalsIgnoreCase(month)) {
//                arrayList.add(i);
//            }
//        }

//        DateFormat dateFormat = new SimpleDateFormat("MMMM", Locale.ENGLISH);
//        List<Date> dateList = new ArrayList<>();
//        int number;
//        dateList.add(dateFormat.parse(month));
//        number = dateList.get(0).getMonth();
//        arrayList.add(number);

//        DateFormat dateFormat = new SimpleDateFormat("MMMM", Locale.ENGLISH);
//        arrayList.add(dateFormat.parse(month).getMonth());

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM", Locale.ENGLISH);
        calendar.setTime(simpleDateFormat.parse(month));
        arrayList.add(calendar.get(Calendar.MONTH));

        System.out.println(month + " is the " + (arrayList.get(0) + 1) + " number");
    }
}













