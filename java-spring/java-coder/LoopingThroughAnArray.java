public class LoopingThroughAnArray {
    public static void main(String[] args) {
        forLoop();
        whileLoop();
    }

    private static void forLoop() {
        int[] values = new int[5];

        for (int i = 0; i < values.length; i++) {
            values[i] = i;
            int y = values[i] * values[i];
            System.out.println(y);
        }
    }

    private static void whileLoop() {
        int[] values = new int[5];
        int i = 0;  // set a variable
        while (i < values.length) {
            values[i] = i;
            int y = values[i] * values[i];
            System.out.println(y);
            i++;
        }
    }
}
