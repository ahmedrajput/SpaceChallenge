public class Rocket implements SpaceShip {
    int cost;
    int weight;
    int maxWeight;

    public int getCost() {
        return this.cost;
    }
    public boolean launch() {
        return true;
    }
    public boolean land() {
        return true;
    }
    public boolean canCarry(Item newItem) {
        if(this.weight+newItem.weight > this.maxWeight) {
            return false;
        }
        else {
            return true;
        }
    }
    public boolean carry(Item newItem) {
        if(canCarry(newItem)) {
            this.weight += newItem.weight;
            return true;
        }
        return false;

    }
}