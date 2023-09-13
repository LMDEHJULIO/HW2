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
        System.out.println("The " + this.name + " 10-base genome sequence is: ");
        for(char geneBase : this.genomeSegment){
            System.out.println(geneBase);
        }
    }
}
