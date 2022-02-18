package ch8;

public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println("error msg : " + e.getMessage());
            System.out.println("공간을 확보해주세요.");
        } catch (MemoryException me) {
            System.out.println("error msg : " + me.getMessage());
            System.out.println("다시 설치를 시도하세요.");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException { // 발생할 수 있는 예외를 선언 (적지 않아도 문제없음)
        if (!enoughSpace())
            throw new SpaceException("설치할 공간이 부족합니다."); // 예외를 생성
        if (!enoughMemory())
            throw new MemoryException("메모리가 부족합니다.");
    }

    static void copyFiles() {}
    static void deleteTempFiles() {}

    static boolean enoughSpace() { return true; }
    static boolean enoughMemory() { return false; }
}

class SpaceException extends RuntimeException {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends RuntimeException {
    MemoryException(String msg) {
        super(msg);
    }
}