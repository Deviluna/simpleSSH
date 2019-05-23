package entity;

import javax.persistence.*;

@Entity(name="intell_property_distribution")
public class IntellPropertyDistributionEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "intell_property")
    private String intellProperty;
    @Column(name = "teach_id")
    private Integer teachId;
    @Column(name = "name")
    private String name;
    @Column(name = "workload")
    private Float workload;
    @Column(name = "department")
    private String department;
    @Column(name = "is_frist")
    private Boolean isFrist;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntellProperty() {
        return intellProperty;
    }

    public void setIntellProperty(String intellProperty) {
        this.intellProperty = intellProperty;
    }

    public Integer getTeachId() {
        return teachId;
    }

    public void setTeachId(Integer teachId) {
        this.teachId = teachId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getWorkload() {
        return workload;
    }

    public void setWorkload(Float workload) {
        this.workload = workload;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Boolean isFrist() {
        return isFrist;
    }

    public void setIsFrist(Boolean isFrist) {
        this.isFrist = isFrist;
    }
}
