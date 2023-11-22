public class Warrior extends  Unit{
    private int armor;
    public Warrior(int hp ,String name , int armor){
        super(hp, name);
        this.armor=armor;
    }
    public int attack(){
        return 20;
    }
    public void koppir (Warrior a){
        this.hp = a.hp;
        this.armor =a.armor;
        this.name = a.name;
    }
    public void getDamage(int d){
        if (armor > 0){
            armor -=d;
            if (armor > 0){
                d = 0;
            }
            else if (armor < 0){
                d = Math.abs(armor);
                armor = 0;
            }
        }
        hp -= d;
    }


    @Override
    public String toString() {
        return super.toString() + '\n'
                + "armor : " + armor + '\n';
    }
}
