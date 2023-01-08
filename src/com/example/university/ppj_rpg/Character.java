package com.example.university.ppj_rpg;

public class Character {
    private String name;
    private Item hp;
    private Item manna;
    private Item stamina;

    private String team;

    public Character(String name,int hp, int manna, int stamina, String team){
        this.name = name;
        this.hp = new Item(hp, ItemType.HP);
        this.manna = new Item(manna, ItemType.MANNA);
        this.stamina = new Item(stamina, ItemType.STAMINA);
        this.team = team;
    }
    //    Every Character also has at least one Item stored in the object.
    //    After defeat character transfers their items to the character which defeated them.
    //    Every physical attack decreases Stamina by 1, everyMagical Attack decreases mana by 1.
    public void attack(AttackType attackType, Character other) {
        if(attackType.equals(AttackType.PHYSICAL)){
            stamina.decrease(1);
        }else if(attackType.equals(AttackType.MAGICAL)){
            manna.decrease(1);
        }
//        todo implement defeat
    }
//        todo implement Ex.2.4 using item
    public boolean isAlly(Character other) {
        return team.equals(other.getTeam());
    }

    public void callHelp(Character other) {

    }

    public Item getStamina() {
        return stamina;
    }

    public void setStamina(Item stamina) {
        this.stamina = stamina;
    }

    public Item getHp() {
        return hp;
    }

    public void setHp(Item hp) {
        this.hp = hp;
    }

    public Item getManna() {
        return manna;
    }

    public void setManna(Item manna) {
        this.manna = manna;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", manna=" + manna +
                ", stamina=" + stamina +
                ", team='" + team + '\'' +
                '}';
    }
}
