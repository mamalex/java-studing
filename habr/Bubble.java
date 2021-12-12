public class Bubble{

	public Bubble(double ...arr){
		//double[] arr = Arrays.generateRandomDouble(10, 100);

		System.out.println("Original: " + Arrays.toString(arr));
		long startNs = System.nanoTime();
		double[] array = bubbleSort(arr);
		long time = System.nanoTime() - startNs;
		System.out.println("Sorted: " + Arrays.toString(array));
		System.out.println("Execution time - " + time + "ns");
	}

	public double[] bubbleSort(double[] arr){
	    for(int i = 0; i < arr.length - 1; i++){
		    boolean changed = false;
		    for(int j = 0; j < arr.length - 1 - i; j++){
			    if(arr[j] > arr[j+1]){
				    double temp = arr[j+1];
				    arr[j+1] = arr[j];
				    arr[j] = temp;

				    changed = true;
			    }
		    }

		    if(! changed) break;
	    }
	    return arr;
	}
}
