import java.util.Random;

public class U1 extends Rocket {
    U1() {
        cost = 100;
        weight = 10000;
        maxWeight = 18000;
    }

    @Override
    public boolean land() {
        Random rand = new Random();
        double chance = 1.0/((1.0/100.0)*((double )weight/(double )maxWeight));
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
        double chance = 1.0/((5.0/100.0)*((double )weight/(double )maxWeight));
        if(rand.nextInt((int )chance) == 0) {
            return false;
        }
        else {
            return true;
        }
    }
}