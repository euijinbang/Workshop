package ch3;

// 효율적인 연산 - 어느 한 쪽만 참이어도 전체 연산 결과가 참이므로
// 좌측 피연산자가 참이면 우측 피연산자 값은 평가하지 않는다,
public class OperatorEx26 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        System.out.printf("a=%d b=%d%n", a, b);
        System.out.printf("a!=0 || ++b != 0 = %b%n", a != 0 || ++b != 0); // 좌측 피연산자가 참이라서, 우측 실행 안됨
        System.out.printf("a=%d b=%d%n", a, b);
        System.out.printf("a==0 && ++b != 0 = %b%n", a == 0 && ++b != 0); // 좌측 피연산자가 거짓이라, 우측 실행 안됨
        System.out.printf("a=%d b=%d%n", a, b);
    }
}

