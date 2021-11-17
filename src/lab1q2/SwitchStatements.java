/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1q2;

/**
 *
 * @author Faris Faiz
 */
public class SwitchStatements {

    private int num;
    private String color1;

    public int numberGen() {
        int number1 = switch (num / 4) {
            case 0 ->
                10;
            case 1 ->
                1;
            case 2 ->
                2;
            case 3 ->
                3;
            case 4 ->
                4;
            case 5 ->
                5;
            case 6 ->
                6;
            case 7 ->
                7;
            case 8 ->
                8;
            default ->
                9;
        };
        return number1;
    }

    public String colorGen() {
        color1 = switch (num % 4) {
            case 0 ->
                "Yellow ";
            case 1 ->
                "Green ";
            case 2 ->
                "Blue ";
            default ->
                "Red ";
        };
        return color1;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public String getStr() {
        return color1;
    }
}
