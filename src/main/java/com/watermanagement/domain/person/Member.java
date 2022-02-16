package com.watermanagement.domain.person;

public class Member extends Person {
    private PersonType personType;

    public Member() {
        super();
        this.personType = PersonType.FAMILY_MEMBER;
    }

    public PersonType getPersonType() {
        return personType;
    }
}
