package dev.lpa;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class Main {


    public static void main(String[] args) {


        LinkedList<Place> placesToVisit = new LinkedList<>();

        addPlace(placesToVisit, new Place("Adelaide", 1374));
        addPlace(placesToVisit, new Place("adelaide", 1374));
        addPlace(placesToVisit, new Place("Brisbane", 1374));
        addPlace(placesToVisit, new Place("Perth", 1374));
        addPlace(placesToVisit, new Place("Alice Springs", 1374));
        addPlace(placesToVisit, new Place("Darwin", 1374));
        addPlace(placesToVisit, new Place("Melbourne", 1374));

        placesToVisit.addFirst(new Place("Sydney", 0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }
            if(!iterator.hasNext()){
                System.out.println("Final: " + iterator.previous());
                forward = false;
            }

            System.out.print("Enter value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

            switch (menuItem) {
                case "F":
                    System.out.println("User wants to go forward");
                    if(!forward){                   // Reversing Direction
                        forward = true;
                        if(iterator.hasNext()){
                            iterator.next();        // Adjust position forward
                        }
                    }
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User wants to go backwards");
                    if(forward){
                        forward = false;
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                    }
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
                case "M":
                    printMenu();
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlace : list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }

        list.add(place);
    }

    private static void printMenu() {
        System.out.println("""
                Available actions (select word or letter):
                (F)orward 
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}
