package JavaRush;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Objects;

public class WorkingWithDate {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("February 1 1970"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(Objects.requireNonNull(dateFormat.parse(date)));

        return calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0;

//        int year = calendar.get(Calendar.YEAR);
//        Calendar calendarFirst = new GregorianCalendar(year, Calendar.JANUARY, 1);
//        int dayYear = calendar.get(Calendar.DAY_OF_YEAR) - calendarFirst.get(Calendar.DAY_OF_YEAR);
//        System.out.println(dayYear);
//
//        if (dayYear == 0 || dayYear % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }


//        Date date1 = new Date(Date.parse(date));
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("D");
//        int i = Integer.parseInt(simpleDateFormat.format(date1));
//
//        return (i % 2 == 0) ? false : true;

    }
}
