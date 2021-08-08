public class OperatoryLogiczne {
    public static void main(String[] args) {
        int hour = -6;


        // && - Logical AND
        if (hour > 0 && hour < 23) {
            System.out.println("Jest wieczor");
        }

        // || - Logical OR
        if (hour > 0 || hour < -5) {
            System.out.println("Warunek 2 jest spelniony");
        }
    }
}
