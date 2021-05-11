package org.optional;

public class House {

    private Person owner;
    private String address;

    // TODO: 5/10/21  생성자를 통해서 값 할당 가능.
    public House(Person owner, String address) {
        this.owner = owner;
        this.address = address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public String getAddress() {
        return address;
    }
}

