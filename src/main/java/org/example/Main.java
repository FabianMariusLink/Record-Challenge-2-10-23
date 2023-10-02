package org.example;

public class Main {
    public static void main(String[] args) {
        Animal tiger = new Animal("1", "Tiger1", "African tiger", 12);
        Animal lion  = new Animal("2", "Lion1", "South African lion", 7);
        Animal elephant = new Animal("3", "Elephant1", "Indian elephant", 15);

        System.out.println(tiger);
        System.out.println(lion);
        System.out.println(elephant);

        System.out.println(lion.equals(elephant));
    }
}