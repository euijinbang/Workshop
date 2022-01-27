import java.util.Random;

public class Collections {
    final static Random random = new Random();

    public static void main(String[] args) {
        System.out.println(getFruit());
    }

    static String getFruit() {
        String foods[] = {"Rice", "Apple", "Orange", "Banana"};

        int randomNum = random.nextInt();

        int i = randomNum % foods.length;

        return foods[i];
    }
}
