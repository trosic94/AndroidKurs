package zadatak3_random_matrix;

import java.util.Random;

public class zadatak3verzija2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [][]matrica= new int[5][5];
        int proizvod = 1;
        int low = 1;
        int high = 10;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrica[i][j] = rand.nextInt(9)+1;
            }
            System.out.println(matrica[i][i]);
            proizvod = proizvod * matrica[i][i];
            System.out.println(proizvod);

        }
        stampaMatrice(matrica);

      //  System.out.println(proizvod);
    }
    private static void stampaMatrice(int[][] matrica) {
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[0].length; j++) {
                System.out.print(matrica[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
