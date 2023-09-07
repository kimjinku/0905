package day7.m7;

//code.oa.gg/java8/970
// 가정 : 우리는 오라클 자바 개발팀에 취업을 했습니다. 우리는 자바 10의 새로운 기능은 `저장소` 클래스를 만들어야 합니다.
// 문제 : `저장` 메서드를 1개로 줄여보세요.

public class m7 {
    public static void main(String[] args) {
        저장소.저장(new 사과());
        저장소.저장(new 사람());
        저장소.저장("안녕"); // "안녕" 은 String 클래스의 객체이다.
        저장소.저장(new String("안녕"));

        // 정수 계열
        byte b = 0; // 1바이트
        char c = 1; // 2바이트
        short s = 2; // 2바이트
        int i = 3; // 4바이트
        long l = 4; // 8바이트

        // 실수 계열
        // 4.1f => float 형 실수를 의미
        float f = 3.14f; // 4바이트
        // 3.141592 => double 형 실수를 의미
        double d = 3.141592; // 8 바이트

        // 논리 계열
        boolean bl = false; // 1/8 바이트, 1비트

        // int 형 변수 i의 값 `3`을 객체화 하는 방법
        Integer iObj = new Integer(i);
        // iObj 리모콘에 연결된 객체에는 3이라는 값이 있습니다.
        // 객체 안에 3이있다고 생각하시면 됩니다.

        저장소.저장(b);
        저장소.저장(s);
        저장소.저장(c);
        저장소.저장(i);
        저장소.저장(l);
        저장소.저장(f);
        저장소.저장(d);
        저장소.저장(bl);


    }
}

class 저장소 {


    static void 저장(Object v) {
        System.out.println("Object 값 : " + v);
    }

}

class 사람 {
}

class 사과 {
}


class Integer {
    int i = 3;

    Integer(int i) {
        this.i = i;


    }
}

