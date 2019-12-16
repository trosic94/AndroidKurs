package zadatak2_parni_broj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class zadatak2Verzija3 {
    public static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader citac = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(citac.readLine());
        ArrayList zbirParni = new ArrayList();
        for (int i = -n; i <= n; i++) {
            zbirParni.add(i);
        }
        System.out.println(zbirParni);
    }
}
