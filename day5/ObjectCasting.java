package day5;

public class ObjectCasting {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        //d1 = c1; // 만약 허용 되면? d1은 Cat을 가리키게 되고 아래에서 d1.bark() 코드로 인해 Cat에게 bark를 시키는 꼴이 된다.

        d1.bark(); // d1 리모컨에 연결된 객체(Dog)에게 명령
        c1.meow(); // c1 리모컨에 연결된 객체(Cat)에게 명령

        Animal a1 = new Animal();

        Cat c2 = new Cat();

//        a1 = c2; // Cat이 Animal 변수 대입(X) Cat이 Animal로 모습을 바꿨다.

        a1 = c2; // 하위(자식)클래스가 상위(부모)클래스로 모습을 바꾸는 건 안전.
        // Cat은 Animal을 확장해서 만들었기 때문에 Cat의 개성을 포기하면 Animal과 생김새를 완전히 일치시킬 수 있다.

        a1.move(); // 움직인다 -> a1이 가리키는게 Cat 객체든, Animal 객체든 실행에 문제가 없다.
        a1.breathe(); // 숨쉬다.
        c2.move(); // 움직인다.

        // 반대로
        a1 = d1; // Animal 변수에 Dog가 형변환돼서 대입

        c2 = (Cat)a1; // 자동형변환 X, 수동형변환은 가능.
        // a1 변수에는 Dog와 Cat 모두 저장될 수 있으므로 무작정 Cat이라고 단정지을 수 없다. 때문에 자바가 형변환 해주지 않는다.
        // a1에 Cat이 들어있는게 확실하다면 개발자가 수동 형변환으로 할 수는 있다.

        c2.meow(); // a1에 Dog가 들어있다면 여기서 에러가 날 것이다.

        // 객체는 자식 > 부모 형변환 안전.
        // 부모 > 자식은 위험. 수동형변환
        // 상속관계 없으면 형변환 X
        // 형변환
        int num = 10;
        double num2 = 3.14;

        // num = num2; // 에러 -> int 변수인 num에 double을 대입하려고 해서.
        // 자바의 변수는 타입이 다른 값을 저장할 수 없다.
//        num2 = num; // int 값이 double변수인 num2에 저장됐다(X)
        // num이 num2에 저장되기 위해서 double로 모습을 바꿨다.

        // 형변환 원칙
        // 안전한 형변환은 자바가 자동으로 해줌(자동 형변환)
        // 위험한 형변환은 안해줌. 직접 해야함(수동 형변환)
        num = (int)num2; // 문제 -> 생길 수도, 안생길 수도(실수를 정수 변수에 넣어야 하기 때문에 소수점이 유실된다.)

        System.out.println(num); // 원래 3.14에서 데이터가 바뀌게 됨(위험)




    }
}

