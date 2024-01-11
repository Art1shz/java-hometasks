package hw1;
import java.util.Scanner;

public class Task2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int ticketNumber;
        int sumFirstThreeDigits = 0;
        int sumLastThreeDigits = 0;
        System.out.println("Введите шестизначный номер билета:");
        ticketNumber = scanner.nextInt();
        if (String.valueOf(ticketNumber).length() == 6)
        {
            String numberString = String.valueOf(ticketNumber);
            for (int i = 0; i < 3; i++)
            {
                sumFirstThreeDigits += Character.getNumericValue(numberString.charAt(i));
                sumLastThreeDigits += Character.getNumericValue(numberString.charAt(i + 3));
            }
            if (sumFirstThreeDigits % 2 == 0 && sumLastThreeDigits % 2 == 0 && sumFirstThreeDigits == sumLastThreeDigits)
            {
                System.out.println("Билет является счастливым.");
            }
            else
            {
                System.out.println("Билет не является счастливым.");
            }
        }
    }
}