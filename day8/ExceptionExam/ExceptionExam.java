package day8.ExceptionExam;

public class ExceptionExam {
    public static void main(String[] args) {

        //예외처리
        //컴파일 타임 -> 컴파일 에러
        //문법 오류
        //런타임(프로그램 실행중) - > 런타임 에러
        //에러 -> 시스템, 네트워크, 머신
        //예외 -> 프로그래머의 실수

        try { //예외가 발생할만한 지점을 try로 감싼다.
            int[] arr = new int[3];
            arr[10] = 10;

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열이 제대로 안된거같은데?");
        }

    }
}
