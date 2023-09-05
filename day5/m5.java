package day5;

public class m5 {
    public static void main(String[] args) {
        무기 a무기 = new 칼();
        a무기.공격();
        // 출력 : 칼로 공격합니다.

        a무기 = new 활();
        a무기.공격();
        // 출력 : 활로 공격합니다.

    }



}
class 무기{


    public void 공격(){

    }




}
class 칼 extends 무기{
    public void 공격(){
        System.out.println("칼로 공격합니다");
    }



}

class 활 extends 무기{
    public void 공격(){
        System.out.println("활로 공격합니다");
    }







}
