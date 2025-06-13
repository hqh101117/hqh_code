// 浮点数运算误差
public class text {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 1;
        double x=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        double y=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println(x);
        System.out.println(y);
    }
}
