public class Scope {
    public static void main(String[] arguments) {
        int x = 5;
        if (x == 5) {
//            int x = 6;
            int z = 10;
            int y = 72;
            System.out.println("x = " + z + "y = " + y);
        }
        int y = 5;
        System.out.println("x = " + x + "y = " + y);
    }
}
