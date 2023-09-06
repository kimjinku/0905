package day6.coustructor.exam2;
public class Constructor2 {
    public static void main(String[] args) {

        // 객체를 만들때 반드시 실행되는 메서드 -> 생성자
        // Person p3 = new Person(); // 여기서 Person()이 사실 메서드(생성자)

        // 생성자 사용 이유
        // 1. 편해짐
        // 2. 코드가 줄어듦
        // 3. 초기화 안할 수가 없음.

        Person p1 = new Person(20, "홍길동", new Car());
        p1.drive();
        p1.introduce();

        Person p2 = new Person(33, "이순신", new Car());
        p2.drive();
        p2.introduce();
    }
}

class Person {
    int age; // 0
    String name; // null

    Car myCar; // null

    // 생성자
    // 리턴타입 X, 메서드명은 클래스명과 동일
    public Person(int age, String name, Car myCar) {
        System.out.println("사람 한명 생성");
        this.age = age; // 함수는 자기 거를 우선 쓰기 때문에 인스턴스 변수를 가리키기 위해 this를 붙인다.
        this.name = name;
        this.myCar = myCar;
    }


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