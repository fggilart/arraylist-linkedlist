package arraylist_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_LinkedList {

    private static ArrayList<Integer> arrayList = new ArrayList<>();
    private static LinkedList<Integer> linkedList = new LinkedList<>();

    private static long startTime, endTime, duration;
    private static int TOTAL = 100000;

    public static void main(String[] args) {
        compareAdd();
        System.out.println("--------------");
        compareGet();
        System.out.println("--------------");
        compareSet();
        System.out.println("--------------");
        compareRemove();
    }

    private static void compareAdd() {
        // ArrayList add
        startTime = System.currentTimeMillis();
        for (int i = 0; i < TOTAL; i++) {
            arrayList.add(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("ArrayList add: " + duration + "ms");

        // LinkedList add
        startTime = System.currentTimeMillis();
        for (int i = 0; i < TOTAL; i++) {
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("LinkedList add: " + duration + "ms");
    }

    private static void compareGet() {
        // ArrayList get
        startTime = System.currentTimeMillis();
        for (int i = 0; i < TOTAL; i++) {
            arrayList.get(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("ArrayList get: " + duration + "ms");

        // LinkedList get
        startTime = System.currentTimeMillis();
        for (int i = 0; i < TOTAL; i++) {
            linkedList.get(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("LinkedList get: " + duration + "ms");
    }

    private static void compareSet() {
        // ArrayList set
        startTime = System.currentTimeMillis();
        for (int i = 0; i < TOTAL; i++) {
            arrayList.set(i, i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("ArrayList set: " + duration + "ms");

        // LinkedList set
        startTime = System.currentTimeMillis();
        for (int i = 0; i < TOTAL; i++) {
            linkedList.set(i, i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("LinkedList set: " + duration + "ms");
    }

    private static void compareRemove() {
        // ArrayList remove
        startTime = System.currentTimeMillis();
        for (int i = TOTAL - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("ArrayList remove: " + duration + "ms");

        // LinkedList remove
        startTime = System.currentTimeMillis();
        for (int i = TOTAL - 1; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("LinkedList remove: " + duration + "ms");
    }

}
