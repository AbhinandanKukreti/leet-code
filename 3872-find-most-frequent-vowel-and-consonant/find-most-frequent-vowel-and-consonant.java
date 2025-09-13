class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxVowel = 0;
        int maxConsonant = 0;
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            if (isVowel(c)) {
                if (freq[i] > maxVowel) {
                    maxVowel = freq[i];
                }
            } else {
                if (freq[i] > maxConsonant) {
                    maxConsonant = freq[i];
                }
            }
        }

        return maxVowel + maxConsonant;
    }

    private boolean isVowel(char c) {
        // could also use a Set or string lookup
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
