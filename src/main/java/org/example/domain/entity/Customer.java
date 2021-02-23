package org.example.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
/*
You also have two constructors. The default constructor
exists only for the sake of JPA.
The other constructor is the one you use to
create instances of Customer to be saved to the database.
The Customer class is annotated with @Entity, indicating that it is
a JPA entity. Because no @Table annotation exists, it is assumed
that this entity is mapped to a table named Customer.
The Customer object’s id property is annotated with @Id so that JPA
recognizes it as the object’s ID. The id property is also annotated
with @GeneratedValue to indicate that the ID should be generated
automatically.
The other two properties, firstName and lastName, are left unannotated.
It is assumed that they are mapped to columns that share the same names
as the properties themselves.
*/
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    protected Customer() {}
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;     this.lastName = lastName;    }

    public Long getId() {    return id;   }
    public String getFirstName() {   return firstName;   }

    public String getLastName() {   return lastName;    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);    }
}