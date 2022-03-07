package ch11;

import java.util.HashSet;

public class HashSetEx4 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person2("David", 10));
        set.add(new Person2("David", 10)); // 서로 다른 인스턴스이므로 set임에도 불구하고 중복출력됨

        System.out.println(set);
    }
}

class Person2 {
    String name;
    int age;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // equals() 오버라이드
    // hashCode() 오버라이드


    public String toString() {
        return name +":"+ age;
    }
}
