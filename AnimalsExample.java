import animals.Cheetah;
import animals.Deer;
import animals.Lion;

import java.util.ArrayList;
import java.util.List;

public class AnimalsExample {
    public static void main(String[] args) {

        Lion lion       = new Lion();
        Cheetah cheetah = new Cheetah();

        // A deer is a pray (huntable).
        List<Deer> groupOfDeer = new ArrayList<>();

        groupOfDeer.add(new Deer());
        groupOfDeer.add(new Deer());
        groupOfDeer.add(new Deer());
        groupOfDeer.add(new Deer());
        groupOfDeer.add(new Deer());

        groupOfDeer.forEach(lion::hunt);

        // This is the same as above. What we do instead is use lambdas, which is a new
        // feature in Java 8. Remember what we discussed; less code often results in less bugs.
        //
        //for(Deer deer: groupOfDeer) {
        //    lion.hunt(deer);
        //}

        cheetah.hunt( groupOfDeer.get(groupOfDeer.size() - 1) );

        // Let's let the lion hunt the cheetah (highly unlikely :))
        lion.hunt(cheetah);
    }
}
