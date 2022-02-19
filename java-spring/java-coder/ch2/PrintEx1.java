package ch2;

public class PrintEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFL;

        int octNum = 010;   // 8진수 10, 10진수 8
        int hexNum  = 0x10; // 16진수 10, 10진수 16
        int binNum = 0b10;  // 2진수 10, 10진수 2

        System.out.printf("b = %d%n", b);   // 1
        System.out.printf("s = %d%n", s);   // 2
        System.out.printf("c = %c, %d %n", c, (int)c);  // A, 65 (char 타입은 int 로 변환해야만 정수출력 가능)
        System.out.printf("finger = [%5d]%n", finger);  // [   10] 앞에서부터 공백 채우면서 5자리 출력
        System.out.printf("finger = [%-5d]%n", finger); // [10   ] 뒤에서부터 공백 채우면서 5자리 출력
        System.out.printf("finger = [%05d]%n", finger); // [00010] 앞에서부터 0을 채우면서 5자리 출력
        System.out.printf("big = %d%n", big);   // 100000000000
        System.out.printf("hex = %#x%n", hex);  // 0xfffffffffffffff
        System.out.printf("octNum = %o, %d%n", octNum, octNum); // 10, 8
        System.out.printf("hexNum = %x, %d%n", hexNum, hexNum); // 10, 16
        System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(binNum), binNum); // 10, 2


    }
}
