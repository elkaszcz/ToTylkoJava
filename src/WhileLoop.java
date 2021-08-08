public class WhileLoop {
    public static void main(String[] args) {
        int i = 100;

        // while loop
        while (i < 5) {
            System.out.println(i + ": Hello while-loop");
            i++;
        }

        // do-while loop
        do {
            System.out.println(i + ": Hello while-loop");
            i++;
        } while (i < 5);
    }
}
