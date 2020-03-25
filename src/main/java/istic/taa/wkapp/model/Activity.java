package istic.taa.wkapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Activity {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;


    public Activity() {}

    public Activity(@JsonProperty(value = "name", required = true) String name) {
        this.name = name;
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

}

