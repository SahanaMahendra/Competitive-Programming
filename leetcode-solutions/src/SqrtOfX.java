/**
 * How to solve square root of x?
 * first check whether the x is 0 ro 1 if so return x itself
 * next find the mid-point,
 * check if the midpoint*midpoint==x then return midpoint
 * if midpoint*midpoint>=x then change the range from 0 to midpoint and repeat
 * if not change the range from midpoint to x and repeat
 */
public class SqrtOfX {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        int start = 1;
        int end = x;
        int mid = -1;

        while(start<= end){
            mid=start+(end-start)/2;
            if ((long) mid * mid > (long) x)
                end=mid-1;
            else if(mid * mid ==x)
                return mid;
            else
                start=mid+1;
        }
        return Math.round(end);
    }
}
