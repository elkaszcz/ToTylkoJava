public class IfStatement {
    public static void main(String[] args) {
        int humanHeight = 175;

        // tutaj sprawdzam graniczny wzrost czlowieka
        if (humanHeight <= 0) return;
        if (humanHeight > 300) return;

        // > < >= <= == !=
        if (humanHeight >= 180) {
            System.out.println("Czlowiek jest wysoki");
        } else if(humanHeight <= 180) {
            System.out.println("czlowiek jest sredniego wzrostu lub niski");
        }

        if (humanHeight >= 180) {
            System.out.println("Czlowiek jest wysoki");
        } else {
            System.out.println("człowiek jest średniego wzrostu lub niski");
        }

    }
}
