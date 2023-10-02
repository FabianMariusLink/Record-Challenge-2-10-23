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
    public Animal withId(String id){
        return new Animal(
                id,
                this.name,
                this.kindOf,
                this.age,
                this.owner,
                this.species
        );
    }
    public Animal withName(String name){
        return new Animal(
                this.id,
                name,
                this.kindOf,
                this.age,
                this.owner,
                this.species
        );
    }
    public Animal withKindOf(String kindOf){
        return new Animal(
                this.id,
                this.name,
                kindOf,
                this.age,
                this.owner,
                this.species
        );
    }
    public Animal withAge(int age){
        return new Animal(
                this.id,
                this.name,
                this.kindOf,
                age,
                this.owner,
                this.species
        );
    }
    public Animal withOwner(Owner owner){
        return new Animal(
                this.id,
                this.name,
                this.kindOf,
                this.age,
                owner,
                this.species
        );
    }
    public Animal withSpecies(Species species){
        return new Animal(
                this.id,
                this.name,
                this.kindOf,
                this.age,
                this.owner,
                species
        );
    }
}
