package day8.m7;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Scanner를 이용해 입력값을 받아
        // 구구단을 원하는 단이 나오게 해주세요.

        //예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)

        // 4단 출력.

        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        for(int i=1;i<=9;i++){
            System.out.printf("%d * %d = %d\n",a,i,a*i);

        }

    }
}