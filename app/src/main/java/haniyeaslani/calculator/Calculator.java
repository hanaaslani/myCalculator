package haniyeaslani.calculator;

import android.text.StaticLayout;

import java.util.Scanner;

/**
 * Created by haniyeaslani on 2018/10/27.
 */

public class Calculator {

    double FirstNummber = 0;
    double SecondNummber = 0;
    String action = "";

    public double GetFirstNum() {
        print("enter your first number");
        Scanner scanner = new Scanner(System.in);
        return FirstNummber = scanner.nextDouble();
    }

    public double GetSecondNum() {
        print("enter your second number: ");
        Scanner scanner = new Scanner(System.in);
        return SecondNummber = scanner.nextDouble();
    }

    public String Action() {
        print("enter your action (type stop to quit)");
        Scanner scanner = new Scanner(System.in);
        return action = scanner.next();
    }


    public static void print(String Text) {
        System.out.println(Text);
    }

    public void Calculate() {
        double Result = 0;
        switch (action) {
            case "+":
                System.out.println("your answer is :" + (FirstNummber+SecondNummber));
                break;
            case "-":
               System.out.println("your answer us : " + (FirstNummber-SecondNummber));
                break;
            case "*":
                System.out.println("your answer us : " + (FirstNummber*SecondNummber));
                break;
            case "/":
                System.out.println("your answer us : " + (FirstNummber/SecondNummber));
                break;
        }

    }
}
