public class TypeCasting {
    public static void main(String[] args) {
        int a = 100;
        float b = 0.01f;

        // Type Casting - rzutowanie typów
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        b = a;
        System.out.println("b = " + b);
        b = 1.99f;
        a = (int) b;
        System.out.println(a);
    }
}
