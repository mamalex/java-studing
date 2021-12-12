class Vector{
	private final double[] coords;

	public Vector(double[] coords){
		this.coords = coords;
	}

	public double get(int i){
		return coords[i];
	}

	public double length(){
		double tmp = 0;

		for (double coord : coords) {
			tmp += coord * coord;
		}

		return java.lang.Math.sqrt(tmp);
	}

	public double scalarProduct(Vector v){
		double tmp = 0;

		for(int i = 0; i < coords.length; i++){
			tmp += coords[i] * v.get(i);
		}

		return tmp;
	}

	/*
	public Vector crossProduct(Vector v){
		double[] newCoords = new double[coords.length];

		for(int i = 0; i < coords.length - 1; i++){
			newCoords[i] = coords[i+1] * v.get(i+2) - coords[i+2] * v.get(i+1);
		}

		newCoords[coords.length -1] = coords[0] * v.get(1) - coords[1] * v.get(0);

		return new Vector(coords);
	}
	*/

	public double cos(Vector v){
		return scalarProduct(v) / (length() * v.length());
	}

	public Vector add(Vector v){
		double[] newCoords = new double[coords.length];

		for(int i = 0; i < coords.length; i++){
			newCoords[i] = coords[i] + v.get(i);
		}

		return new Vector(newCoords);
	}

	public Vector subtract(Vector v){
		double[] newCoords = new double[coords.length];

		for(int i = 0; i < coords.length; i++){
			newCoords[i] = coords[i] - v.get(i);
		}

		return new Vector(newCoords);
	}

	public static void main(String ...args){
	}

	public static Vector[] generate(int count, int n){
		Vector[] vectors = new Vector[count];
		for(int i = 0; i < count; i++){
			double[] coords = new double[n];
			for(int j = 0; j < n; j++){
				coords[j] = java.lang.Math.random() * 1000;
			}
			vectors[i] = new Vector(coords);
		}
		return vectors;
	}

	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("Vector{");

		for(int i = 0; i < coords.length; i++){
			str.append("n").append(i + 1).append("=").append(coords[i]);
			if(i != coords.length - 1)
				str.append(", ");
		}
		str.append("}");
		return str.toString();
	}
}
