package JavaRush.HenFactoryHard;

public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
