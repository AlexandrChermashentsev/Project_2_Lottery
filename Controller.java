package Project_2_Toy_Store_Lottery;

import java.util.ArrayList;
import java.util.Random;


public class Controller {

    public static void main(String[] args) {
        boolean flag;
        int command;
        ArrayList <Toy> arrList;
        int chance;
        Toy newToy;
        People people;
        Random rnd;
        int number_toy;

        flag = true;
        arrList = new ArrayList<>();
        rnd = new Random();

        
        while (flag){
            System.out.println("1 - добаваить новую игрушку\n2 - начать розыгрыш игрушек\n0 - выход");
            command = IsInt.isInt();
            switch (command) {
                case 1:
                    newToy = Add_toy.Add_toy_v2();
                    System.out.println("Сколько таких игрушек будет разыгрываться?");
                    command = IsInt.isInt();
                    arrList.add(newToy);
                    for (int i = 0; i < command - 1; i++) {
                        arrList.add(new Toy(newToy.getToyName()));
                    }
                    break;
                case 2:
                    while (flag) {
                        System.out.println("1 - Беспроигрышная лоттерея\n2 - Не все получат свои призы\n3 - Посмотреть список разыгрываемых игрушек\n0 - Назад");
                        command = IsInt.isInt();
                        if (command == 1) { // беспрогирышная лоттерея
                            chance = 100;
                            while (arrList.size() != 0) {
                                people = new People();
                                number_toy = rnd.nextInt(arrList.size());
                                if (Lottery.lottery(people, arrList.get(number_toy), chance)){
                                    arrList.remove(number_toy);
                                }
                            }
                        } else if (command == 2) { // шанс выйграть = 20%
                            chance = 20;
                            while (arrList.size() != 0) {
                                people = new People();
                                number_toy = rnd.nextInt(arrList.size());
                                if (Lottery.lottery(people, arrList.get(number_toy), chance)){
                                    arrList.remove(number_toy);
                                }

                            }
                        } else if (command == 3){
                            int count = 1;
                            for (Toy toy : arrList) {
                                System.out.printf("%d - ", count);
                                System.out.println(toy);
                                count += 1;
                            }
                        } else if (command == 0) {
                            flag = false;
                        } else {System.out.println("Неверная команда");}
                    }
                    flag = true;
                    break;
                case 0:
                    System.out.println("выход");
                    flag = false;
            }            
        }        
    }
}
