package ua.util;

import java.util.Objects;

public class Supplier {
    private String name;
    private String contactInfo;

    // Конструктор
    public Supplier(String name, String contactInfo) {
        Utils.validateName(name);
        Utils.validateName(contactInfo);
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Factory-метод
    public static Supplier of(String name, String contactInfo) {
        return new Supplier(name, contactInfo);
    }

    // Getters/Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        Utils.validateName(name);
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        Utils.validateName(contactInfo);
        this.contactInfo = contactInfo;
    }

    // toString
    @Override
    public String toString() {
        return "Supplier{name='%s', contactInfo='%s'}".formatted(name, contactInfo);
    }

    // equals & hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Supplier supplier)) return false;
        return Objects.equals(name, supplier.name) &&
                Objects.equals(contactInfo, supplier.contactInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contactInfo);
    }
}
