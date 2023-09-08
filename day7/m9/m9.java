package day7.m9;

// 3개의 자료형을 저장하기 위해 3개의 class를 만들었습니다. 그러나 저장소의 기능이 다 동일하므로 하나의 class만 만들어 3 자료형을 모두 저장하고 싶습니다. 가능하게 구현해주세요.

public class m9 {
    public static void main(String[] args) {
        Int저장소 a저장소1 = new Int저장소();

        a저장소1.setData(30);
        int a = a저장소1.getData();

        System.out.println(a);

        Double저장소 a저장소2 = new Double저장소();

        a저장소2.setData(5.5);
        double b = a저장소2.getData();

        System.out.println(b);


        사과저장소 a저장소3 = new 사과저장소();

        a저장소3.setData(new 사과());
        사과 c = a저장소3.getData();

        System.out.println(c);
    }
}

class Int저장소 {
    private Object data;

    int getData() {
        return (int)data;
    }

    void setData(Object inputedData) {
        this.data = inputedData;
    }
}

class Double저장소 {
    private Object data;

    double getData() {
        return (double)data;
    }

    void setData(Object inputedData) {
        this.data = inputedData;
    }
}

class 사과 {
}

class 사과저장소 {
    private Object data;

    사과 getData() {
        return (사과)data;
    }

    void setData(Object inputedData) {
        this.data = inputedData;
    }
}