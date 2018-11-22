package Files; 

import java.util.Scanner;

public class DivideByTwo{

    public static void divideByTwoMethod(){
        Scanner in = new Scanner(System.in);
        int x;

        System.out.println("Enter an integer: ");
        try {
            String oneLine = in.nextLine();
            x = Integer.parseInt(oneLine);
            System.out.println("Half of x is " + (x/2));
        } catch (NumberFormatException e) {
            //TODO: handle exception
            System.out.println(e);
        }
        in.close();
    }

}