package zadatak3_random_matrix;

import java.util.Random;

public class zadatak3verzija3 {

    public static void main(String[] args) {
        Random rand = new Random();
        int [][]matrica= new int[5][5];
        int jnovi = 0;
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i>j-1)
                {
                    jnovi = 0;
                }
                else
                {
                    jnovi = rand.nextInt(9)+1;
                }
                matrica[i][j] = jnovi;
                suma = suma + jnovi;
            }
        }
        stampaMatrice(matrica);
        System.out.println(suma);

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
