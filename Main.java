import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Simulation sim = new Simulation();
        ArrayList<Item> phase1Items = sim.loadItems("/Users/ahassan/Downloads/phase1.txt");
        ArrayList<Item> phase2Items = sim.loadItems("/Users/ahassan/Downloads/phase2.txt");
        ArrayList<U1> loadedU1Phase1 = sim.loadU1(phase1Items);
        ArrayList<U1> loadedU1Phase2 = sim.loadU1(phase2Items);
        ArrayList<U2> loadedU2Phase1 = sim.loadU2(phase1Items);
        ArrayList<U2> loadedU2Phase2 = sim.loadU2(phase2Items);
        System.out.println("Cost of U1 phase1 is "+sim.runSimulationU1(loadedU1Phase1));
        System.out.println("Cost of U1 phase2 is "+sim.runSimulationU1(loadedU1Phase2));
        System.out.println("Cost of U2 phase1 is "+sim.runSimulationU2(loadedU2Phase1));
        System.out.println("Cost of U2 phase2 is "+sim.runSimulationU2(loadedU2Phase2));
    }
}