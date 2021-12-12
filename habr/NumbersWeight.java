class NumbersWeight{
	int[] nums = {1,2,3};
	int[] weights = {1,2,10};

	public NumbersWeight(int count){
		System.out.println("Numbers" + Arrays.toString(nums));
		System.out.println("Weights" + Arrays.toString(weights));

		java.lang.StringBuilder str = new java.lang.StringBuilder();
		str.append("[");
		for(int i = 0; i < count; i++){
			str.append(getNum());
			if(i != count - 1)
				str.append(", ");
		}
		str.append("]");
		System.out.println(str);
	}

	public int getNum(){
		int weightSum = 0;
		for (int weight : weights) {
			weightSum += weight;
		}

		double randomNum = java.lang.Math.random() * (weightSum-1);

		if(randomNum <= (double) weights[0])
			return nums[0];

		for(int i = 1; i < nums.length; i++){
			if(randomNum <= (double) getMaxByWeight(i) && randomNum > (double) getMaxByWeight(i-1))
				return nums[i];
		}

		return 0;
	}

	public int getMaxByWeight(int index){
		int max = 0;

		for(int i=index; i>=0; i--){
			max += weights[i];
		}
		return max;
	}
}
