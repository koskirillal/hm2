public abstract class Unit {
    protected int hp = 100;
    protected String name = "Pudg";
    public Unit(int hp , String name){
        this.hp = hp;
        this.name = name;
    };
    public Unit(){};
    public void koppir(Unit a){
        this.hp = a.hp;
        this.name = a.name;
    }

    public  int   attack(){
        return 0;
    }
    public void getDamage(int d){
        hp-=d;
    }

    @Override
    public String toString() {
        return "Name : " + name + '\n'
                + "hp  : " + hp  ;
     }
}
