package day6.m12;

public class m12 {
    public static void main(String[] args) {


        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        a청둥오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        a흰오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        a고무오리.헤엄치다();
        //출력 : 오리가 날개로 날아갑니다.


        // 상속만으로 코드 중복을 완전히 해소할 수 없었다.
        // 코드 중복을 해소하기 위해서 상속을 사용하는 건 본질 X
        // 계층 구조를 표현 가능

        아수라오리 a아수라오리 = new 아수라오리();
        a아수라오리.a날개.날다();
        a아수라오리.a오리발.헤엄치다();


    }
}

class 오리 {

    public void 날다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }

    public void 헤엄치다() {
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }



}
class 청둥오리 extends 오리 {
}

class 흰오리 extends 오리 {
}

class 고무오리 extends 오리 {


    // 메서드 재정의(오버라이딩)
    public void 날다() {
        System.out.println("저는 날 수 없어요.. ㅠ");
    }

    public void 헤엄치다() {
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}

class 고무2오리 extends 고무오리 {


}

class 아수라오리 {
    날개 a날개 = new 날개();
    오리발 a오리발 =new 오리발();




}
class 날개{
    public void 날다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
    public void 날다2() {
        System.out.println("저는 날 수 없어요.. ㅠ");
    }



}
class 오리발{
    public void 헤엄치다() {
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }
    public void 헤엄치다2() {
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }

}

