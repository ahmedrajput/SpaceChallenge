public interface SpaceShip {
    boolean launch();
    boolean land();
    boolean canCarry(Item newItem);
    boolean carry(Item newItem);
}