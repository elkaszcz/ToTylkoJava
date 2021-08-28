public class ReverseAnArray {

    static void swap(int[] tab, int a, int b) {
        int c = tab[a];
        tab[a] = tab[b];
        tab[b] = c;
    }

    static void show(int[] tab) {
        for(int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7};
        int itemCount = tab.length / 2;
        for(int i = 0; i < itemCount; i++) {
            swap(tab, i, tab.length - i - 1);
        }
        show(tab);

    }
}
