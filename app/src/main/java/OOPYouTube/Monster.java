package OOPYouTube;

public class Monster {
    int eyes;
    int hand;
    int leg;
    String voice = "Voice";
    String result = "";

    public Monster() {
        eyes = 2;
        hand = 2;
        leg = 2;
    }

    public Monster(int eyes) {
        this.eyes = eyes;
        hand = 2;
        leg = 2;
    }

    public Monster(int eyes, int hand) {
        this.eyes = eyes;
        this.hand = hand;
        leg = 2;
    }

    public Monster(int eyes, int hand, int leg) {
        this.eyes = eyes;
        this.hand = hand;
        this.leg = leg;
    }

    void monsterInfo() {
        System.out.println("Monster is " + eyes + " eyes, " + hand + " hands, "
        + leg + " legs.");
    }

    static String monsterInfo(int eyes, int hand, int leg) {
        return "Dummy monster with " + eyes + " eyes, " + hand + " hands, "
                + leg + " legs.";
    }
    void voice() {
        System.out.println(voice);
    }

    void voice(int iVoice) {
        for (int i = 0; i < iVoice; i++) {
            result += (voice + " ");
        }
        System.out.println(result);
    }

    void voice(int iVoice, String word) {
        for (int i = 0; i < iVoice; i++) {
            result += word + " ";
        }
        System.out.println(result);
    }

    Monster(Monster monsterFather, Monster monsterMother) {
        Monster[] monsters = {monsterFather, monsterMother};
        int sum = 1;
        for (int i = 0; i < monsters.length; i++) {
            sum += i;
        }
        eyes = (monsterFather.eyes + monsterMother.eyes) / sum;
        hand = (monsterFather.hand + monsterMother.hand) / sum;
        leg = (monsterFather.leg + monsterMother.leg) / sum;
    }


    Monster sumMonster(Monster ... monsters) {
        for (int i = 0; i < monsters.length; i++) {
            this.eyes += monsters[i].eyes;
            this.hand += monsters[i].hand;
            this.leg += monsters[i].leg;
        }
        return new Monster(eyes, hand, leg);
    }

    void monsterInfo(String say) {
        System.out.println(say + eyes + " eyes, " + hand + " hands, "
                + leg + " legs.");
    }
}
