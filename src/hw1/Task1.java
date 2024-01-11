package hw1;
import java.util.Scanner;

public class Task1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер квартиры: ");
        int kv = scanner.nextInt();
        int floor = (kv - 1) / 4 + 1;
        int position = (kv - 1) % 4;

        String positionString;
        if (position == 0)
        {
            positionString = "слева от лифта";
        }
        else if (position == 1)
        {
            positionString = "в левом углу";
        }
        else if (position == 2)
        {
            positionString = "в правом углу";
        }
        else
        {
            positionString = "справа от лифта";
        }

        System.out.println("Квартира на этаже №" + floor + " и находится " + positionString);
    }
}