package day6.m3;

public class m3 {
    public static void main(String[] args) {
        new 사람().걷다();

        System.out.println(new 사람().a왼팔.길이 + "cm");
        // 출력 : 100cm
    }
}
class 사람 {
    팔 a왼팔;
    void 걷다() {
        System.out.println("사람 걷는다.");
    }
    public 사람(){
        a왼팔 = new 팔();

    }
}
class 팔 {
    int 길이;
    public 팔(){
        this.길이= 100;
    }

}
