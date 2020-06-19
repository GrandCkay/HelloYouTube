package ua.gfg.helloyoutube;

public class Time {
    public static void main(String[] args) {
        int seconds = 5000;

        int secondsInMinutes = 60;
        int secondsInHours = secondsInMinutes * 60;
        int secondsInDays = secondsInHours * 24;

        int days = seconds / secondsInDays;
        int hours = (seconds % secondsInDays) / secondsInHours;
        int minutes = ((seconds % secondsInDays) % secondsInHours) / secondsInMinutes;
        int leftSeconds = seconds - days * secondsInDays - hours * secondsInHours - minutes * secondsInMinutes;

        System.out.println(seconds + " seconds it's - " + days + " days, " + hours + " hours, "
                + minutes + " minutes and " + leftSeconds + " seconds.");
    }
}
