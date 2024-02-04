package com.ohgiraffers.section03.selfTest;

import java.util.Scanner;

public class ArrayKMS {

    public static void main(String[] args) {

        /* 정수를 입력받아 다음과 같은 N * N 배열 구조를 출력해보자.*/
        /* 출력예시
        *  i) 입력이 N이 3 인 경우
        *     --- My 달팽이 ---
        *     1 2 3
        *     8 9 4
        *     7 6 5
        * ii) 입력이 4 * 5 인 경우
        *     --- My 달팽이 ---
        *     1 2 3 4
        *     12 13 14 5
        *     11 16 15 6
        *     10 9 8 7
        * */

        ArrayKMS snail = new ArrayKMS();
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요 : ");
        int N = sc.nextInt();
        int num = 1;    // 배열에 저장될 값
        int row = 0;    // 행
        int column = -1; // 열
        int control = 1;    // 행과 열을 도와주는 수
        int count = N;  // 한 줄마다 입력될 값의 수
        snail.snailD(N,num,row,column,control,count);




    }
    public void snailD (int input, int num, int row, int column, int control, int count) {

        int[][] snail = new int[input][input];

        for (int i = 0; i < input; i--) {
            for (int j = 0; j < count; j++) {

                column += control;
                snail[row][column] = num;

                num++;
            }
            count--;
            for (int k = 0; k < count; k++) {

                row += control;
                snail[row][column] = num;

                num++;
            }
            count *= -1;
        }

        // 결과 값 출력
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.print(snail[i][j] + " ");
            }
            System.out.println();
        }

    }
}
