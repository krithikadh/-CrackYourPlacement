class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        long num1 = 0;
        long num2 = 0;
        long MOD = 1000000007;
        while (first != null) {
            num1 = (num1 * 10 + first.data) % MOD;
            first = first.next;
        }
        while (second != null) {
            num2 = (num2 * 10 + second.data) % MOD;
            second = second.next;
        }
        return (num1 * num2) % MOD;
    }
}
