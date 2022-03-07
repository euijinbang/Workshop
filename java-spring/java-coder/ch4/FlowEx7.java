package ch4;

import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args) {
        int u;
        int c;

        System.out.println("1(가위), 2(바위), 3(보) 중 하나를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);

        String tmp = scanner.nextLine();
        u = Integer.parseInt(tmp);

        c = (int) (Math.random() * 3) + 1;

        System.out.printf("당신은 %d 입니다.", u);
        System.out.printf("컴퓨터는 %d 입니다.", c);

        switch (u - c) {
            case -2: case 1:
                System.out.println("당신이 이겼습니다.");
                break;
            case 2: case -1:
                System.out.println("당신이 졌습니다.");
                break;
            default:
                System.out.println("비겼습니다.");
        }
    }
}
