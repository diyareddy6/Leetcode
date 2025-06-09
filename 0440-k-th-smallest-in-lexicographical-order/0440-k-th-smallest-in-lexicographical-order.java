class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1;
        k--;  // We start counting from 1

        while (k > 0) {
            long steps = countSteps(n, curr, curr + 1);
            if (steps <= k) {
                curr++;
                k -= steps;
            } else {
                curr *= 10;
                k--;
            }
        }

        return curr;
    }

    /**
     * Count the number of integers between prefixes [n1, n2)
     * within the range [1, n].
     */
    private long countSteps(int n, long n1, long n2) {
        long steps = 0;
        while (n1 <= n) {
            steps += Math.min((long)n + 1, n2) - n1;
            n1 *= 10;
            n2 *= 10;
        }
        return steps;
    }
}