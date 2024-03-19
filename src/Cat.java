public class Cat extends Animals {

    private static int catCount = 0;
    private final int MAX_RUN_DISTANCE = 200;

    public Cat() {
        catCount += 1;
    }

    @Override
    public void animalRunDist(int dist) {
        if (dist <= MAX_RUN_DISTANCE) {
            System.out.println("Cat runs " + dist + "m");
        } else {
            System.out.println("Cat can run only " + MAX_RUN_DISTANCE + "m");
        }
    }

    @Override
    public void animalSwimDist(int dist) {
        System.out.println("Сat does not know how to swim...");
    }

    public static int getCatCount() {
        return catCount;
    }
}
