package com.ohgiraffers.section02.demensionalArray;

public class Application {

    public static void main(String[] args) {

        /* 행의 길이가 3, 열의 길이가 4인 정수형 2차원 배열을 선언 및 할당하고,
         * 각 인덱스에 차례대로 1부터 12까지의 정수를 대입한 뒤
         * 그 값을 출력하는 코드를 작성하시오.
         *
         * -- 출력 예시 --
         * 1  2  3  4
         * 5  6  7  8
         * 9 10 11 12
         *
         * 단, 출력물의 줄맞춤은 신경쓰지 말고 풀어보세요
         * */

        int[][] arr;
        arr = new int[3][];
        arr[0] = new int[]{1, 2, 3, 4};
        arr[1] = new int[]{5, 6, 7, 8};
        arr[2] = new int[]{9, 10, 11, 12};

//        arr[0] = new int[4];
//        arr[1] = new int[4];
//        arr[2] = new int[4];

        for (int i = 0; i < arr[0].length; i++) {
            System.out.print(arr[0][i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr[1].length; i++) {
            System.out.print(arr[1][i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr[2].length; i++) {
            System.out.print(arr[2][i] + " ");
        }
        System.out.println();


        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
