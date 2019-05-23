package entity;

import javax.persistence.*;

@Entity(name="treatise_type")
public class TreatiseTypeEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int treatiseTypeId;
    @Column
    private String treatiseTypeName;
    @Column
    private Float stWorkload;
    @Column
    private Float teamWorkload;
    @Column
    private String treatiseType;

    public Float getStWorkload() {
        return stWorkload;
    }

    public void setStWorkload(Float stWorkload) {
        this.stWorkload = stWorkload;
    }

    public Float getTeamWorkload() {
        return teamWorkload;
    }

    public void setTeamWorkload(Float teamWorkload) {
        this.teamWorkload = teamWorkload;
    }

    public String getTreatiseType() {
        return treatiseType;
    }

    public void setTreatiseType(String treatiseType) {
        this.treatiseType = treatiseType;
    }

    public int getTreatiseTypeId() {
        return treatiseTypeId;
    }

    public void setTreatiseTypeId(int treatiseTypeId) {
        this.treatiseTypeId = treatiseTypeId;
    }

    public String getTreatiseTypeName() {
        return treatiseTypeName;
    }

    public void setTreatiseTypeName(String treatiseTypeName) {
        this.treatiseTypeName = treatiseTypeName;
    }
}
