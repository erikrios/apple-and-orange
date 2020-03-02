package com.erikriosetiawan;

import java.util.Scanner;

public class Solution {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int applesLength = apples.length;
        int orangesLength = oranges.length;

        int[] applesDistanceFromTree = new int[applesLength];

        for (int i = 0; i < applesLength; i++)
            applesDistanceFromTree[i] = apples[i] + a;

        int[] orangesDistanceFromTree = new int[orangesLength];

        for (int i = 0; i < orangesLength; i++)
            orangesDistanceFromTree[i] = oranges[i] + b;

        int applesInRange = 0;

        for (int appleDistanceFromTree : applesDistanceFromTree)
            if (appleDistanceFromTree >= s && appleDistanceFromTree <= t)
                applesInRange++;

        int orangesInRange = 0;

        for (int orangeDistanceFromTree : orangesDistanceFromTree)
            if (orangeDistanceFromTree >= s && orangeDistanceFromTree <= t)
                orangesInRange++;

        System.out.printf("%d\n%d", applesInRange, orangesInRange);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}
