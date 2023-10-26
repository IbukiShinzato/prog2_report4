package jp.ac.uryukyu.ie.e235718;

public class Warrior extends Hero {
    public Warrior(String _name, int _hitPoint, int _attack){
        super(_name, _hitPoint, _attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        if( this.dead == false ){
            int damage = (int)(attack * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！", name, opponent.name, damage);
            opponent.wounded(damage);
        }
    }
}
