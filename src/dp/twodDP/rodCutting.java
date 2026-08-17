package dp.twodDP;

import java.util.Arrays;
import java.util.Scanner;

public class rodCutting {

    public static int solve(int[] arr, int i, int length, int[][] dp) {

        if(i == 0 || length == 0) {
            return 0;
        }

        if(dp[i][length] != -1) {
            return dp[i][length];
        }

        int nottake = solve(arr, i-1, length, dp);

        int take = 0;

        if(i <= length) {
            take = arr[i-1] + solve(arr, i, length-i, dp);
        }

        return dp[i][length] = Math.max(take, nottake);
    }

    public static int rod(int[] arr, int n) {

        int[][] dp = new int[n+1][n+1];

        for(int[] rows : dp) {
            Arrays.fill(rows, -1);
        }

        return solve(arr, n, n, dp);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = rod(arr, n);

        System.out.println(ans);
    }
}