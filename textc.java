import java.util.Scanner;

public class textc {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input your name: "); // 打印提示
            String name = scanner.nextLine(); // 读取一行输入并获取字符串
            System.out.print("Input your age: "); // 打印提示
            int age = scanner.nextInt(); // 读取一行输入并获取整数
            System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
        }
    }
}
