package day7.m8;
// 3개의 자료형을 저장하기 위해 3개의 class를 만들었습니다.
// 그러나 저장소의 기능이 다 동일하므로 하나의 class만 만들어 3 자료형을 모두 저장하고 싶습니다. 가능하게 구현해주세요.

public class m8 {
    public static void main(String[] args) {
        저장소 a저장소1 = new 저장소();

        a저장소1.setData(30);
        int idata = (int)a저장소1.getData();
        System.out.println(idata);
        a저장소1.setData(5.5);
        double ddata = (double)a저장소1.getData();
        System.out.println(ddata);
        a저장소1.setData(new 사과());
        사과 cdata = (사과)a저장소1.getData();
        System.out.println(cdata);


    }
}

class 저장소{
    private Object data;
    public void setData(Object data){
        this.data = data;
    }

    public Object getData(){
        return this.data;

    }
}



class 사과 {
}


