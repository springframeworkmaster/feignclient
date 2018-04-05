
package com.springframeworkmater.cloud.feignclient.domains;

import java.io.Serializable;
import java.util.List;

public class PersonList implements Serializable
{

    private List<Person> persons = null;
    private final static long serialVersionUID = -5406917647619846601L;

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

}
