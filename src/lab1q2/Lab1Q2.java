package lab1q2;

import java.util.Random;

public class Lab1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        SwitchStatements state = new SwitchStatements();

        int num1, num2, number1, number2;
        String color1, color2;
        num1 = random.nextInt(40);
        num2 = random.nextInt(40);

        state.setNum(num1);
        number1 = state.numberGen();
        state.setNum(num2);
        number2 = state.numberGen();

        color1 = state.colorGen();
        color2 = state.colorGen();

        System.out.println("Card 1 is " + number1 + " " + color1);
        System.out.println("Card 2 is " + number2 + " " + color2);

        if (number1 > number2) {
            System.out.println("Card 1 is bigger than Card 2");
        } else if (number1 < number2) {
            System.out.println("Card 2 is bigger than Card 1");
        } else {
            System.out.println("Card 1 and Card 2 is the same");
        }
    }

}
