package ru.netology.stats;

public class StatsService {

    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calcAverageSum(int[] sales) {
        int sum = calcSum(sales);
        int averageSum = sum / sales.length;
        return averageSum;
    }

    public int calcMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[maxMonth] <= sales[i]) {
                maxMonth = i;
            }
        }
        maxMonth += 1;
        return maxMonth;
    }

    public int calcMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[minMonth] >= sales[i]) {
                minMonth = i;
            }
        }
        minMonth += 1;
        return minMonth;
    }

    public int calcCounterBelowAverage(int[] sales) {
        int counter = 0;
        int averageSum = calcAverageSum(sales);
        for (int sale : sales) {
            if (sale < averageSum) {
                counter += 1;
            }
        }
        return counter;
    }

    public int calcCounterAboveAverage(int[] sales) {
        int counter = 0;
        int averageSum = calcAverageSum(sales);
        for (int sale : sales) {
            if (sale > averageSum) {
                counter += 1;
            }
        }
        return counter;
    }
}
