import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = scan.nextInt();
        System.out.print("Введите y: ");
        int y = scan.nextInt();
        System.out.print("Введите z: ");
        int z = scan.nextInt();
        int average = (x+y+z)/3;
        System.out.printf("Среднее арифметическое введенных чисел = %d \n",average);
        if (average/2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
        scan.close();
    }
}