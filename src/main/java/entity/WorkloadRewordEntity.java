package entity;

import javax.persistence.*;

@Entity(name="workload_reword")
public class WorkloadRewordEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private Integer rewardId;
    @Column
    private Integer teachId;
    @Column
    private String name;
    @Column
    private Float workload;
    @Column
    private String department;
    @Column
    private Boolean isFrist;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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

    public Integer getRewardId() {
        return rewardId;
    }

    public void setRewardId(Integer rewardId) {
        this.rewardId = rewardId;
    }

    public Integer getTeachId() {
        return teachId;
    }

    public void setTeachId(Integer teachId) {
        this.teachId = teachId;
    }

    public Float getWorkload() {
        return workload;
    }

    public void setWorkload(Float workload) {
        this.workload = workload;
    }
}
