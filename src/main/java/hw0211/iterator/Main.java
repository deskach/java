package hw0211.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Main.printCars(Main.getCars());
    }

    public static void printCars(ArrayList<String> cars) {
        for (Iterator it = cars.iterator(); it.hasNext(); System.out.println(it.next()));
    }

    public static ArrayList<String> getCars() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Gaz");
        cars.add("Lada");
        cars.add("Uaz");
        cars.add("Maz");

        return cars;
    }
}
