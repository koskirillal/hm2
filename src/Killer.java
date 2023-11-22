public class Killer extends Unit{
    public int krit;
    public Killer(int hp , String name , int krit){
        super(hp,name);
        this.krit=krit;
    }
    public void getDamage(int d){
        hp-=d;
    }
    public int attack(){
        int a = (int)(Math.random() * 100);
        if (a > 65){
            return krit;
        }else{
            return 30;
        }
    }

    @Override
    public String toString() {
        return super.toString() + '\n'
                + "krit : " + krit  + '\n';
    }
}
