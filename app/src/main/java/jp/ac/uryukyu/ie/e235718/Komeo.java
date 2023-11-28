package jp.ac.uryukyu.ie.e235718;

public class Komeo extends LivingThing{
    public Komeo(String _name, int _hitPoint, int _attack) {
        super(_name, _hitPoint, _attack);
    }

    public void komeoAttack(LivingThing opponent) {
        if (isDead() == false) {
            int damage = (int)(opponent.getAttack());
            System.out.printf("%sの攻撃！得意のカウンターを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            komeoCook();
            opponent.wounded(damage);
        }
    }

    public void komeoCook() {
        int bonus = 5;
        setHitPoint(getHitPoint() + bonus);
        System.out.printf("一旦料理の時間！%sは%d回復した。現在の体力は%d。\n", getName(), bonus, getHitPoint());
    }

    @Override
    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        if( getHitPoint() <= 0 ) {
            setDead(true);
            System.out.printf("%sは力尽きてしまった。\n", getName());
        }
    }
}
