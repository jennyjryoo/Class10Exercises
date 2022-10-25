package org.launchcode.codingevents.models;

import javax.validation.constraints.*;
import java.util.Objects;

public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message="Name must not be blank.")
    @Size(min = 3, max = 50, message = "Name must be 3-50 characters.")
    private String name;

    @Size (max = 500, message = "Description must be less than 500 characters.")
    private String description;

    @NotBlank(message = "Please enter a location.")
    @NotNull(message = "Enter a valid location.")
    @Size(min = 10, max = 500, message = "Please enter a address between 10-500 characters.")
    private String address;

    @NotBlank(message="Email must not be blank.")
    @Email(message = "Please enter a valid email.")
    private String contactEmail;

    @NotNull
    private Boolean registration;

    @Min(value = 1, message = "There must be at least 1 attendant.")
    private int attendants;

    public Event(String name, String description, String contactEmail, String address) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.address = address;
        this.id = nextId;
        nextId++;
    }

    public Event() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getRegistration() {
        return registration;
    }

    public void setRegistration(Boolean registration) {
        this.registration = registration;
    }

    public int getAttendants() {
        return attendants;
    }

    public void setAttendants(int attendants) {
        this.attendants = attendants;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
