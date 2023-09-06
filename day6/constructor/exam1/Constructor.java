package day6.constructor.exam1;

// 생성자
public class Constructor {
    public static void main(String[] args) {
        Person p1 = new Person();

        // 객체의 함수는 데이터를 이용해서 기능을 수행.
        // 데이터가 있어야 함수가 올바르게 작동한다.
        // p1.introduce(); -> 초기화 과정 없이 사용해서 이상하게 나옴
        // p1.drive(); -> 초기화 과정 없이 사용해서 에러가 남


        // 객체를 세팅하지 않고 바로 사용하면 이상한 결과가 나오거나 에러가 난다.
        // 올바른 데이터 세팅 <---- 반.드.시 필요!!
        // 객체 초기화(initialize)라고 한다.
        p1.age = 20;
        p1.name = "홍길동";
        p1.myCar = new Car();

        p1.introduce();
        p1.drive();

        // 위 초기화 방식은 좀 불편하다.
        // 초기화 조금 더 편하게 개선. -> 메서드로 제작
        p1.init(20, "홍길동", new Car());

        Person p2 = new Person();
        p2.init(30, "이순신", new Car());

        p2.introduce();
        p2.drive();
    }
}

class Person {
    int age; // 0
    String name; // null

    Car myCar; // null

    // 생성자
    // 리턴타입 X, 메스드명은 클래스명과 동일
    public void init(int param1, String param2, Car param3) {
        age = param1;
        name = param2;
        myCar = param3;
    }

    public void introduce() {
        System.out.printf("안녕하세요 저는 %d살 %s입니다.\n", age, name);
    }

    public void drive() {
        myCar.use();
    }
}

class Car {
    public void use() {
        System.out.println("자동차를 타고 나갑니다.");
    }
}