package jp.ac.uryukyu.ie.e235718;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KomeoTest {
    @Test
    void komeoAttackTest() {
        int slimeAttack = 10;
        Komeo komeo = new Komeo("こめお", 5, 5);
        Enemy slime = new Enemy("スライムもどき", 10, slimeAttack);
        int nowEnemyHp;
        int komeoAttack = slimeAttack;
        for(int i = 0; i < 3; i++){
            nowEnemyHp = slime.getHitPoint();
            komeo.komeoAttack(slime);
            assertEquals(nowEnemyHp - komeoAttack, slime.getHitPoint());
            System.out.printf("nowEnemyHp - komeoAttack = %s , slime.getHitPoint() = %s\n", nowEnemyHp - komeoAttack, slime.getHitPoint());
        }
    }

    @Test
    void komeoCookTest() {
        Komeo komeo = new Komeo("こめお", 5, 5);
        int bonus = 5;
        int defaultkomeoHp;
        for(int i=0; i<3; i++) {
            defaultkomeoHp = komeo.getHitPoint();
            komeo.komeoCook();
            assertEquals(defaultkomeoHp + bonus, komeo.getHitPoint());
        }
    }
}
