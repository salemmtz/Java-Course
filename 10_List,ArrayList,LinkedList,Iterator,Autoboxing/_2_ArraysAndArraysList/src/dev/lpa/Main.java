package dev.lpa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] originalArray = new String[]{"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0,"one");
        System.out.println("List: " + originalList);
        System.out.println("Array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("Array: " + Arrays.toString(originalArray));

        ///// Can't change originalList size because it's linked to the originalArray
//        originalList.remove(0);
//        originalList.add("fourth");

        List<String> newList = Arrays.asList("Sunday","Monday","Tuesday");
        System.out.println(newList);

    }
}
