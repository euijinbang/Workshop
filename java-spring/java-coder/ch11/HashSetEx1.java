package ch11;

import java.util.HashSet;
import java.util.Set;

// 집합 자료형 HashSet, Set 인터페이스를 구현하였다.

public class HashSetEx1 {
    public static void main(String[] args) {
        Object[] objArr = {"1", 1, "2", "2", "3"};

        Set set = new HashSet();

        for (int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]);
        }

        System.out.println(set);
    }
}
