package src.secao10_Memória_Arrays_Listas.exMatriz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
               arr[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == x){
                    System.out.printf("position %d,%d:\n",i, j);
                    if(i - 1 >= 0){
                        System.out.printf("Up %d:\n", arr[i-1][j]);
                    }
                    if(i + 1 < m){
                        System.out.printf("Down %d:\n", arr[i+1][j]);
                    }
                    if(j - 1 >= 0){
                        System.out.printf("left %d:\n",arr[i][j-1]);
                    }
                    if(j + 1 < n){
                        System.out.printf("Right %d:\n",arr[i][j+1]);
                    }
                }

            }
        }
    }
}
