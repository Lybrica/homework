package com.company.task10;

public class Main10 {
    public static void main(String[] args) {
        int min = 1;
        int max = 100000;
        int[] random_ints = new int[100_000];

        for (int i = 0; i < 100000; i++) {
            random_ints[i] = (int) (Math.random() * (max - min + 1) + min);
        }

        Stopwatch stopwatch = new Stopwatch();
        sort(random_ints);
        stopwatch.stop();
        System.out.println("Elapsed time(ms): " + stopwatch.getElapsedTime() + ", which is about " +
                stopwatch.getElapsedTimeInSecs() + " seconds.");

        //for (int i : random_ints) System.out.println(random_ints[i]);
    }

    static void sort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
