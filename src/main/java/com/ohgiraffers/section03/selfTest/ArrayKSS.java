package com.ohgiraffers.section03.selfTest;

public class ArrayKSS {

    public static void main(String[] args) {
        /* 1부터 45까지의 정수 중 임의의 서로 다른 숫자 6개가 '오름차순'으로 출력되도록 코드를 작성하세요

                       출력 예시
        생성된 숫자는 5, 7, 10, 14, 15, 20입니다.
         */

        ArrayKSS randN = new ArrayKSS();
        int[] num = new int[6];

        for (int i = 0; i < num.length; i++) {
            num[i] = randN.randomN();
        }

        for (int i = 1; i < num.length; i++) {
            for (int j = 0; j < i; j++) {

                if(num[i] < num[j]) {
                    int tmp;
                    tmp = num[i];
                    num[i] =num[j];
                    num[j] = tmp;
                }
            }
        }
        System.out.print("생성된 숫자는 ");
        for (int i = 0; i < num.length; i++ ) {
            System.out.print(num[i] + " ");
        }
        System.out.println("입니다.");
    }
    public int randomN () {
        int num = (int) (Math.random() * 45 + 1);
        return num;
    }

}
