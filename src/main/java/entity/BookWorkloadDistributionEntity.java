package entity;

import javax.persistence.*;

@Entity(name="book_workload_distribution")
public class BookWorkloadDistributionEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "book_id")
    private Integer bookId;
    @Column(name = "teach_id")
    private Integer teachId;
    @Column(name = "name")
    private String name;
    @Column(name = "word_count")
    private Float wordCount;
    @Column(name = "word_unit")
    private String wordUnit;
    @Column(name = "workload")
    private Float workload;
    @Column(name = "work_type")
    private String workType;
    @Column(name = "department")
    private String department;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
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

    public Float getWordCount() {
        return wordCount;
    }

    public void setWordCount(Float wordCount) {
        this.wordCount = wordCount;
    }

    public String getWordUnit() {
        return wordUnit;
    }

    public void setWordUnit(String wordUnit) {
        this.wordUnit = wordUnit;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
