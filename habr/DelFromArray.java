class DelFromArray{
	private int[] array;

	public DelFromArray(int ...values){
		array = Arrays.generateSerialInt(20);

		System.out.println("From: " + Arrays.toString(array));

		for (int value : values) {
			System.out.println("the try to delete " + value);
			array = del(value);
		}

		System.out.println("Result: " + Arrays.toString(array));
	}

	public int[] del(int value){
		int count = 0;
		for (int j : array) {
			if (value == j)
				count++;
		}

		int index = 0;
		int[] newArray = new int[array.length - count];
		for (int j : array) {
			if (value != j)
				newArray[index++] = j;
		}

		return newArray;
	}
}
