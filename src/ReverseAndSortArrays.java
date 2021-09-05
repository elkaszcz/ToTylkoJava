public class ReverseAndSortArrays {

    static void swap(int[] tab, int a, int b) {
        int c = tab[a];
        tab[a] = tab[b];
        tab[b] = c;
    }

    static int max(int[] tab) {
        int max = -1;
        int maxIndex = 0;
        max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int max(int[] tab, int startPos) {
        int max = -1;
        int maxIndex = startPos;
        max = tab[startPos];
        for (int i = startPos; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void show(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    static void reverse(int[] tab) {
        int itemCount = tab.length / 2;
        for (int i = 0; i < itemCount; i++) {
            swap(tab, i, tab.length - i - 1);
        }
        show(tab);
    }

    static void sort(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            int indexMax = max(tab, i);
            swap(tab, i, indexMax);
        }
        show(tab);
    }

    static int[] generateArray(int width) {
        int[] tab = new int[width];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 100);
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        return tab;
    }

    public static void main(String[] args) {
        int[] tab = generateArray(10);
        sort(tab);
    }

}
