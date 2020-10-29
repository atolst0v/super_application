public class Fibonacci {
	public static long fibonacci(int n){
		if (n <= 1) return 1;

 		long fibo = 1;
 		long fiboPrev = 1;

 		for(int i = 2; i < n; i++){
  			long temp = fibo;
  			fibo += fiboPrev;
  			fiboPrev = temp;
 		}
 		return fibo;
	}

	public static void main(String[] args) {
		int index = 1;
		while(true){
			if(index == 100){
				break;
			}

			System.out.print("F(" + index + ") = ");
			System.out.print(fibonacci(index) + "\n");
			index++;
		}
	}
}