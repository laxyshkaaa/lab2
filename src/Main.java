import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите х, учтите, что он принадлежит промежутку  x < 0 <= 2");
        double x = input.nextInt();
        if (x <= 0 || x > 2) {
            System.out.println("Вы ввели неправильный промежуток");
        }
        else {
                System.out.println("Введите максимальное число");
                double n = input.nextDouble();
                double result = 0;
                for (int i = 0; i <= n; i++) {
                    result += Math.pow(-1, i) * Math.pow((x - 1), (i + 1)) / (i + 1);
                }
                System.out.println(result);
            }
        }
    }