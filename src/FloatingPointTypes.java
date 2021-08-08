public class FloatingPointTypes {
    public static void main(String[] args) {
        float velocity = 1.12345678901234567890f;
        double productWeight = 1.12345678901234567890d;
        float scientificNotation = 3.4e2f;    // 3.4 * 10^2 = 3.4 * 100 = 340;
        double scientificNotation2 = 3.4e-2d; // 3.4 * 10^-2 = 3.4 * 0.01 = 0.034
//        velocity = velocity / 2;
        System.out.println("Twoja predkosc to: " + velocity);
        System.out.println("Waga produktu: " + productWeight);
        System.out.println(scientificNotation);
        System.out.println(scientificNotation2);
    }
}
