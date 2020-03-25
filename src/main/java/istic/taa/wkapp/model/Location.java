package istic.taa.wkapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Location {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;

    @OneToMany(mappedBy = "location", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<ActivityRegistration> activitiesRegistrations;

    public Location() {}

    public Location(@JsonProperty(value = "name", required = true) String name) {
        this.name = name;
        this.activitiesRegistrations = new ArrayList<>();
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public List<ActivityRegistration> getUsersRegistrations() {
        return activitiesRegistrations;
    }

    public void setUsersRegistrations(List<ActivityRegistration> people) {
        this.activitiesRegistrations = people;
    }
}

