public class Fibonacci {


    // MARK: - recursive fibonacci
    public int fibonacci(int n) {
        if (n<= 1) {
            return n;
        } 

        return fibonacci(n-1) + fibonacci(n-2);
    }

    // MARK: - Memoized fibonacci
    public int memoizedFibo() {

        return 0;
    }

    private int lookUpFibo(int[] f, int n) {
        if (f[n] >= 0) {
            return f[n];
        }
        
        if (n<=1) {
            f[n] = n;
        } else {
            f[n] = lookUpFibo(f, n - 1) + lookUpFibo(f, n - 2);
        }

        return f[n];
    }
//     MEMOIZED-FIBO (f, n)
//  para i ← 0 até n faça
//       f [i] ← −1
//  devolva LOOKUP-FIBO (f, n)

}
