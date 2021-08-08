public class ForLoop {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 5; i++) {
            System.out.println("krok: " + i);
        }
        System.out.println();
        for (i = 5; i > 0; i--) {
            System.out.println("krok: " + i);
        }

        // 1: *
        // 2: **
        // 3: ***
        // 4: ****

        // Zadanie domowe 1
        // 1:       *
        // 2:      ***
        // 3:     *****
        // 4:    *******
        // 5:   *********
        // 6:  ***********
        // 7: *************

        // Zadanie domowe 2
        // 1:       *
        // 2:      ***
        // 3:     *****
        // 4:    *******
        // 5:   *********
        // 6:  ***********
        // 7: *************
        // 6:  ***********
        // 5:   *********
        // 4:    *******
        // 3:     *****
        // 2:      ***
        // 1:       *
    }
}
