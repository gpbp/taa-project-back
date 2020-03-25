package istic.taa.wkapp.model;

import javax.persistence.*;

@Entity
public class ActivityRegistration {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private User user;
    @ManyToOne
    private Location location;
    @ManyToOne
    private Activity activity;

    @OneToOne(mappedBy = "userRegistration", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private Constraints constraints;

    public ActivityRegistration(User user, Activity activity, Location location) {
        this.user = user;
        this.activity = activity;
        this.location = location;
    }

    public ActivityRegistration(User user, Activity activity, Location location, Constraints constraints) {
        this.user = user;
        this.activity = activity;
        this.location = location;
        this.constraints = constraints;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Activity getActivity() { return activity; }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Constraints getConstraints() {
        return constraints;
    }

    public void setConstraints(Constraints constraints) {
        if (constraints == null) {
            if (this.constraints != null) {
                this.constraints.setUserRegistration(null);
            }
        }
        else {
            constraints.setUserRegistration(this);
        }
        this.constraints = constraints;
    }
}

