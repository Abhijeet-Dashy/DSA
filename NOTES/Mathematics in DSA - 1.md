### Number Theory :
#### Factorial - n! = n*(n-1)
#### Trailing zeros in fact - if n > 5 : floor(n/5) ; if n > 25 : floor(n/5) + floor(n/25)
code :
```
for ( i = 5 to n and i *= 5)
res += n/i;
```

#### Palindrome Num - 
n%10/(n/10)
code:
```
	while(n!=0){ rem = n%10;
		`res = res*10 + rem;
		`n /= 10;
	}
```

#### GCD -
	if ( b == 0) return a;
	return gcd(b,a%b);

#### Sieve of eratosthenes - 
code :
```
import java.util.Arrays;
public class MathematicsForCP {
    public static void main(String[] args) {
        boolean isPrime[] = sieveOfEratosthenes(20);
        for (int i = 0; i <= 20; i++) {
            System.out.println(i + " " + isPrime[i]);
        }
    }

    static boolean[] sieveOfEratosthenes(int n) {
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}
```
	
#### Modulo Arithmatics -
- **(a+b)%n = (a%n + b%n)%n
- **(ab)%n = (a%n * b%n)%n

code :
```
static long fastPower(long a, long b, int n) {
	long res = 1;
	
    while (b > 0) {
        if ((b & 1) != 0) {
            res = (res * a % n) % n;
        }
        a = (a % n * a % n) % n;
        b = b >> 1;
    }

    return res;
}
```
