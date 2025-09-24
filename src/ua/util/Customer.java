package ua.util;

import java.util.Objects;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;

    public Customer(String firstName, String lastName, String email) {
        Utils.validateName(firstName);
        Utils.validateName(lastName);
        Utils.validateName(email);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public static Customer of(String firstName, String lastName, String email) {
        return new Customer(firstName, lastName, email);
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) {
        Utils.validateName(firstName);
        this.firstName = firstName;
    }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) {
        Utils.validateName(lastName);
        this.lastName = lastName;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        Utils.validateName(email);
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{firstName='%s', lastName='%s', email='%s'}"
                .formatted(firstName, lastName, email);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        return Objects.equals(firstName, customer.firstName) &&
                Objects.equals(lastName, customer.lastName) &&
                Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email);
    }
}
