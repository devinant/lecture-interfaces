package animals;

public class Deer extends Animal implements Prey {
    public Deer() {
        super(4);
    }

    @Override
    public void escape() {
        System.out.println("The deer runs away");
    }
}
