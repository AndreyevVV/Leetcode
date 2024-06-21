package LeetCode.Daily_Challenge.Medium.Grumpy_Bookstore_Owner;

public class Solution {

    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int totalSatisfied = 0;
        int additionalSatisfied = 0;
        int maxAdditionalSatisfied = 0;

        for (int i = 0; i < customers.length; i++)
            if (grumpy[i] == 0)
                totalSatisfied += customers[i];

        for (int i = 0; i < minutes; i++)
            if (grumpy[i] == 1)
                additionalSatisfied += customers[i];

        maxAdditionalSatisfied = additionalSatisfied;

        for (int i = minutes; i < customers.length; i++) {
            if (grumpy[i] == 1)
                additionalSatisfied += customers[i];
            if (grumpy[i - minutes] == 1)
                additionalSatisfied -= customers[i - minutes];
            maxAdditionalSatisfied = Math.max(maxAdditionalSatisfied, additionalSatisfied);
        }
        return totalSatisfied + maxAdditionalSatisfied;
    }
}
