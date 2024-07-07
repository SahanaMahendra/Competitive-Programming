/**
 a⊕a=0 (any number XORed with itself is 0)
 𝑎⊕0=𝑎
 a⊕0=a (any number XORed with 0 is the number itself)
 XOR is commutative and associative.
 */
public class SingleNumber {
        public int singleNumber(int[] nums) {
            int result = 0;
            for (int num : nums) {
                result ^= num;
            }
        return result;
        }
    }
