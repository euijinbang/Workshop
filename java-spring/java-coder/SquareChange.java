public class SquareChange {
    // 메서드의 파라미터는 메서드에 새 변수를 정의하는 것과 같다.
    public static void printSquare(int x) {
        System.out.println("printSquare x = " + x);
        x = x * x;
        System.out.println("PrintSquare x = " + x);
    }

    // 변수는 정의된 스코프 내의 블럭 {} 에서만 살아있다.
    public static void main(String[] arguments) {
        int x = 5;
        System.out.println("main x = " + x);
        printSquare(x);
        System.out.println("main x = " + x);
    }
}
