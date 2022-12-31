package com.lpa.exercise;

    /*
    Sort 3D Array Using Bubble Sort, Selection Sort & Insertion Sort
    Author @LwinPhyoAung
     */

public class Sort3DArray {

    private Sort3DArray(){

    }

    public static void BubbleSort(Comparable[][][] arr){

        int N = arr.length;
        for (int i = 0; i<N; i++){

            int X = arr[i].length;
            for (int j = 0; j<X; j++){

                int Z = arr[i][j].length;
                for (int k = 0; k<Z-1; k++){

                    for (int r = 0; r<Z-1; r++){

                        if (isLess(arr[i][j][r+1], arr[i][j][r])){
                            swap(arr,i,j,r,r+1);
                        }

                    }

                }

            }

        }

    }

    public static void SelectionSort(Comparable[][][] arr){

        int N = arr.length;
        for (int i = 0; i<N; i++){

            int X = arr[i].length;
            for (int j = 0; j<X; j++) {

                int Z = arr[i][j].length;
                for (int k = 0; k < Z; k++) {

                    int min = k;
                    for (int r = k + 1; r < Z; r++) {

                        if (isLess(arr[i][j][r], arr[i][j][min])) {
                            min = r;
                        }

                    }

                    swap(arr, i, j, k, min);

                }

            }

        }

    }

    public static void InsertionSort(Comparable[][][] arr){

        int N = arr.length;
        for (int i = 0; i<N; i++){

            int X = arr[i].length;
            for (int j = 0; j<X; j++){

                int Y = arr[i][j].length;
                for (int k = 1; k<Y; k++){

                    for (int r = k; r>0; r--){

                        if (isLess(arr[i][j][r], arr[i][j][r-1])){
                            swap(arr, i, j, r, r-1);
                        }

                    }

                }

            }

        }

    }

    private static void swap(Comparable[][][] arr, int aRow, int bRow, int aColumn, int bColumn){
        Comparable temp = arr[aRow][bRow][aColumn];
        arr[aRow][bRow][aColumn] = arr[aRow][bRow][bColumn];
        arr[aRow][bRow][bColumn] = temp;
    }

    private static boolean isLess(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }

    public static void print3DArr(Comparable[][][] arr){

        int N = arr.length;
        for (int i = 0; i<N; i++){
            int X = arr[i].length;
            for (int j = 0; j<X; j++){
                int Y = arr[i][j].length;
                System.out.print("[");
                for (int k = 0; k<Y; k++){
                    System.out.print(" " + arr[i][j][k] + " ");
                }
                System.out.print("]");
            }
            System.out.println();
        }

    }

}
