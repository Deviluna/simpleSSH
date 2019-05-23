package entity;

import javax.persistence.*;

@Entity(name = "paper_type")
public class PaperTypeEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int newTypeId;
    @Column
    private String newTypeName;
    @Column
    private Float stWorkload;

    public int getNewTypeId() {
        return newTypeId;
    }

    public void setNewTypeId(int newTypeId) {
        this.newTypeId = newTypeId;
    }

    public String getNewTypeName() {
        return newTypeName;
    }

    public void setNewTypeName(String newTypeName) {
        this.newTypeName = newTypeName;
    }

    public Float getStWorkload() {
        return stWorkload;
    }

    public void setStWorkload(Float stWorkload) {
        this.stWorkload = stWorkload;
    }
}
