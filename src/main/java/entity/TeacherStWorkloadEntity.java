package entity;

import javax.persistence.*;

@Entity(name="teacher_st_workload")
public class TeacherStWorkloadEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String postType;
    @Column
    private String postLevel;
    @Column
    private Float teachWorkload;
    @Column
    private Float researchWorkload;
    @Column
    private Float workloadTotal;
    @Column
    private String teachType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostLevel() {
        return postLevel;
    }

    public void setPostLevel(String postLevel) {
        this.postLevel = postLevel;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public Float getResearchWorkload() {
        return researchWorkload;
    }

    public void setResearchWorkload(Float researchWorkload) {
        this.researchWorkload = researchWorkload;
    }

    public String getTeachType() {
        return teachType;
    }

    public void setTeachType(String teachType) {
        this.teachType = teachType;
    }

    public Float getTeachWorkload() {
        return teachWorkload;
    }

    public void setTeachWorkload(Float teachWorkload) {
        this.teachWorkload = teachWorkload;
    }

    public Float getWorkloadTotal() {
        return workloadTotal;
    }

    public void setWorkloadTotal(Float workloadTotal) {
        this.workloadTotal = workloadTotal;
    }
}
