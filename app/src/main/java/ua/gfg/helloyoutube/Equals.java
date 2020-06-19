package ua.gfg.helloyoutube;

public class Equals {
    public static void main(String[] args) {
        String monthString = "Febary";

        String monthJanuary = "January";
        String monthFebruary = "February";
        String monthMarch = "March";
        String monthApril = "April";
        String monthMay = "May";
        String monthJune = "June";
        String monthJuly = "July";
        String monthAugust = "August";
        String monthSeptember = "September";
        String monthOctober = "October";
        String monthNovember = "November";
        String monthDecember = "December";

        if (monthString.equals(monthJanuary) || monthString.equals(monthFebruary)
                || monthString.equals(monthDecember)) {
            System.out.println("Winter");
        } else if (monthString.equals(monthMarch) || monthString.equals(monthApril)
                || monthString.equals(monthMay)) {
            System.out.println("Spring");
        } else if (monthString.equals(monthJune) || monthString.equals(monthJuly)
                || monthString.equals(monthAugust)) {
            System.out.println("Summer");
        } else if (monthString.equals(monthSeptember) || monthString.equals(monthOctober)
                || monthString.equals(monthNovember)) {
            System.out.println("Autumn");
        } else {
            System.out.println("Month is false");
        }
    }
}
