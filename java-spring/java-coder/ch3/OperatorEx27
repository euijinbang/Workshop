package ch3;

// 논리부정 연산자 활용한 토글 버튼 구현
public class OperatorEx27 {
    public static void main(String[] args) {
        boolean b = true;
        char ch = 'C';

        System.out.printf("b = %b%n", b);
        System.out.printf("!b = %b%n", !b);

        System.out.printf("ch = %c%n", ch);
        System.out.printf("ch < 'a' || ch > 'z'=%b%n", ch < 'a' || ch > 'z');
        System.out.printf("'a' <= ch && ch <= 'z'=%b%n", !('a' <= ch && ch <= 'z'));


        // 인스턴스 생성
        Toggle toggle = new Toggle();
        toggle.click();
        toggle.click();
        toggle.click();

        Toggle2 toggle2 = new Toggle2();
        toggle2.onClick2(true);
        toggle2.onClick2(false);
    }
}


// 클래스 변수 활용
class Toggle {
    static boolean b = true;
    void click (){
        Toggle.b = !b;
        if (b) {
            System.out.printf("참 : %b%n", b);
        }
        else {
            System.out.printf("거짓 : %b%n", b);
        }
    }
}

class Toggle2 {
    private boolean mtnIsActive;
    void onClick2 (boolean b) {
        if (b) {
            System.out.printf("참 : %b%n", b);
        }
        else {
            System.out.printf("거짓 : %b%n", b);
        }
        mtnIsActive = !mtnIsActive;
    }
}