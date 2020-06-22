package OOPYouTube;

public class MainHuman {
    public static void main(String[] args) {
        Human oldHuman = new Human();
        oldHuman.name = "Dr.Rob";
        oldHuman.age = 60;
        oldHuman.weight = 68.6;
        oldHuman.getHumanCount();

        Human childHuman = new Human();
        childHuman.name = "Bob";
        childHuman.age = 12;
        childHuman.weight = 33.4;
        childHuman.getHumanCount();

        Human human = new Human();
        human.name = "Karl";
        human.age = 35;
        human.weight = 85.1;
        human.getHumanCount();

        Human manHuman = new Human();
        manHuman.name = "Jack";
        manHuman.age = 40;
        manHuman.weight = 92.9;
        manHuman.getHumanCount();

        Human womanHuman = new Human();
        womanHuman.name = "Sara";
        womanHuman.age = 27;
        womanHuman.weight = 60.0;
        womanHuman.getHumanCount();

        // first way sum age
        double sumAge = 0;
        sumAge = (double) (oldHuman.age + childHuman.age + human.age + manHuman.age + womanHuman.age) / 5;
        System.out.println("Age - " + sumAge);

        // second way sum age
        double sumAge2 = 0;
        sumAge2 = (double) (oldHuman.age + childHuman.age + human.age + manHuman.age +womanHuman.age) / Human.humanCount;
        System.out.println("Age2 - " + sumAge2);

        /*
            First way sum weight
         */
        double[] weightHumanArray = new double[5];
        weightHumanArray[0] = oldHuman.weight;
        weightHumanArray[1] = childHuman.weight;
        weightHumanArray[2] = human.weight;
        weightHumanArray[3] = manHuman.weight;
        weightHumanArray[4] = womanHuman.weight;

        int sumWeight = 0;
        for (int i = 0; i < weightHumanArray.length; i++) {
            sumWeight += weightHumanArray[i];
        }
        System.out.println("Weight - " + (double) sumWeight / Human.humanCount);

        /*
            Second way sum weight
         */
        double sumWeightPrint = 0;
        sumWeightPrint = (double) sumWeight / weightHumanArray.length;
        System.out.println("Weight1 - " + sumWeightPrint);

        /*
            Third way sum weight. And display all name objects class Human
         */
        Human[] humanArray = {
                oldHuman,
                childHuman,
                human,
                manHuman,
                womanHuman
        };

        int sumWeight2 = 0;
        String nameHuman = "";

        for (int i = 0; i < humanArray.length; i++) {
            sumWeight2 += humanArray[i].weight;

            if (i < humanArray.length - 1) {
                nameHuman += humanArray[i].name + ", ";
            } else {
                nameHuman += humanArray[i].name + ".";
            }
        }
        double sumWeightPrint2 = (double) sumWeight2 / humanArray.length;
        System.out.println("Weight2 - " + sumWeightPrint2);

        System.out.println(nameHuman);
    }
}
