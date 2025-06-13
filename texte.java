import java.util.Scanner;

public class texte {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("请输入您的身高(单位：米)：");
            float height = scanner.nextFloat();
            System.out.print("请输入您的体重(单位：公斤)：");
            float weight = scanner.nextFloat();
            float bmi = weight / (height * height);
            System.out.printf("您的BMI指数为：%.2f\n", bmi);
            if (bmi < 18.5) {
                System.out.println("过轻");
            } else if (bmi < 25) {
                System.out.println("正常");
            } else if (bmi < 28) {
                System.out.println("过重");
            } else if (bmi < 32) {
                System.out.println("肥胖");
            } else {
                System.out.println("严重肥胖");
            }
        }
    }
}
