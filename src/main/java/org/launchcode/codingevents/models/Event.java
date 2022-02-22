package org.launchcode.codingevents.models;

import javax.validation.constraints.*;
import java.util.Objects;


/**
 * Created by Chris Bay
 */
public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be at least 3 characters and no longer than 50 characters")
    private String name;

    @Size(max = 500, message = "Max description length is 500")
    private String description;

    @Email(message = "Invalid email")
    private String contactEmail;

    @NotBlank(message = "Location is required.")
    private String location;


    @Min(value=0, message = "Number of attendees is required.")
    private int numAttendees;

    @Positive(message = "Price must be positive")
    private double price;

    private boolean registrationRequired;

    private EventType type;


    public Event(String name, String description, String contactEmail, String location, boolean registrationRequired, int numAttendees, double price, EventType type) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.registrationRequired = registrationRequired;
        this.numAttendees = numAttendees;
        this.price = price;
        this.type = type;
    }

    // no-arg constructor
    public Event () {
        this.id = nextId;
        nextId++;
    }

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

    public int getId() {
        return id;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public Boolean getRegistrationRequired() {
        return registrationRequired;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRegistrationRequired(boolean registrationRequired) {
        this.registrationRequired = registrationRequired;
    }

    public int getNumAttendees() {
        return numAttendees;
    }

    public double getPrice() {
        return price;
    }

    public void setNumAttendees(int numAttendees) {
        this.numAttendees = numAttendees;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.name;
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
