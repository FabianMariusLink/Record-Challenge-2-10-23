package org.example;

public record Animal(
        String id,
        String name,
        String kindOf,
        int age,
        Owner owner,
        Species species
) {
    public Animal withOwnerAndSpecies(Owner owner, Species species){
        return new Animal(
                this.id,
                this.name,
                this.kindOf,
                this.age,
                owner,
                species
        );
    }

}
