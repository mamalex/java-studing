import java.lang.Math;

public class Arrays {
    public static double[] generateRandomDouble(int count, int maxValue){
        double[] array = new double[count];
        for(int i = 0; i < array.length; i++){
            array[i] = Math.random() * maxValue;
        }
        return array;
    }

    public static int[] generateRandomInt(int count, int maxValue){
        int[] array = new int[count];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * maxValue);
        }
        return array;
    }

    public static int[] generateSerialInt(int count){
        int[] array = new int[count];
        for(int i = 0; i < count; i++){
            array[i] = i + 1;
        }
        return array;
    }

    public static String toString(int[] array){
        java.lang.StringBuilder str = new java.lang.StringBuilder();

        str.append("[");
        for(int i=0; i<array.length; i++){
            str.append(array[i]);
            if(array.length - 1 != i)
                str.append(", ");
        }
        str.append("]");

        return str.toString();
    }

    public static String toString(double[] array){
        java.lang.StringBuilder str = new java.lang.StringBuilder();

        str.append("[");
        for(int i=0; i<array.length; i++){
            str.append(array[i]);
            if(array.length - 1 != i)
                str.append(", ");
        }
        str.append("]");

        return str.toString();
    }
}