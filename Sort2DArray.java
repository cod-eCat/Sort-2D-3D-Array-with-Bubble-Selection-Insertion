package com.lpa.exercise;

    /*
    Sort 2D Array Using Bubble Sort, Selection Sort & Insertion Sort
    Author @LwinPhyoAung
     */

public class Sort2DArray {

    private Sort2DArray(){

    }

    public static void BubbleSort(Comparable[][] arr){

        int N = arr.length;
        for (int i = 0; i<N; i++){

            int X = arr[i].length;
            for (int j = 0; j<X; j++){

                for (int k = 0; k<X-1; k++){

                    if (isLess(arr[i][k+1], arr[i][k])){
                        swap(arr, i, k+1, k);
                    }

                }

            }

        }

    }

    public static void SelectionSort(Comparable[][] arr){

        int N = arr.length;
        for (int i = 0; i<N; i++){

            int X = arr[i].length;
            for (int j = 0; j<X; j++){

                int min = j;
                for (int k = j+1; k<X; k++){

                    if ( isLess(arr[i][k], arr[i][min]) ){
                        min = k;
                    }

                }

                swap(arr, i, j, min);
            }

        }

    }

    public static void InsertionSort(Comparable[][] arr){

        int N = arr.length;
        for (int i = 0; i<N; i++){

            for (int j = 1; j<arr[i].length; j++){

                for (int k = j; k>0; k--){

                    if (isLess(arr[i][k], arr[i][k-1])){
                        swap(arr, i, k, k-1);
                    }

                }

            }

        }

    }

    private static void swap(Comparable[][] arr, int Row, int aColumn, int bColumn){
        Comparable temp = arr[Row][aColumn];
        arr[Row][aColumn] = arr[Row][bColumn];
        arr[Row][bColumn] = temp;
    }

    private static boolean isLess(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }

    public static void print2DArr(Comparable[][] arr){

        int N = arr.length;
        for (int i = 0; i<N; i++){
            int X = arr[i].length;
            System.out.print("[");
            for (int j = 0; j<X; j++){
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }

    }

}
