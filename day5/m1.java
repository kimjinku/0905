package day5;

public class m1 {
    public static void test(String param) {
        System.out.println(param);
        int a = 10;
    }
    public static void main(String[] args) {
        int num =10;
        String str = "hello";
        double d = 3.14;
        test(str);
        System.out.println(num);

        Person p1; //P1은 무슨의미 ?? 사람이 한명 있다. (X) P1은 null이다

        p1 = new Person(); //사람 한명 생성해서 사람 리모컨을 p1에 저장


        Person p2 = new Person();


        int num1 = 10;
        int num2 = num1;

        num2 = 20;
        p1 = p2; //p1이 p2를 가르킨다


    }
}
