package day8.m1;

public class m1 {
    public static void main(String[] args) {
        저장소<Integer> a저장소1 = new 저장소<>();

        a저장소1.setData(50);
        int a = a저장소1.getData();

        System.out.println(a);

        저장소<Double> a저장소2 = new 저장소<>();

        a저장소2.setData(5.5);
        double b = a저장소2.getData();

        System.out.println(b);


        저장소<사과> a저장소3 = new 저장소<>();

        a저장소3.setData(new 사과());
        사과 c = a저장소3.getData();

        System.out.println(c);
    }
}

class 저장소<T> {
    Object data;

    T getData() {
        return (T)data;
    }

    void setData(T inputedData) {
        this.data = inputedData;
    }

}


class 사과 {
}
