package day8.HashMapExam;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExam {
    public static void main(String[] args) {

        // ArrayList

        ArrayList<String> list = new ArrayList<>();

        // 배열은 같은 자료형만 묶을 수 있었다.
        // 데이터 접근은 숫자 인덱싱
        list.add("홍길동");
        list.add("20");
        list.add("대전");

        // 어디에 뭐가 있는지 모른다 -> 그래서 클래스/객체 사용

        // 해시맵 -> 데이터를 키바인딩하여 저장

        HashMap map = new HashMap();

        // 저장 -> put(key, value)
        // 조회 -> get(key)
        // 수정 -> put(key, value)
        // 삭제 -> remove(key)

        map.put(0, "홍길동");
        map.put("이름", "홍길동");
        map.put(true, "참");
        map.put("나이", 20);
        map.put("사과", new 사과());
        // 조회 -> get(key)
        System.out.println(map.get(0));
        System.out.println(map.get("이름"));
        System.out.println(map.get(true));
        System.out.println(map.get("나이"));
        System.out.println(map.get("사과"));

        // 제너릭을 사용한 버전 -> key와 value의 타입을 고정할 수 있음
        HashMap<String, String> myMap = new HashMap<>();

        myMap.put("이름", "홍길동");
        myMap.put("나이", "20");
        myMap.put("거주지", "대전");

        System.out.println(myMap.get("이름"));
        String name = myMap.get("이름");
        System.out.println(name);

        // 제너릭을 사용한 버전2 -> value의 경우 다양한 데이터를 저장하기 위해 Object를 사용하는 경우도 많다.
        HashMap<String, Object> myMap2 = new HashMap<>();
        myMap2.put("이름" , "홍길동");
        myMap2.put("나이" , 20);
        myMap2.put("거주지" , "대전");

        String name2 = (String)myMap2.get("이름"); // value의 제너릭이 Object이므로 수동형변환이 꼭 필요하다.
        System.out.println(name2);

        int age = (Integer) myMap2.get("나이"); // value의 제너릭이 Object이므로 수동형변환이 꼭 필요하다.
        System.out.println(age);

        //put -> 수정
        // put -> 키가 존재하면 수정, 존재하지 않으면 저장
        myMap2.put("이" +
                "름", "이순신");

        // remove -> 삭제
        myMap2.remove("거주지");
        System.out.println(myMap2.get("거주지")); // 없는 키를 달라고 하면 null이 나옴


        // 맵은 대체로 객체로 대체 가능하다.
        // 그러나 편리하고, 탐색 속도 빠르며, 배열에 비해 데이터의 구조가
        // 상대적으로 명확해서 자주 사용한다.
    }
}

class 사과 {

}
