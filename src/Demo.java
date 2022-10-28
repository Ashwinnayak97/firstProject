public class Demo {
    public static void main(String[] args) {
        int addres=m1(2,6);
        System.out.println(addres);
        int subres=m2(2,6);
        System.out.println(subres);
        int multres=m3(2,6);
        System.out.println(multres);
        int divres=m4(2,6);
        System.out.println(divres);

    }
    public static int m1(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public static int m2(int a,int b)
    {
        return a-b;
    }
    public static int m3(int a,int b)
    {
        return a*b;
    }
    public static int m4(int a,int b)
    {
        return a/b;
    }
}
