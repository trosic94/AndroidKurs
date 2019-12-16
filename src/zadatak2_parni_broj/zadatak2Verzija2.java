package zadatak2_parni_broj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class zadatak2Verzija2 {
    public static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader citac = new BufferedReader(new InputStreamReader(System.in));
        Scanner myObj = new Scanner(System.in);
        int userName = myObj.nextInt();

        //n = Integer.parseInt(citac2);
        int zbirParnih = 0;
        for (int i = 0; i <= userName; i++) {
            if(i%2 == 0)
            {
               zbirParnih = zbirParnih + i;
            }
        }
        System.out.println(zbirParnih);
    }
}
