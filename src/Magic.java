public class Magic extends Unit {
    private int manapool;
    public Magic(int hp , String name , int manapool){
        super(hp,name);
        this.manapool = manapool;
    }


    public void koppir(Magic a){
        super.hp = a.hp;
        super.name = a.name;
        this.manapool = a.manapool;
    }

    public void getDamage(int d){
        hp -= d;
    }
    public int  attack(){
        if (manapool >= 50){
            manapool -= 50;
            return 70;
        }else{
            return 40;
        }
    }
    @Override
    public String toString() {
        return "Name : " + name + '\n'
                + "hp : " + hp + '\n'
                + "manapool : " + manapool + '\n';
    }
}
