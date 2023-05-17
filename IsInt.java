package Project_2_Toy_Store_Lottery;

import java.util.Scanner;

public class IsInt {
    
    public static int isInt() {
        String test;
        int intNumber = 0;
        boolean isIntBoolean = true;
        Scanner iScanner = new Scanner(System.in);

        while (isIntBoolean) {
            System.out.println("Введите целое число ");
            test = iScanner.nextLine();
            try {
                intNumber = Integer.parseInt(test);
                isIntBoolean = !true;
            }
            catch (NumberFormatException e){
                System.out.println("Это не целое число!");
                isIntBoolean = !false;}           
        }
        return intNumber;
    }
}
