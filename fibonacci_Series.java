// Fibonacci series from recursive approach to optimised approach using dynamic programming
package Dynamic_Programming;

public class fibonacci_Series {
                //Recursive way for fibonacci T.C. = exponential
                // S.c. = exponential
//    static int find_fibonacci(int n)
//    {
//        if(n ==  0 || n == 1) {
//            return n;
//        }
//        return find_fibonacci(n-1) + find_fibonacci(n-2);
//
//    }


    //Using Dynamic programmming approach
    //T.C. O(n)
    //S.C. = O(n) + O(n)

//        static int find_Fib_dp1(int n , int dp[])
//        {
//            if(n == 0 || n == 1)
//            {
//                return n;
//            }
//            if(dp[n]!=0) return dp[n];
//            dp[n] = find_Fib_dp1(n-1,dp) +  find_Fib_dp1(n-2,dp);
//
//
//            return dp[n];
//        }


    //Dynamic Programming tabulation method i.e. bottom up
    //T.C. = O(n)
    //S.C. = O(n)

//    static int find_Fib_dp2(int n)
//    {
//        int dp[] = new int[n+1];
//        dp[0] = 0;
//        dp[1] = 1;
//        for(int i = 2 ; i <=n ; i++)
//        {
//            dp[i] = dp[i-1] + dp[i-2];
//        }
//        return dp[n];
//    }


    //Third and most optimised approach
    // T.C. = O(n)
    //S.c. = O(1)
    //We can see the power of dp to which optimisation from exponential to constant for S.C. and linear T.C.
    static int find_Fib_dp2_Much_Optimised(int n)
    {
        if(n == 0 || n == 1) return n;
        int prev1 = 1;
        int prev2 = 0;
        for(int i = 2 ; i <= n ; i++)
        {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }


    public static void main(String[] args) {
//        System.out.println(find_fibonacci(5));


//        int n = 8;
//        int dp[] = new int[n+1];
//        System.out.println(find_Fib_dp1(n,dp));



        //System.out.println(find_Fib_dp2(8));


        System.out.println(find_Fib_dp2_Much_Optimised(5));
    }
}
