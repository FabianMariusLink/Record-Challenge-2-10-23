package org.example;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("1", "Tiger1", "African animal", 12,new Owner("name1",71,"address1"), new Species("Species1", 10000));
        Animal animal2  = new Animal("2", "Lion1", "South African lion", 7,null, new Species("Species1", 10000));
        Animal animal3 = new Animal("3", "Elephant1", "Indian elephant", 15,null, new Species("Species2", 150000));

        //Owner owner1 = new Owner ("owner1", 44, "address1"); DIREKT IN DER INSTANZIIERUNG VON animal1
        Owner owner2 = new Owner ("owner2", 32, "address2");
        Owner owner3 = new Owner ("owner3", 51, "address3");

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);

        System.out.println(animal2.equals(animal3));

        Animal animal2Copy = new Animal(animal2.id(), animal2.name(), animal2.kindOf(),animal2.age(),owner2, animal2.species());
        Animal animal3Copy = new Animal(animal3.id(), animal3.name(), animal3.kindOf(),animal3.age(),owner3, animal3.species());
        Animal animal1Copy = new Animal(animal1.id(), animal1.name(), animal1.kindOf(),animal1.age(),owner2, animal1.species());
        System.out.println(animal2Copy);
        System.out.println(animal3Copy);
        System.out.println(animal1Copy);

        //Species species1 = new Species("Species1", 200);
        //Species species2 = new Species("Species2", 300);
        Animal animalWithNewName = animal1.withName("Big Tiger1");
        System.out.println(animalWithNewName);

        Animal animalWithKindOf = animal2.withKindOf("German Lion");
        System.out.println(animalWithKindOf);

        Animal animalAge = animal3.withAge(104);
        System.out.println(animalWithKindOf);
    }
}