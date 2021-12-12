
class Prime{
	public static final int MIN = 2;
	public static final int MAX = 100;

	public Prime(){
		java.util.List<String> resultList = new java.util.LinkedList<>();

		for(int i = MIN; i <= MAX; i++){
			boolean isPrime = true;

			for(int j = MIN; j <= i - 1; j++){
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}

			if(isPrime)
				resultList.add(String.valueOf(i));
		}
		System.out.printf("[%s]\n", String.join(", ", resultList));
	}
}
