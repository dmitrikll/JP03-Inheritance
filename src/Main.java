public class Main {

    public static void main(String[] args) {

        Cat catAlfie = new Cat();
        catAlfie.animalRunDist(184);
        catAlfie.animalSwimDist(12);

        Dog dogArchie = new Dog();
        dogArchie.animalRunDist(482);
        dogArchie.animalSwimDist(7);

        System.out.println("Total cats: " + Cat.getCatCount());
        System.out.println("Total dogs: " + Dog.getDogCount());
    }
}
