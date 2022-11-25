package basic;

/*
 * 
 * 소수 관련
 * 
 * */
public class prime {
	
	public static boolean[] prime;
	
	public static void main(String[] args) {
        int N = 211;
        
        System.out.println("------Check number N isPrime?-------");
        System.out.println(isPrime(N));
        
        System.out.println("------Check 1~N All prime List-------");
        make_prime(N);
        
        for(int i =0 ; i<prime.length; i++) {
        	if(prime[i] == false) {
        		System.out.print(i+" "); //소수
        	}
        }
        
    }
	
	public static void make_prime(int N) {
		
		prime = new boolean[N + 1];	// 0 ~ N
 
		/*
		소수가 아닌 index = true
		소수인 index = false
		*/
		
		// 2 미만의 N 을 입력받으면 소수는 판별할 필요 없으므로 바로 return
		if(N < 2) {
			return;
		}
        
		prime[0] = prime[1] = true;
        
		// 제곱근 함수 : Math.sqrt()
		for(int i = 2; i <= Math.sqrt(N); i++) {
			// 이미 체크된 배열이면 다음 반복문으로 skip
			if(prime[i] == true) {
				continue;
			}
        
			// i 의 배수들을 걸러주기 위한 반복문
			for(int j = i * i; j < prime.length; j = j+i) {
				prime[j] = true;
			}
		}
 
	}
	
	public static boolean isPrime(int n) {
		if(n > 1) {
			for (int i = 2; i<=(int)Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
	}
	
}
