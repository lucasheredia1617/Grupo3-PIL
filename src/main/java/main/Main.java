package main;

import model.Supervisor;
import services.Point;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Point z = new Point(0, 0);
        Point x = new Point(6,6);

        ArrayList<Supervisor> lista = new ArrayList<>();
        Supervisor a = new Supervisor(1,"5222", "ABC", "DFG", "3");
        lista.add(a);

        System.out.println(z.distance(x));
        System.out.println(lista);
    }
}
