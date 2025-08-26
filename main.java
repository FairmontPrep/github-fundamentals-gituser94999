public class main {
    public static void main(String[] args) {
        int a = 10, b = 3, t;
        for (int i=1; i<=6; i++)
        {
        t = a;
        a = i + b;
        b = t - i;
        System.out.print(t);
        System.out.print(a);
        System.out.println(b);

        }

    }
}