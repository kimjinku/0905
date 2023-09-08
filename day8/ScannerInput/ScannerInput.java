package day8.ScannerInput;

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {

        // 입력 값을 읽어서 처리해주는 객체
        Scanner scan = new Scanner(System.in);

        // 입력 숫자 하나를 읽어오기
        int num = scan.nextInt(); // 입력된 숫자를 하나 읽어옴.
        System.out.println("당신이 입력한 값은 : " + num);

    }
}

