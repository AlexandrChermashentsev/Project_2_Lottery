package Project_2_Toy_Store_Lottery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class People {
    private String firstName;
    private String secondName;

    public People(){
        this.firstName = RandomName(FileReader(PWD("names.txt")));
        this.secondName = RandomName(FileReader(PWD("secondNames.txt")));
    }

    
 
    public ArrayList FileReader(String pathName){
        // File file = new File("names.txt");
        ArrayList <String> arrList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathName)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                arrList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrList;
    }

    public String RandomName(ArrayList <String> arList){
        String name;
        String s1;
        String nameCapitalized;
        Random rnd = new Random();
        int rndInt = rnd.nextInt(arList.size());
        name = arList.get(rndInt);
        s1 = name.substring(0, 1).toUpperCase();
        nameCapitalized = s1 + name.substring(1);
        return nameCapitalized;
    }


    public String PWD(String nameFile){
        String pathFile;
        pathFile = new File("Project_2_Toy_Store_Lottery/" + nameFile).getAbsolutePath();
        return pathFile;
    }

    private String getInfo(){
        return String.format("%s %s", firstName, secondName);
    }

    @Override
    public String toString(){
        return getInfo();
    }
}





