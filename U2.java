import java.util.Random;

public class U2 extends Rocket {
    U2() {
        cost = 120;
        weight = 18000;
        maxWeight = 29000;
    }

    @Override
    public boolean land() {
        Random rand = new Random();
        double chance = 1.0/((8.0/100.0)*((double )weight/(double )maxWeight));
        if(rand.nextInt((int )chance) == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public boolean launch() {
        Random rand = new Random();
        double chance = 1.0/((4.0/100.0)*((double )weight/(double )maxWeight));
        if(rand.nextInt((int )chance) == 0) {
            return false;
        }
        else {
            return true;
        }
    }
}