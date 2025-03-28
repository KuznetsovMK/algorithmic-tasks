package leetcode;

public class AverageWaitingTime {
    public static void main(String[] args) {
        int[][] customers = new int[][]{{2, 3}, {6, 3}, {7, 5}, {11, 3}, {15, 2}, {18, 1}};

        System.out.println(averageWaitingTime(customers));
    }

    public static double averageWaitingTime(int[][] customers) {
        long totalTime = 0;
        long waiting = 0;

        for (int i = 0; i < customers.length; i++) {
            int arrival = customers[i][0];
            int time = customers[i][1];

            if (totalTime < arrival) {
                totalTime = arrival + time;
            } else {
                totalTime += time;
            }

            if (totalTime >= arrival) {
                waiting += (totalTime - arrival);
            } else {
                waiting += time;
            }
        }

        return (double) waiting / customers.length;
    }
}
