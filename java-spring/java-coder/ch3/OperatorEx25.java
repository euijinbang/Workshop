package ch3;
import java.util.*;

// String 은 비교불가, char 는 가능
// 입력받은 하나의 문자가 숫자인지 영문자인지 확인한다.
public class OperatorEx25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자를 입력하세요. >");

        String input = scanner.nextLine();
        char ch = input.charAt(0);

        // 입력문자가 숫자인 경우
        if ('0' <= ch && ch <= '9') {
            System.out.println("숫자입니다.");
        }
        // 입력문자가 문자인 경우
        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.println("문자입니다.");
        }
    }
}
