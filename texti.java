import java.util.Scanner;

public class texti {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("请输入第一个数字：");
            int num1 = scanner.nextInt();
            System.out.print("请输入第二个数字：");
            int num2 = scanner.nextInt();
            int temp = num1;
            if (num1 > num2) {
                num1 = num2;
                num2 = temp;
            }
            int sum = 0;
            for (int i = num1; i <= num2; i++) {
                sum += i;
            }
            System.out.print("从" + temp + "到" + num2 + "的和为：" + sum);
        }
    }
}