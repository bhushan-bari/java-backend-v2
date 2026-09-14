package com.bhushan.javabackend.module07;

public class GarbageCollectionDemo {

    static class TemporaryObject {

        private final int id;

        public TemporaryObject(int id) {
            this.id = id;
            System.out.println("Object created: " + id);
        }

        public void display() {
            System.out.println("Object ID: " + id);
        }
    }

    public static void main(String[] args) {

        TemporaryObject object1 = new TemporaryObject(1);
        TemporaryObject object2 = new TemporaryObject(2);
        TemporaryObject object3 = new TemporaryObject(3);

        object1.display();
        object2.display();
        object3.display();

        // Remove references to object1 and object2
        object1 = null;
        object2 = null;

        System.out.println("\nReferences to object1 and object2 removed.");

        System.out.println(
                "Their objects may now be eligible for Garbage Collection."
        );

        // Request GC - not guaranteed
        System.gc();

        System.out.println(
                "GC requested. The JVM decides when collection actually occurs."
        );

        // object3 is still reachable
        System.out.println("\nObject still referenced:");
        object3.display();
    }
}