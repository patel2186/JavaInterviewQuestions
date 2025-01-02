package org.example.streamOnObjects;

public class Employee implements Comparable<Employee>{
    private Long id;
    private String name;
    private Address address;


    public Employee(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public int compareTo(Employee o) {
        int i = this.address.getCity().compareTo(o.address.getCity());
        if(i!=0){
            return i;
        }
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address.getCity() +
                '}';
    }
}
