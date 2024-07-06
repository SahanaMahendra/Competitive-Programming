public class FactorialTrailingZeroes {
    public int trailingZeroes(int n){
        int ans = 0;
        while(n > 4){
            n = n / 5;
            ans = ans + n;
        }
        return ans;
    }
}
