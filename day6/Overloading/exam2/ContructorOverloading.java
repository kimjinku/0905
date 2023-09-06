package day6.Overloading.exam2;

public class ContructorOverloading {
    public static void main(String[] args) {
        Person p1 = new Person(20, "홍길동");
        p1.introduce();

        Person p2 = new Person();

        p2.age = 30;
        p2.name = "이순신";

        Person p3 = new Person(30);

        p3.name = "유관순";


    }
}

class Person {
    int age;
    String name;

    Person() {

    }

    Person(int age) {
        this.age = age;
    }

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void introduce() {
        System.out.printf("%d살 %s입니다.\n", this.age, this.name);
    }
}
