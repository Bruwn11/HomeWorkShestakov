import java.util.Random;
import java.util.Scanner;

public class NewClass {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите пожалуйста два целых числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        int diff = a-b;
        int multiplication = a*b;
        int division = a/b;
        int remains = a%b;
        System.out.println("sum = " + sum);
        System.out.println("diff = " + diff);
        System.out.println("multiplication = " + multiplication);
        System.out.println("division = " + division);
        System.out.println("remains = " + remains);
        Random ch = new Random();
        int c1 = ch.nextInt();
        int c2 = ch.nextInt();
        int c3 = ch.nextInt();
        int c4 = ch.nextInt();
        char ch1 = (char) c1;
        char ch2 = (char) c2;
        char ch3 = (char) c3;
        char ch4 = (char) c4;
        System.out.println("Случайным числам в диапазоне int " + c1 + " " + c2+ " " + c3 + " " + c4);
        System.out.println("Соответствуют символы " + ch1 + " " + ch2+ " " + ch3 + " " + ch4);
        long lx = 4000000000L;
        int x = (int) lx;
        System.out.println(lx);
        System.out.println(x);
    }
}
