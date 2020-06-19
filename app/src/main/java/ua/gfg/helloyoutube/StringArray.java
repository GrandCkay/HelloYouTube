package ua.gfg.helloyoutube;

public class StringArray {
    public static void main(String[] args) {
        String trending[] = {
                "Music",
                "Gaming",
                "News",
                "Movies",
                "Fashion & Beauty"
        };
        String youTube = "\"";
        for (int i = 0; i < trending.length; i++) {
            youTube += trending[i];

            if (i == trending.length - 1) {
                youTube += "\".";
            } else {
                youTube += "\", \"";
            }
        }
        System.out.println(youTube);
    }
}
