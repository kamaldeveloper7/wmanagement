package com.watermanagement.domain.person;

public class Guest extends Person {
    private PersonType personType;

    public Guest() {
        super();
        this.personType = PersonType.GUEST;
    }

    public PersonType getPersonType() {
        return personType;
    }
}
