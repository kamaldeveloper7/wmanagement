package com.watermanagement.domain.person;

import com.watermanagement.utils.GeneralUtils;

public abstract class Person {
    private String id;

    public Person() {
        this.id = GeneralUtils.generateUniqueId();
    }

    public String getId() {
        return id;
    }

    public abstract PersonType getPersonType();
}
