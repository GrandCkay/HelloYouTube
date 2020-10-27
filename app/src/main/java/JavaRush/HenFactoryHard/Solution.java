package JavaRush.HenFactoryHard;


// "Я - курица." + " Моя страна - " + ". Я несу " + " яиц в месяц."

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        Hen hen1 = HenFactory.getHen(Country.UKRAINE);
//        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getCountOfEggsPerMonth());
        System.out.println(hen.getDescription());
        System.out.println(hen1.getCountOfEggsPerMonth());
        System.out.println(hen1.getDescription());

    }

    static class HenFactory {
        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            switch (country) {
                case Country.BELARUS:
                    hen = new BelarusianHen();
                    break;
                case Country.MOLDOVA:
                    hen = new MoldovanHen();
                    break;
                case Country.RUSSIA:
                    hen = new RussianHen();
                    break;
                case Country.UKRAINE:
                    hen = new UkrainianHen();
                    break;
            }
//            if (country.equals(Country.BELARUS)) {
//                hen = new BelarusianHen();
//            } else if (country.equals(Country.MOLDOVA)) {
//                hen = new MoldovanHen();
//            } else if (country.equals(Country.RUSSIA)) {
//                hen = new RussianHen();
//            } else if (country.equals(Country.UKRAINE)) {
//                hen = new UkrainianHen();
//            }
            return hen;
        }
    }
}










