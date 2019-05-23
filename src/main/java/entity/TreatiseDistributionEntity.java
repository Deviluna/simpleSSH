package entity;

import javax.persistence.*;

@Entity(name="treatise_distribution")
public class TreatiseDistributionEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private Integer treatiseId;
    @Column
    private Integer teachId;
    @Column
    private String name;
    @Column
    private Float workload;
    @Column
    private String college;
    @Column
    private Boolean isFrist;
    @Column
    private String workType;

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean isFrist() {
        return isFrist;
    }

    public void setIsFrist(Boolean isFrist) {
        this.isFrist = isFrist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTeachId() {
        return teachId;
    }

    public void setTeachId(Integer teachId) {
        this.teachId = teachId;
    }

    public Integer getTreatiseId() {
        return treatiseId;
    }

    public void setTreatiseId(Integer treatiseId) {
        this.treatiseId = treatiseId;
    }

    public Float getWorkload() {
        return workload;
    }

    public void setWorkload(Float workload) {
        this.workload = workload;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }
}
