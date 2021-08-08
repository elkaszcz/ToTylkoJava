public class BooleanType {
    public static void main(String[] args) {
        boolean isTall = false;
        int height = 191;

        isTall = height <= 180;

        System.out.println("Czy osoba jest wysoka: " + isTall);

        String isVeryTall = height > 190 ? "Jest bardzo wysoki" : "Nie jest bardzo wysoki";
        System.out.println(isVeryTall);
    }
}
