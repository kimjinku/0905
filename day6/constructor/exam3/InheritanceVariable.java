package day6.constructor.exam3;

public class InheritanceVariable {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.move();


        Cat c1 = new Cat();
        c1.meow();
        c1.move();

    }
}
class Animal {
    String name;

    Animal() {
        this.name = "동물";
    }
    public void move() {
        System.out.printf("%s가 움직이다.\n", this.name);
    }
}

class Dog extends Animal {
//    String name = "맥스"; -> 부모가 물려준 변수와 똑같은 변수를 하나 더 만들게 되고, name이 2개가 된다.

    Dog() {
        this.name = "맥스"; // 자신(Dog)의 name에 '맥스'를 대입한다.
    }
    public void bark() {
        System.out.printf("%s가 멍멍\n", this.name);
    }

    // 부모(Animal)에게 상속 받는 move 메서드에서 사용하는 name은 부모(Animal)의 name이다.
    // 따라서 맥스가 움직이다로 나오지 않고 동물이 움직이다로 나온다.

    // 부모 메서드에서 사용된 변수를 유지하려면 해당 변수를 같이 상속받아야 한다.
}

class Cat extends Animal {

    Cat() {
        this.name = "아리";
    }

    public void meow() {
        System.out.printf("%s가 야옹\n", this.name);
    }
}

