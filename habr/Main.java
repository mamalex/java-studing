import java.util.Scanner;

public class Main {
    java.util.Scanner sc = new Scanner(System.in);

    public static void main(String ...args){
        Main main = new Main();
    }

    public Main(){
        for(;;){
            showMenu();
            int choiseNum = getMenuChoise();
            System.out.println();

            switch(choiseNum){
                case 0:
                    return;
                case 1:
                    System.out.println("Minimum, maximum and average value of an array:");
                    MinMax minMax = new MinMax(1000, 100000);
                break;
                case 2:
                    System.out.println("Prime number from 2 to 100:");
                    Prime prime = new Prime();
                break;
                case 3:
                    System.out.println("Delete from array:");
                    DelFromArray delFromArray = new DelFromArray(3, 12, 15, 40);
                break;
                case 4:
                    System.out.println("N-dimensional vector:");
                    Vector[] vectors = Vector.generate(10, 5);
                    System.out.println(vectors[0]);
                    System.out.println(vectors[2]);
                    System.out.println("Length: " + vectors[2].length());
                    System.out.println("ScalarProduct(v1, v3): " + vectors[1].scalarProduct(vectors[3]));
                    //System.out.println(vectors[1].crossProduct(vectors[3]));
                    System.out.println("Cos(v1, v3): " + vectors[1].cos(vectors[3]));
                    System.out.println("Add(v1, v3): " + vectors[1].add(vectors[3]));
                    System.out.println("Add(v1, v3): " + vectors[1].subtract(vectors[3]));
                break;
                case 5:
                    System.out.println("Random numbers with using weights:");
                    NumbersWeight numbersWeight = new NumbersWeight(20);
                break;
                case 6:
                    System.out.println("Bubble sort:");
                    Bubble bubbleSort = new Bubble(Arrays.generateRandomDouble(10, 100));
                break;
                case 7:
                    System.out.println("LinkedList:");

                    LinkedList<Long> ll = new LinkedList<>();
                    ll.add(1L);
                    ll.add(3L);
                    ll.add(5L);
                    System.out.println("Size: " + ll.size());
                    System.out.println(ll);
                break;
            }
            System.out.println();
        }
    }

    private void showMenu(){
        System.out.println("1. MinMaxAvg");
        System.out.println("2. Prime numbers from 2 to 100");
        System.out.println("3. Delete from array");
        System.out.println("4. N-dimensional vector");
        System.out.println("5. Random numbers with theirs weight");
        System.out.println("6. Bubble sort");
        System.out.println("7. My implementation of the LinkedList");
        System.out.println("0. Exit");
        System.out.println();
    }

    private int getMenuChoise(){
        System.out.print("Choise a number of lesson: ");
        return sc.nextInt();
    }
}
