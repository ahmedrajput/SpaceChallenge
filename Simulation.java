import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Simulation {
    public ArrayList<Item> loadItems(String filename) {
        String name;
        int weight;
        ArrayList<Item> itemList = new ArrayList<Item>();
        File file = new File(filename);
        String line;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                name = line.split("=")[0];
                weight = Integer.parseInt(line.split("=")[1]);
                Item newItem = new Item(name, weight);
                itemList.add(newItem);
            }
        }
        catch (FileNotFoundException Exception) {
            System.out.println("Please provide valid filepath.");
        }
        return itemList;
    }
    public ArrayList<U1> loadU1(ArrayList<Item> itemList) {
        ArrayList<U1> U1List = new ArrayList<U1>();
        U1 u1 = new U1();
        Iterator i = itemList.iterator();
        while (i.hasNext()) {
            Item item = (Item) i.next();
            while (u1.carry(item)) {
                if(i.hasNext()) {
                    item = (Item) i.next();
                }
            }
            U1List.add(u1);
            u1 = new U1();
        }
        return U1List;
    }
    public ArrayList<U2> loadU2(ArrayList<Item> itemList) {
        ArrayList<U2> U2List = new ArrayList<U2>();
        U2 u2 = new U2();
        Iterator i = itemList.iterator();
        while (i.hasNext()) {
            Item item = (Item) i.next();
            while (u2.carry(item)) {
                if(i.hasNext()) {
                    item = (Item) i.next();
                }
            }
            U2List.add(u2);
            u2 = new U2();
        }
        return U2List;
    }
    public int runSimulationU1(ArrayList<U1> U1List) {
        int rCost = 0;
        for(Rocket r: U1List) {
            while(!r.land() || !r.launch()) {
                rCost += r.getCost();
            }
            rCost +=r.getCost();
        }
        return rCost;
    }
    public int runSimulationU2(ArrayList<U2> U2List) {
        int rCost = 0;
        for(Rocket r: U2List) {
            while(!r.land() || !r.launch()) {
                rCost += r.getCost();
            }
            rCost +=r.getCost();
        }
        return rCost;
    }
}