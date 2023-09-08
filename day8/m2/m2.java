package day8.m2;

public class m2 {
    public static void main(String[] args) {
        Arraylist<Integer> a저장소 = new Arraylist<>();

        a저장소.setData(10);
        a저장소.setData(20);
        a저장소.setData(30);

        int num = a저장소.getData(1);
        System.out.println(num);
        num = a저장소.getData(0);
        System.out.println(num);

        //자바가 제공하는 저장소 클래스 -> ArrayList

        //추가 - add()
        //삭제 - remove()
        //수정 - set()
        //조회 - get()
        //사이즈 - size()




    }
}

class Arraylist<T> {
    private Object[] datas;
    int lastIdx;

    Arraylist() {
        datas = new Object[3];
        lastIdx = 0;
    }

    public void setData(T data) {
        this.datas[lastIdx] = data;
        lastIdx++;
    }

    public T getData(int idx) {
        return (T)datas[idx];
    }
}

//자바가 제공하는 저장소 클래스 -> ArrayList

