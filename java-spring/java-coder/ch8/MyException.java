package ch8;

// MyException 발생시 catch 블럭에서 getMessage(), getErrorCode() 사용하여 에러코드와 메세지를 얻는다.
public class MyException extends RuntimeException {

    private final int ERR_CODE;

    MyException(String msg, int errCode) {  // 문자열을 매개변수로 받는 생성자
        super(msg); // 조상인 Exception 클래스의 생성자를 호출
        ERR_CODE = errCode;
    }

    MyException(String msg) {
        this(msg, 100);
    }

    public int getErrCode() {
        return ERR_CODE;
    }
}
