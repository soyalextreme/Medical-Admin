package inputs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputInt {
    public static int inputInt(String msg, int def){
        Scanner s = new Scanner(System.in);
        int num = 0;
        try{
            System.out.println(msg);
            num = s.nextInt();
        }catch (InputMismatchException e){
            num = def;
        }
        return num;
    }


    public static int inputInt(String msg, int def, int max){
        Scanner s = new Scanner(System.in);
        int num = 0;
        try{
            System.out.println(msg);
            num = s.nextInt();
            if(num > max){
                num = max;
            }
        }catch (InputMismatchException e){
            num = def;
        }
        return num;
    }


    public static int inputInt(String msg, int def, int max, int min ){
        Scanner s = new Scanner(System.in);
        int num = 0;
        try{
            System.out.println(msg);
            num = s.nextInt();
            if (num > max){
                num =  max;
            }else if(num < min){
                num = min;
            }
        }catch (InputMismatchException e){
            num = def;
        }
        return num;
    }
}
