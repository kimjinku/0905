package day6;

public class m1 {

    // 다음 클래스들을 생성자를 이용해 간단하게 값을 세팅해주세요.

    public static void main(String[] args) {


        Person p1 = new Person(27,"홍길동"); // 사람이 태어납니다.
        p1.age = 27;
        p1.name = "홍길동";

        Person p2 = new Person(25,"홍길순"); // 사람이 태어납니다.
        p2.age = 25;
        p2.name = "홍길순";

        p1.introduce(); // 안녕하세요 27살 홍길동입니다.
        p2.introduce(); // 안녕하세요 25살 홍길순입니다.
//
        Car c1 = new Car("소나타","하얀색",100); // 자동차가 만들어집니다.
        c1.model = "소나타";
        c1.color = "하얀색";
        c1.speed = 100;

        Car c2 = new Car("모닝","검정색",70); // 자동차가 만들어집니다.
        c1.model = "모닝";
        c1.color = "검정색";
        c1.speed = 70;

        c1.drive(); // 하얀색 소나타이/가 100km로 달립니다.
        c2.drive(); // 검정색 모닝이/가 70km로 달립니다.


        Cat cat1 = new Cat("아리",4,"러시안블루"); // 고양이가 태어납니다.
        cat1.name = "아리";
        cat1.age = 4;
        cat1.kind = "러시안블루";

        Cat cat2 = new Cat("망고",6,"샴"); // 고양이가 태어납니다.
        cat2.name = "망고";
        cat2.age = 6;
        cat2.kind = "샴";

        cat1.meow(); // 4살 러시안블루 고양이 아리가 야옹하고 웁니다.
        cat2.meow(); // 6살 샴 고양이 망고가 야옹하고 웁니다.


        Warrior w1 = new Warrior("이순신",20,10); // 전사가 태어납니다.
        w1.name = "이순신";
        w1.attack = 20;
        w1.defense = 10;

        Warrior w2 = new Warrior("강감찬",15,15); // 전사가 태어납니다.
        w1.name = "강감찬";
        w1.attack = 15;
        w1.defense = 15;

        w1.status(); // 이름 : 이순신, 공격력 : 20, 방어력 : 10
        w2.status(); // 이름 : 강감찬, 공격력 : 15, 방어력 : 15

        w1.attack(); // 이순신이 20의 데미지를 입힙민다.
        w2.attack(); // 강감찬이 15의 데미지를 입힙민다.

        w1.defense(); // 이순신이 10 데미지를 방어합니다.
        w2.defense(); // 강감찬이 15 데미지를 방어합니다.

    }
}

class Person{
    int age;
    String name;

    public void introduce() {
        System.out.printf("안녕하세요 %d살 %s입니다.\n", age, name);
    }
    public Person(int age,String name){
        System.out.println("사람이 태어납니다");
        this.age=age;
        this.name = name;
    }
}

class Car {
    String model;
    String color;
    int speed;

    public void drive() {
        System.out.printf("%s %s이/가 %dkm로 달립니다.\n", color, model, speed);
    }
    public Car(String model,String color,int speed){
        this.model=model;
        this.color=color;
        this.speed=speed;

    }
}

class Cat {
    String name;
    String kind;
    int age;

    public void meow() {
        System.out.printf(" %d살 %s 고양이 %s가 야옹하고 웁니다.\n", age, kind, name);
    }
    public Cat(String name,int age,String kind){
        this.name = name;
        this.age = age;
        this.kind = kind;


    }
}


class Warrior {

    // 상태
    String name;
    int attack;
    int defense;

    // 동작
    public void status() {
        System.out.printf("이름 : %s, 공격력 : %d, 방어력 : %d \n", name, attack, defense);
    }
    public void attack() {
        System.out.printf("%s이 %d의 데미지를 입힙니다.\n", name, attack);
    }
    public void defense() {
        System.out.printf("%s이 %d 데미지를 방어합니다..\n", name, defense);
    }
    public Warrior(String name,int attack,int defense){
        this.name = name;
        this.attack =attack;
        this.defense=defense;

    }
}



