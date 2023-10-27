package LabAssignment2;

public class JosephusProblem {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int index = 0;
        int count = 0;
        int[] result = new int[n];
        while (count < n) {
            for (int i = 0; i < k; i++) {
                if (arr[index] != 0) {
                    index++;
                    if (index == n) {
                        index = 0;
                    }
                } else {
                    index++;
                    if (index == n) {
                        index = 0;
                    }
                    i--;
                }
            }
            result[count] = arr[index];
            arr[index] = 0;
            count++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
