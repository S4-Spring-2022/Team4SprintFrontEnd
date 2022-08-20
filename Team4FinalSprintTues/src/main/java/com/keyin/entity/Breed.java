package com.keyin.entity;


import javax.persistence.*;


@Entity

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Breed {
@Id
@SequenceGenerator(name = "breed_sequence", sequenceName = "breed_sequence", allocationSize = 1, initialValue = 1)
@GeneratedValue(generator = "breed_sequence")
    private long id;
    private String breedName;
    private String scientificName;
    private String country;
    private int years;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
