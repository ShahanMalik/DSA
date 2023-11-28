package LabAssignment3;

public class Factorilal {
    static int val1 = 0;
    static int val2 = 1;
    static int limit = 5;
    static int sum = 0;

    static void fac() {
        System.out.print(val1 + " ");
        for (int a = 0; a < limit; a++) {
            sum = val1 + val2;
            val1 = val2;
            val2 = sum;
            System.out.print(val1 + " ");
            if (a >= limit) {
                fac();
            }
        }
    }

    public static void main(String[] args) {
        fac();
    }
}
