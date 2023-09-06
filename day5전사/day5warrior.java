package day5전사;

import org.w3c.dom.ls.LSOutput;

public class day5warrior {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "홍길동";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();
        // 안녕하세요 저는 20살 홍길동입니다.

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 홍길동이/가 활로 10의 데미지를 입힙니다.
        a전사.스킬사용();
        // 출력 : 홍길동이/가 불화살 스킬을 사용합니다. 1.5배(15)의 피해를 입힙니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 홍길동이/가 칼로 15의 데미지를 입힙니다.
        a전사.스킬사용();
        // 출력 : 홍길동이/가 연속 베기 스킬을 사용합니다. 2배(30)의 피해를 입힙니다.

    }
}

class 전사 {
    // 인스턴스 변수
    String 이름;
    // 인스턴스 변수
    int 나이;
    // 인스턴스 변수
    무기 a무기; //무기 클래스에서 들어올수 있는 a변수 - 리모컨
               //


    void 공격(){
        a무기.작동1();

    }
    void 스킬사용(){
        a무기.무기스킬사용();

    }

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + 나이 + "살 " + 이름 + " 입니다.");
    }

}
//class 무기 extends 전사 =>억지
//무기는 전사다. -> 이상함.
class 무기 {
     void 작동1(){


    }
    void 무기스킬사용(){

    }

}
// 칼 -> 무기다. 이상하지않음. 상속 가능
class 칼 extends 무기 {
    int damage =15;

    void 작동1(){
        System.out.printf("홍길동이/가 칼로 %d의 데미지를 입힙니다.\n",damage);

    }
    void 무기스킬사용(){
        System.out.printf("홍길동이/가 연속베기 스킬을 사용합니다. 2배(%d)의 피해를 입힙니다.\n",2*damage);

    }

}

class 활 extends 무기 {
    int damage= 10;
    void 작동1(){
        System.out.printf("홍길동이/가 활로 %d의 데미지를 입힙니다.\n",damage);
    }
    void 무기스킬사용(){
        System.out.printf("홍길동이/가 불화살 스킬을 사용합니다. 1.5배(15)의 피해를 입힙니다.\n",damage*1.5);

    }

}
