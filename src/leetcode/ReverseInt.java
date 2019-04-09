class Solution {
    public int reverse(int x) {
        boolean flag = false;
        
        int reversed = 0;
        try {
            while(x != 0 ) {
            int digit = x % 10;
            if (digit == 0 && !flag) {
                digit = x % 10;
                flag = true;
            }
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) return 0;
           reversed = reversed * 10 + digit;
            x /= 10;
        }
        if (x < 0) {
            reversed = -1 * reversed;
        }
        }catch(Exception e){
            return 0;
        }
      return reversed;
    }
}
