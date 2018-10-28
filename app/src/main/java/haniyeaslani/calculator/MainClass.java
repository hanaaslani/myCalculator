package haniyeaslani.calculator;

/**
 * Created by haniyeaslani on 2018/10/27.
 */

public class MainClass {
    public static void main(String[] args){
        Calculator myCalculator = new Calculator();

        boolean again = true;
        String stop ="";
        while(again) {
            myCalculator.GetFirstNum();
            myCalculator.GetSecondNum();
            myCalculator.Action();
            stop=myCalculator.action;
            myCalculator.Calculate();
            if (stop.equals("stop")) {
            again= false;}
            else {}
            }


        }
        }


