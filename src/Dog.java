public class Dog extends Animals {

    private static int dogCount = 0;
    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_SWIM_DISTANCE = 10;

    public Dog() {
        dogCount += 1;
    }

    @Override
    public void animalRunDist(int dist) {
        if (dist <= MAX_RUN_DISTANCE) {
            System.out.println("Dog runs " + dist + "m");
        } else {
            System.out.println("Dog can run only " + MAX_RUN_DISTANCE + "m");
        }
    }

    @Override
    public void animalSwimDist(int dist) {
        if (dist <= MAX_SWIM_DISTANCE) {
            System.out.println("Dog swims " + dist + "m");
        } else {
            System.out.println("Dog can swim only " + MAX_SWIM_DISTANCE + "m");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
