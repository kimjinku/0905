package day8.m5;

import java.util.HashMap;

public class m5 {
    public static void main(String[] args) {
        // 사람 정보를 map으로 저장하고 출력하기
        // 사람 1 정보
        // 이름 : 홍길동
        // 나이 : 22
        // 키 : 170.5

        // 사람 2 정보
        // 이름 : 홍길순
        // 나이 : 25
        // 키 : 162.4
        //import 단축키 alt + enter
        //settings 들어가서 auto import 검색, 두개 체크

        HashMap  <String , Object> map = new HashMap<>();
        map.put("이름", "홍길동");
        map.put("나이", 22);
        map.put("키", 170.5);

        System.out.println((Integer) map.get("나이"));
        HashMap  <String , Object> map2 = new HashMap<>();


        map2.put("이름", "이순신");
        map2.put("나이", 25);
        map2.put("키", 162.4);

        int a= (Integer) map2.get("나이");

        System.out.println(a);


    }
}
class Person{

}
