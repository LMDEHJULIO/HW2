package animals;

public class Animal {
    String sound;
    boolean isAggressive;

    char[] genomeSegment;

    // Added later bc I realized I didn't add a name property, but I liked the other attributes lol
    String name;
    public void printAnimalSound(){
        System.out.println("I'm a " + this.name + ". " + this.sound);
    }

    public void printGenomeSegment(){
        System.out.println("The " + this.name + " 10-base genome sequence is ");
        for(char geneBase : this.genomeSegment){
            System.out.println(geneBase);
        }
    }

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
