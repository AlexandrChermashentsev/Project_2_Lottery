package Project_2_Toy_Store_Lottery;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Lottery {
    static int percentage_chance;
    static int chance;
    static Random rnd;

    public static boolean lottery(People man, Toy toy, int chance){
        rnd = new Random();
        percentage_chance = rnd.nextInt(100);
        if (chance >= percentage_chance){
            try(FileWriter writer = new FileWriter("Project_2_Toy_Store_Lottery/Winners.txt", true)){
               // запись всей строки
                String text = man + " - забирает " + toy;
                writer.append(text + "\n");
            } catch(IOException ex){ 
                System.out.println(ex.getMessage());
            } 
            return true;
            // System.out.println(man + " - забирает " + toy);
        } else {
            System.out.println(man + " - не повезло(" + percentage_chance + "%)");
            return false;
        }
    }
}
