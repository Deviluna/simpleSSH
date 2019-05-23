package entity;

import javax.persistence.*;

@Entity(name = "intell_property_type")
public class IntellPropertyTypeEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int intellPTypeId;
    @Column
    private String intellPTypeName;
    @Column
    private Float stWorkload;
    @Column
    private Float teamWorkload;
    @Column
    private String intellPType;

    public int getIntellPTypeId() {
        return intellPTypeId;
    }

    public void setIntellPTypeId(int intellPTypeId) {
        this.intellPTypeId = intellPTypeId;
    }

    public String getIntellPTypeName() {
        return intellPTypeName;
    }

    public void setIntellPTypeName(String intellPTypeName) {
        this.intellPTypeName = intellPTypeName;
    }

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

    public String getIntellPType() {
        return intellPType;
    }

    public void setIntellPType(String intellPType) {
        this.intellPType = intellPType;
    }
}
