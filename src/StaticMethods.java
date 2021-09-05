public class StaticMethods {
    static void showGreeting() {
        System.out.println("Hello world!");
        System.out.println("---");
    }

    static void hello(String name) {
        System.out.println("Hello, your name is " + name);
    }

    static void showNumber(int a) {
        System.out.println("Your number is " + a);
    }

    static void showAdded(int a, int b) {
        System.out.println("Show sum " + (a + b));
    }

    static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    static float add(float a, float b) {
        float c = a + b;
        return c;
    }

    static void printTab(int[] myArray) {
        for(int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] tab = new int[5];
        int[] tab2 = new int[20];
        tab[3] = 45;
        tab2[5] = 555;
        printTab(tab);
        printTab(tab2);

//        showGreeting();
//        showGreeting();
//        hello("Izabella");
//        hello("Marcelina");
//        hello("Lukasz");
//        showNumber(34);
//        showAdded(6, 3);
//
//        int c = add(5, 6);
//        System.out.println(c);
//
//        System.out.println(add(8, 11));
//        float f1 = add(3.14f, 2.76f);
//        System.out.println("Your float number is " + f1);
    }
}
