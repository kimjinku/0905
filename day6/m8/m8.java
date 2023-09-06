package day6.m8;
// 문제 : 아래와 같이 출력되도록 해보세요.

public class m8 {
    public static void main(String[] args) {
        new 사람();
        // 출력 : 사람이 태어났습니다.

        new 사람(10);
        // 출력 : 태어나서부터 10살인 사람이 태어났습니다.

        new 사람(20);
        // 출력 : 태어나서부터 20살인 사람이 태어났습니다.
    }
}
class 사람{

    사람(){
        System.out.printf("태어나서부터 %d인 사람이 태어났습니다.\n");

    }
    사람(int n){
        System.out.printf("태어나서부터 %d인 사람이 태어났습니다.\n",n);

    }
}
