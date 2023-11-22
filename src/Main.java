
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Magic Invoker = new Magic(1000 ,"Invoker ",150);
        Magic Invoker2 = new Magic(1,"1" , 1);
        Warrior WraithKing = new Warrior(2000, "WraithKing", 100);
        Warrior WraithKing2 = new Warrior(1 , "1" , 1);
        Killer Juggernaut = new Killer(900 , "Juggernaut" , 100);
        Killer Juggernaut2 = new Killer(900 , "Juggernautt" , 100);

        Invoker2.koppir(Invoker);
        WraithKing2.koppir(WraithKing);
        Juggernaut2.koppir(Juggernaut);
        while (Invoker.hp > 0 && WraithKing.hp > 0){
            Invoker.getDamage(WraithKing.attack());
            WraithKing.getDamage(Invoker.attack());

        }
        if (WraithKing.hp > 0){
            System.out.println("Invoker vs WraithKing");
            System.out.println("!!!!! WraithKing Victory !!!!!");
        }else{
            System.out.println("Invoker vs WraithKing");
            System.out.println("!!!!! Invoker Victory !!!!!");
        }
        Invoker.koppir(Invoker2);
        WraithKing.koppir(WraithKing2);
        System.out.println("D0 YUO WANNA KNOW BATTLE DETAILS");
        System.out.println("Print YES or NO");
        String s = in.nextLine();
        if (s.equals("YES")){
            FightDeteils_for_Magic_vs_Warrior(Invoker , WraithKing);
        }
        while (Invoker.hp > 0 && Juggernaut.hp > 0){
            Invoker.getDamage(Juggernaut.attack());
            Juggernaut.getDamage(Invoker.attack());
        }
        if (Invoker.hp > 0){
            System.out.println("Invoker vs Juggernaut");
            System.out.println("!!!!! Invoker Victory !!!!!");
        }else{
            System.out.println("Invoker vs Juggernaut");
            System.out.println("!!!!! Juggernaut Victory !!!!!");
        }
        System.out.println("D0 YUO WANNA KNOW BATTLE DETAILS");
        System.out.println("Print YES or NO");

        Juggernaut.koppir(Juggernaut2);
        Invoker.koppir(Invoker2);
        String ss = in.nextLine();
        if (ss.equals("YES")){
            FightDeteils_for_Magic_vs_Killer(Invoker , Juggernaut);
        }




    }

    public static void cin(int[] arr){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();

        }

    }
    public static void FightDeteils_for_Magic_vs_Warrior(Magic Invoker , Warrior WraithKing){

        while (Invoker.hp > 0 && WraithKing.hp > 0){
            System.out.println(Invoker);
            System.out.println(WraithKing);
            Invoker.getDamage(WraithKing.attack());
            WraithKing.getDamage(Invoker.attack());

        }
        System.out.println(Invoker);
        System.out.println(WraithKing);
    }
    public static void FightDeteils_for_Magic_vs_Killer(Magic Invoker , Killer WraithKing){

        while (Invoker.hp > 0 && WraithKing.hp > 0){
            System.out.println(Invoker);
            System.out.println(WraithKing);
            Invoker.getDamage(WraithKing.attack());
            WraithKing.getDamage(Invoker.attack());

        }
        System.out.println(Invoker);
        System.out.println(WraithKing);
    }


    public static  void cout(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

