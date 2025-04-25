package gs;
//https://leetcode.com/problems/count-symmetric-integers/description/?envType=daily-question&envId=2025-04-11
public class SymmetricIntegers {
    public static void main(String[] args) {
        System.out.println(countSymmetricIntegers(1,10000));
    }

    private static int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i<= high; i++) {
            int c = getCountOfDigits(i);
            if (c%2==0) {
                int digitBreak = c/2;
                String s =String.valueOf(i);
                String breakString1 = s.substring(0,digitBreak);
                String breakString2 = s.substring(digitBreak);
                if(isSymmetricSum(breakString1, breakString2)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isSymmetricSum(String breakString1, String breakString2) {
        int sum1 = 0;
        int sum2=0;
        for (char c : breakString1.toCharArray()){
            int i = Integer.parseInt(String.valueOf(c));
            sum1 += i;
        }
        for (char c : breakString2.toCharArray()){
            int i = Integer.parseInt(String.valueOf(c));
            sum2 += i;
        }
        return sum1 == sum2;
    }

    private static int getCountOfDigits(int n) {
        int count = 0;
        while(n > 0) {
            n = n/10;
            count++;
        }
        return count;
    }
}
