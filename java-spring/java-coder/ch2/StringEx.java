package ch2;

public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " ");
        System.out.println(" " + 7);
        System.out.println(7 + "");
        System.out.println("" + 7);
        System.out.println("" + "");
        System.out.println(7 + 7 + ""); // 14 + "" => "14"
        System.out.println("" + 7 + 7); // 기본형 타입의 값을 문자열로 바꾸고 싶다면, 빈 문자열을 더해주자.
    }
}
