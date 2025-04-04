package gs;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(3136));
    }

    private static boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        int mid;

        while (left < right) {
            mid = (left + right)/2;

            if (mid * mid > num) {
                right = mid - 1;
            }
            else if (mid * mid < num) {
                left = mid + 1;
            }
            else
                return true;
        }
        return false;
    }
}
