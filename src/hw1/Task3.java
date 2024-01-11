package hw1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год в диапазоне от 1500 до 2024:");
        int year = scanner.nextInt();
        int century = (year - 1) / 100 + 1;
        if (century >= 15 && century <= 21) 
        {
            System.out.println("Век = " + century);
        } else 
        {
            System.out.println("Данный год не входит в диапазон");
        }
    }
}
