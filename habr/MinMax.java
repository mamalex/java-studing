public class MinMax{
    public MinMax(int arrayCount, int maxValue){
		double[] randomDoubles = Arrays.generateRandomDouble(arrayCount, maxValue);

	    double max = 0,
			min = 0,
			avg = 0;

		for (double randomDouble : randomDoubles) {
			if (randomDouble > max)
				max = randomDouble;

			if (randomDouble < min)
				min = randomDouble;

			avg += randomDouble / randomDoubles.length;
		}

	    System.out.println("Max number=" + max);
	    System.out.println("Min number=" + min);
	    System.out.println("Avg number=" + avg);
    }
}
