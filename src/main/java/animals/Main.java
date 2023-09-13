package animals;

public class Main {
    public static void main(String[] args) {
        // ANIMAL 1 - Wolf

        Animal animal1 = new Animal();

        animal1.sound = "Grrrrr";

        animal1.isAggressive = true;

        animal1.genomeSegment = new char[]{'A', 'T', 'C', 'G', 'A', 'T', 'C', 'G', 'A', 'T'};

        animal1.name = "Wolf";

        animal1.printAnimalSound();
        animal1.printGenomeSegment();

        // ANIMAL 2 - Gold Fish

        Animal animal2 = new Animal();

        animal2.sound = "Bloop-bloop";

        animal2.isAggressive = false;

        animal2.genomeSegment = new char[]{'T', 'T', 'A', 'A','T', 'T','A', 'T', 'T', 'A'};

        animal2.name = "Gold Fish";

        animal2.printAnimalSound();
        animal2.printGenomeSegment();

        // ANIMAL 3 - FILTHY HUMAN

        Animal animal3 = new Animal();

        animal3.sound = "Let's burn down this forest and build a Walmart.";

        animal3.isAggressive = true;

        animal3.genomeSegment = new char[]{'A', 'C', 'G', 'T', 'C', 'G', 'T', 'T', 'A', 'G'};

        animal3.name = "Human";

        animal3.printAnimalSound();
        animal3.printGenomeSegment();
    }
}
