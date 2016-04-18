package animals;

/**
 * The cheetah can be both a hunter and hunted
 */
public class Cheetah extends Animal implements Predator, Prey {
    public Cheetah() {
        super(4);
    }

    @Override
    public void escape() {
        System.out.println("The cheetah runs away");
    }

    @Override
    public void hunt(Prey prey) {
        System.out.format("Like a bullet, the cheetah runs towards the %s and kills it.\n", prey.getClass().getSimpleName());
    }
}
