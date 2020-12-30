package com.leet.daysofcode.december.week3;

import com.ds.utils.ArrayUtils;
import org.junit.Assert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class CherryPickupII {

    public static void main(String[] args) {
        int[][][] grids = {{{3, 1, 1}, {2, 5, 1}, {1, 5, 5}, {2, 1, 1}}, {{1, 0, 0, 0, 0, 0, 1}, {2, 0, 0, 0, 0, 3, 0}, {2, 0, 9, 0, 0, 0, 0}, {0, 3, 0, 5, 4, 0, 0}, {1, 0, 2, 3, 0, 0, 6}}, {{1, 0, 0, 3}, {0, 0, 0, 3}, {0, 0, 3, 3}, {9, 0, 3, 3}}, {{1, 1}, {1, 1}}, {{14, 3, 18, 14, 3, 0, 9, 8, 4, 4, 20}, {7, 1, 17, 15, 9, 7, 2, 0, 5, 19, 5}, {15, 16, 17, 18, 12, 11, 0, 15, 18, 10, 10}, {9, 11, 1, 4, 20, 16, 14, 11, 0, 12, 2}, {20, 16, 3, 15, 13, 9, 1, 17, 1, 2, 17}, {18, 5, 5, 16, 4, 5, 11, 20, 1, 12, 6}, {16, 3, 6, 19, 13, 1, 16, 0, 20, 14, 10}, {6, 12, 8, 17, 20, 14, 19, 14, 13, 9, 12}, {15, 20, 8, 18, 2, 6, 13, 10, 16, 10, 13}, {6, 9, 15, 0, 2, 19, 8, 14, 10, 11, 15}, {17, 5, 2, 4, 2, 16, 18, 8, 3, 0, 19}, {13, 7, 4, 2, 16, 13, 10, 3, 12, 3, 18}, {3, 4, 0, 10, 18, 3, 14, 0, 3, 3, 7}, {9, 13, 16, 15, 3, 8, 5, 5, 7, 2, 18}, {8, 12, 19, 20, 7, 20, 19, 9, 20, 0, 11}, {16, 2, 19, 16, 3, 5, 14, 9, 11, 17, 20}, {6, 14, 11, 15, 4, 19, 1, 11, 3, 19, 1}, {11, 12, 6, 0, 15, 2, 9, 13, 10, 18, 8}}};
        int[] outputs = {24, 28, 22, 4, 567};
        CherryPickupII cherryPickupII = new CherryPickupII();
        IntStream.range(0, grids.length).forEachOrdered(i -> {
            System.out.println("Input : ");
            ArrayUtils.printArr(grids[i]);
            int output = cherryPickupII.cherryPickup(grids[i]);
            System.out.println("Output : " + output);
            Assert.assertEquals(outputs[i], output);
        });
    }

    public int cherryPickup(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        return helper(0, 0, grid[0].length - 1, grid, new HashMap<>());
    }

    private int helper(int row, int firstJ, int secondJ, int[][] grid, Map<String, Integer> dp) {
        if (row < 0 || firstJ < 0 || secondJ < 0 || row >= grid.length || firstJ >= grid[0].length || secondJ >= grid[0].length || firstJ == secondJ) {
            return 0;
        }
        String key = getKey(row, firstJ, secondJ);
        if (dp.containsKey(key)) {
            return dp.get(key);
        }
        int cherriesFromThisRow = grid[row][firstJ] + grid[row][secondJ];
        row++;
        dp.put(key, cherriesFromThisRow + max(helper(row, firstJ - 1, secondJ - 1, grid, dp), helper(row, firstJ - 1, secondJ, grid, dp), helper(row, firstJ - 1, secondJ + 1, grid, dp),
                helper(row, firstJ, secondJ - 1, grid, dp), helper(row, firstJ, secondJ, grid, dp), helper(row, firstJ, secondJ + 1, grid, dp),
                helper(row, firstJ + 1, secondJ - 1, grid, dp), helper(row, firstJ + 1, secondJ, grid, dp), helper(row, firstJ + 1, secondJ + 1, grid, dp)));
        return dp.get(key);
    }

    private int max(int... mins) {
        int max = Math.max(mins[0], mins[1]);
        int len = mins.length;
        for (int i = 2; i < len; i++) {
            max = Math.max(max, mins[i]);
        }
        return max;
    }


    private String getKey(int... items) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(items).forEachOrdered(i -> sb.append(i).append(","));
        return sb.toString();
    }

}
