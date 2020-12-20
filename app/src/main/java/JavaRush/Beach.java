package JavaRush;

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach beach = new Beach("Garden", 25.4f, 9);
        Beach beach1 = new Beach("Palmet", 115.4f, 19);
        System.out.println(beach.compareTo(beach1));
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach o) {
        int result = this.quality - o.quality;
//        System.out.println("result " + result);

//        // 1
//        int i;
//        if (distance < o.distance) {
//            i = 1;
//        } else if (distance > o.distance) {
//            i = -1;
//        } else {
//            i = 0;
//        }

        // 2
        int i = Float.compare(o.distance, distance);

//        System.out.println("i " + i);

        return result + i;
    }
}









