public class Lekcja1Zadanie1 {
    public static void main(String[] args) {
        int age = 18;

        if (age < 0) return;
        if (age > 130) return;

        if (age < 19) {
            System.out.println("Jestes niepelnoletni.");
        } else if (age < 35) {
            System.out.println("Jestes mlody.");
        } else if (age < 60) {
            System.out.println("Jestes w srednim wieku");
        } else {
            System.out.println("Jetes stary");
        }
    }
}
