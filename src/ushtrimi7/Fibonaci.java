package ushtrimi7;
public class Fibonaci {
    public static int llogaritjaEFibonacit(int index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            int numer1 = 0;
            int numer2 = 1;
            for (int i = 0; i < index - 1; i++) {
                int shumaEDyNumraveParaardhes = numer1 + numer2;
                numer1 = numer2;
                numer2 = shumaEDyNumraveParaardhes;
            }
            return numer2;
        }
    }
}
