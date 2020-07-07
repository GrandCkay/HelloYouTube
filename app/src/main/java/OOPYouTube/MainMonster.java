package OOPYouTube;

public class MainMonster {
    public static void main(String[] args) {
        Monster monster = new Monster();
        Monster monster1 = new Monster(1);
        Monster monster2 = new Monster(3,3);
        Monster monster3 = new Monster(4,4,4);

        monster.monsterInfo();
        monster1.monsterInfo();
        monster2.monsterInfo();
        monster3.monsterInfo();

        String monsterString = Monster.monsterInfo(5,5,5);
        System.out.println(monsterString);

        monster.voice();
        monster1.voice(2);
        monster2.voice(10, ":)");
        monster.voice = "New text";
        monster.voice();
        monster3.voice();
        monster2.voice();


        Monster monsterChild = new Monster(monster, monster3);
        monsterChild.monsterInfo("I'am child monster. I have is ");

        Monster monster4 = monster.sumMonster(monster3, monster2);
        monster4.monsterInfo("I'am strong monster. I have a total of ");
        
    }
}
