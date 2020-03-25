package istic.taa.wkapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<ActivityRegistration> activitiesRegistrations;

    public User(){}

    public User(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.activitiesRegistrations = new ArrayList<>();
    }

    /** Accessors **/

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<ActivityRegistration> getActivitiesRegistrations() {
        return activitiesRegistrations;
    }

    public void setActivitiesRegistrations(List<ActivityRegistration> activitiesRegistrations) {
        this.activitiesRegistrations = activitiesRegistrations;
    }

    @Override
    public String toString() {
        String activitiesString = "";
        for (ActivityRegistration activityRegistration: activitiesRegistrations) {
            activitiesString += "[" + activityRegistration.getActivity().getName() + " at " + activityRegistration.getLocation().getName() + "]";
        }
        return "User [id=" + id + ", name=" + name + ", activities= " + activitiesString + "]";
    }
}

