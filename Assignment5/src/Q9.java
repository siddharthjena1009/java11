import java.io.*;
   public class Q9 {
   
    static double Series(int n)
    {
        int i;
        double sums = 0.0, ser;
        for (i = 1; i <= n; ++i) {
            ser = 1 / Math.pow(i, i);
            sums += ser;
        }
        return sums;
    }
   
    public static void main(String[] args)
    {
        int n = 3;
        double res = Series(n);
        res = Math.round(res * 100000.0) / 100000.0;
        System.out.println(res);
    }
}