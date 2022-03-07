package ch11;

import java.util.*;

// 중복없는 해쉬셋을 활용한 로또 번호 만들기

public class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }

        // set 을 리스트 타입으로 처리
        List list = new LinkedList<>(set);
        Collections.sort(list);

        System.out.println(list);
    }
}
