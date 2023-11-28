import jp.ac.uryukyu.ie.e235718.*;

public class Main3 {
    public static void main(String[] args) {
        Komeo komeo = new Komeo("こめお", 5, 5);
        Enemy enemy = new Enemy("スライム", 6, 10);

        System.out.printf("%s vs. %s\n", komeo.getName(), enemy.getName());

        int turn = 0;
        while( komeo.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            enemy.attack(komeo);
            komeo.komeoAttack(enemy);
        }
        System.out.println("戦闘終了");
    }
}

