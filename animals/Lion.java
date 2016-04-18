package animals;

public class Lion extends Animal implements Predator {
    public Lion() {
        super(4);
    }

    @Override
    public void hunt(Prey prey) {
        if (Math.random() >= 0.5) {
            System.out.format("Like a true king, the lion runs towards the %s and kills it.\n", prey.getClass().getSimpleName());
        } else {
            System.out.format("The lion runs towards the %s with its %d legs.\n", prey.getClass().getSimpleName(), this.getLegs());
            prey.escape();
        }

    }
}
