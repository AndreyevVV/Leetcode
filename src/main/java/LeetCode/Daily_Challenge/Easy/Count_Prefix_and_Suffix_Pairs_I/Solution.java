package LeetCode.Daily_Challenge.Easy.Count_Prefix_and_Suffix_Pairs_I;

public class Solution {

    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++)
            for (int j = i + 1; j < words.length; j++)
                if (isPrefixAndSuffix(words[i], words[j]))
                    count++;

        return count;
    }

    private boolean isPrefixAndSuffix(String str1, String str2) {
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
}