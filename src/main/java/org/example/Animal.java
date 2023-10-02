package org.example;

public record Animal(
        String id,
        String name,
        String kindOf,
        int age,
        Owner owner
) {
    public Animal withOwner(Owner owner){
        return new Animal(
                this.id,
                this.name,
                this.kindOf,
                this.age,
                owner
        );
    }

}
