package Testdrive;

public class Listing2_19 {
    public static void main(String[] args) {
        int nmax = 25;
        for (int n = 0; n < nmax; n++) {
            if ((n * n) >= nmax) break;
            System.out.println(n);
        }
    }
}
