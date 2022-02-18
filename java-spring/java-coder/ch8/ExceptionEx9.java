package ch8;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시켰음");
            throw e;
//            throw new Exception("고의로 발생시켰음");
        } catch (Exception e) {
            System.out.println("error message : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("program finished");
    }
}
