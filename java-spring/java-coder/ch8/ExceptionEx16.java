package ch8;

import java.io.File;

// 예외를 메서드에 선언해서, 호출한 main 메서드에서 처리
public class ExceptionEx16 {
    public static void main(String[] args) {
        try {
            File f = createFile(args[0]);
            System.out.println(f.getName() + "file produced");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "rewrite file name");
        }
    }

    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals("")) {
            throw new Exception("invalid file name");
        }
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }

}
