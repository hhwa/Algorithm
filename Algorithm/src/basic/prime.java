package basic;

/*
 * 
 * �Ҽ� ����
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
        		System.out.print(i+" "); //�Ҽ�
        	}
        }
        
    }
	
	public static void make_prime(int N) {
		
		prime = new boolean[N + 1];	// 0 ~ N
 
		/*
		�Ҽ��� �ƴ� index = true
		�Ҽ��� index = false
		*/
		
		// 2 �̸��� N �� �Է¹����� �Ҽ��� �Ǻ��� �ʿ� �����Ƿ� �ٷ� return
		if(N < 2) {
			return;
		}
        
		prime[0] = prime[1] = true;
        
		// ������ �Լ� : Math.sqrt()
		for(int i = 2; i <= Math.sqrt(N); i++) {
			// �̹� üũ�� �迭�̸� ���� �ݺ������� skip
			if(prime[i] == true) {
				continue;
			}
        
			// i �� ������� �ɷ��ֱ� ���� �ݺ���
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
