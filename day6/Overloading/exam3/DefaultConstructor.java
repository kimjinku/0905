package day6.Overloading.exam3;

public class DefaultConstructor {
    public static void main(String[] args) {
        Person p1 = new Person(); // 매개변수가 없는 생성자 -> 디폴트 생성자
    }
}

class Person {
    int age;

    // 아래 생성자를 만들게 되면 디폴트 생성자는 생성되지 않습니다.
//    Person(int age) {
//
//    }

    // 디폴트 생성자는 자바 자동으로 만들어준다.
    // 단, 여러분이 직접 생성자를 하나라도 만들면 디폴트 생성자는 자동 생성되지 않는다.
}
