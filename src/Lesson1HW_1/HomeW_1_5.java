package Lesson1HW_1;

public class HomeW_1_5 {
    static public void main(String[] args){
        int n = 126;
        int a = n/100;
        int b = n / 10 % 10;
        int c = n % 10;
        int sum = a + b + c;
        System.out.println("Сумма цифр числа" + n + "равна: " + sum);
    }
}
