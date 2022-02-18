import java.util.*;

public class SimpleChatBot {

    public static void intro() {
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2021.");
        System.out.println("Please, remind your name.");
    }

    public static void welcome(String name) {
        System.out.println("What a great name you have, " + name + '!');
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7");
    }

    public static int ageCalculator(int re1, int re2, int re3) {
        int age = 0;
        for (int i = 10; i < 50; i++) {
            if ((i % 3 == re1) && (i % 5 == re2) && (i % 7 == re3)) {
                age = i;
            }
        }
        return age;
    }

    public static void welcome2(int age) {
        System.out.println("Your age is " + age + ": that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
    }

    public static void counter(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.println(i + "!");
        }
    }

    public static void testIntro() {
        System.out.println("Let's test your programming knowledge");
        System.out.println("Why do you use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program");
    }

    public static void test(int answer) {
        while (true) {
            int next_answer = scanner.nextInt();
            if (answer == 2) {
                System.out.println("Congratulations, have a nice day!");
                break;
            } else {
                System.out.println("Please, try again.");
                test(next_answer);
            }
        }
    }

    // 고정
    final static Scanner scanner = new Scanner(System.in);

    public static void main (String[]args){
        intro();

        String name = scanner.nextLine();
        welcome(name);

        int r1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int r3 = scanner.nextInt();
        int age = ageCalculator(r1, r2, r3);

        welcome2(age);

        int num = scanner.nextInt();
        counter(num);

        testIntro();
        int answer = scanner.nextInt();
        test(answer);
    }
}
