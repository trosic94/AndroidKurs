package zadatak2_parni_broj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zadatak2 {
    static int n;
    public static void main(String[] args) throws IOException {

        BufferedReader citac = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(citac.readLine());
        int zbir = 0;
        for (int i = 0; i < n; i++) {

            zbir = zbir + i;
        }
        System.out.println(zbir);

    }
}
