package day8.m8;

// 이름과 나이를 입력값으로 받아 자기소개를 해주세요.

import java.util.Scanner;

public class m8 {
    public static void main(String[] args) {
        // 입력 받을 때 nextLine으로 통일
        Scanner scan = new Scanner(System.in);

        // 문자를 -> 숫자로 변환
        // 관련 없는 타입끼리는 형변환
        // Integer 래퍼클래스 사용
        int num = Integer.parseInt("10"); // 문자로 된 숫자를 실제 숫자형으로 변환


        System.out.println("나이를 입력해주세요:");
        int age = Integer.parseInt(scan.nextLine());

        System.out.println("이름을 입력해주세요:");
        String name = scan.nextLine();

        System.out.printf("안녕하세요 %d세 %s입니다.\n", age, name);
        // 이름을 입력해주세요 : 홍길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍길동입니다.

    }
}
