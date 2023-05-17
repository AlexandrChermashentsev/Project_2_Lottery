package Project_2_Toy_Store_Lottery;

import java.util.Scanner;

public class Add_toy {
    static String toy_name;
    static Scanner mscanner;

    public static Toy Add_toy_v2(){
        mscanner = new Scanner(System.in);
        System.out.println("Как называется игрушка?");
        toy_name = mscanner.nextLine();
        Toy toy = new Toy(toy_name);
        return toy;
    }
}    


