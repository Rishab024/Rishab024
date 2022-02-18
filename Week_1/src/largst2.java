
import java.util.*;

public class largst2 {
    public static int fndmax(int[] a) {
        int temp;
        int b;
        b= a.length;
        for (int i = 0; i < b; i++) {
            for (int j = i + 1; j < b; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[b - 2];

    }
}

