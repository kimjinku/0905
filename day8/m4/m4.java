package day8.m4;

import java.util.ArrayList;

public class m4 {
    public static void main(String[] args) {

        사람 사람1 = new 사람(24, "홍길동");
        사람 사람2 = new 사람(30, "이순신");
        사람 사람3 = new 사람(41, "을지문덕");
        사람 사람4 = new 사람(32, "황진이");

        // 1. 네 사람을 ArrayList에 저장
        // 2. 네 사람에게 자기소개 시키기
        // 3. 30대인 사람에게만 자기소개 시키기
        ArrayList<사람> arr = new ArrayList<>();
        arr.add(사람1);
        arr.add(사람2);
        arr.add(사람3);
        arr.add(사람4);



        for(int i=0;i<= arr.size()-1;i++){

            arr.get(i).introduce();
        }
        for(int i=0;i<= arr.size()-1;i++){
            if(arr.get(i).getAge()>=30 && arr.get(i).getAge()<40){
                arr.get(i).introduce();

            }
        }








    }
}

class 사람 {
    private int age;
    private String name;

    사람(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void introduce() {
        System.out.printf("%d살 %s입니다.\n", age, name);
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }


}
