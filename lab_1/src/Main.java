import static java.lang.Math.*;

public class Main {
    public static void main(String args[]) {
        int maxInt = 18, minInt = 4, lenD = (maxInt - minInt) / 2 + 1, lenX = 19;
        int gSizeI = 8, gSizeJ = 19;

        int[] d;
        d = new int[lenD];
        float[] x;
        x = new float[lenX];

        for (int i1 = 0; i1 < lenD; i1++) {
            d[i1] = minInt + i1 * 2;
        }
        for (int i2 = 0; i2 < x.length; i2++) {
            x[i2] = (float)(random() * 18.00000f - 14.00000f);
        }

        double[][] g = new double[gSizeI][gSizeJ];
        for (int i = 0; i < gSizeI; i++) {
            for (int j = 0; j < gSizeJ; j++) {
                if (d[i] == 10)
                    g[i][j] = pow(2 / pow(pow(2 * x[j], 2), (1 - x[j] / 0.25) / 2), 2);
                else if (d[i] == 4 || d[i] == 12 || d[i] == 14 || d[i] == 16)
                    g[i][j] = 2 * pow(x[j], (x[j] + 1) / 0.25) / 1 / 2;
                else
                    g[i][j] = log(pow(E, pow(pow(E, pow(x[j], (1 - x[j]) / x[j])), 2 * atan(pow(E, -abs(x[j]))))));
            }
        }

        for (int i = 0; i < gSizeI; i++) {
            for (int j = 0; j < gSizeJ; j++) {
                System.out.printf("%.4f", g[i][j]);
                System.out.println(" ");
            }
            System.out.println();
        }
    }
}