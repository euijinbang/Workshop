public class DoMath {
    public static void main(String[] args) {
        double score = 1.0 + 2.0 * 3.0;
        System.out.println(score);
        double copy = score;
        copy = copy / 2.0;
        System.out.println(copy);
        System.out.println(score);

        String text = "hello" + " world";
        text = text + " number " + 5;
        System.out.println(text);
    }
}
