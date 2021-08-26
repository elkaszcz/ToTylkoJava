public class Arrays {
    public static void main(String[] args) {
        int randomNum = 0;
        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            randomNum = (int)(Math.random() * 10);
            tab[i] = randomNum;
            System.out.print(tab[i] + ", ");
        }
        System.out.println();
        System.out.println("--");
    }
}
