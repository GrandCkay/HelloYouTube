package JavaRush.HenFactoryHard;

public class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
