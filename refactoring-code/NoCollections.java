import java.util.Random;

class NoCollections {
    final static Random random = new Random();

    public static void main(String[] args) {
        System.out.println(getFruit());
    }

    static String getFruit() {
        int randomNum = random.nextInt(11); // 1부터 10까지 반환
        int i = randomNum % 4;

        switch (i) {
            case 0:
                return "Rice";
            case 1:
                return "Apple";
            case 2:
                return "Orange";
            case 3:
                return "Banana";
            default:
                return null; // default 를 주어야 예외처리가 가능하다
        }
    }
}