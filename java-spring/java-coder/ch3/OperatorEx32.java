package ch3;

public class OperatorEx32 {
    public static void main(String[] args) {
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;

        // 절대값을 만들어보자
        absX = (x > 0) ? x : -x;
        absY = (y > 0) ? y : -y;
        absZ = (z > 0) ? z : -z;

        System.out.println(absX);
        System.out.println(absY);
        System.out.println(absZ);

        // 부호를 붙여보자
        signX = (x > 0) ? '+' : (x == 0 ? ' ' : '-');
        signY = (y > 0) ? '+' : (y == 0 ? ' ' : '-');
        signZ = (z > 0) ? '+' : (z == 0 ? ' ' : '-');

        System.out.printf("%c%d%n", signX, absX);
        System.out.printf("%c%d%n", signY, absY);
        System.out.printf("%c%d%n", signZ, absZ);
    }
}
