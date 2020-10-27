package JavaRush.HenFactoryHard;

public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 40;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.BELARUS, getCountOfEggsPerMonth());
    }
}
