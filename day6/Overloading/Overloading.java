package day6.Overloading;

public class Overloading {
    public static void main(String[] args) {
        Caculator c1 = new Caculator();

        int result = c1.plus(1, 2);
        System.out.println(result);

        int result2 = c1.plus(1, 2, 3);
        System.out.println(result2);
    }
}

class Caculator {

    // 메서드 오버로딩 -> 같은 이름으로 메서드를 여러개 만드는 것. (조건, 매개변수의 생김새 달라야 한다.)
    int plus(int num1, int num2) {
        return num1 + num2;
    }

    double plus(double num1, double num2) {
        return num1 + num2;
    }

    int plus(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    int plus(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
}
