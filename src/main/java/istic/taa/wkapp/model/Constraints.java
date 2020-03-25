package istic.taa.wkapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Constraints {

    @Id
    @GeneratedValue
    private Long id;

    private Double seaLevelMin;
    private Double seaLevelMax;
    private Double windSpeedMin;
    private Double windSpeedMax;
    private Boolean rainAccepted;
    private Boolean sunNecessary;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userRegistration_id")
    private ActivityRegistration userRegistration;

    public Constraints(){
        this.seaLevelMin = 0.0;
        this.seaLevelMax = 0.0;
        this.windSpeedMin = 0.0;
        this.windSpeedMax = 0.0;
        this.rainAccepted = false;
        this.sunNecessary = true;
    }

    public Constraints(ActivityRegistration userRegistration) {
        this.seaLevelMin = 0.0;
        this.seaLevelMax = 0.0;
        this.windSpeedMin = 0.0;
        this.windSpeedMax = 0.0;
        this.rainAccepted = false;
        this.sunNecessary = true;
        this.userRegistration = userRegistration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Boolean getRainAccepted() {
        return rainAccepted;
    }

    public void setRainAccepted(Boolean rainAccepted) {
        this.rainAccepted = rainAccepted;
    }

    public Boolean getSunNecessary() {
        return this.sunNecessary;
    }

    public void setSunNecessary(Boolean sunNecessary) {
        this.sunNecessary = sunNecessary;
    }

    public Double getSeaLevelMin() {
        return seaLevelMin;
    }

    public void setSeaLevelMin(Double seaLevelMin) {
        this.seaLevelMin = seaLevelMin;
    }

    public Double getSeaLevelMax() {
        return seaLevelMax;
    }

    public void setSeaLevelMax(Double seaLevelMax) {
        this.seaLevelMax = seaLevelMax;
    }

    public Double getWindSpeedMin() {
        return windSpeedMin;
    }

    public void setWindSpeedMin(Double windSpeedMin) {
        this.windSpeedMin = windSpeedMin;
    }

    public Double getWindSpeedMax() {
        return windSpeedMax;
    }

    public void setWindSpeedMax(Double windSpeedMax) {
        this.windSpeedMax = windSpeedMax;
    }

    public ActivityRegistration getUserRegistration() {
        return userRegistration;
    }

    public void setUserRegistration(ActivityRegistration userRegistration) {
        this.userRegistration = userRegistration;
    }
}
