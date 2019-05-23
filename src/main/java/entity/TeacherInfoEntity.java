package entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name="teacher_info")
public class TeacherInfoEntity {
    @Id
    @Column(name = "teach_work_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teachWorkId;
    @Column(name = "teach_id")
    private Integer teachId;
    @Column(name = "name")
    private String name;
    @Column(name = "department_id")
    private Integer departmentId;
    @Column(name = "tell")
    private String tell;
    @Column(name = "post_type")
    private String postType;
    @Column(name = "post_level")
    private String postLevel;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "education")
    private String education;
    @Column(name = "science")
    private String science;
    @Column(name = "university")
    private String university;
    @Column(name = "political")
    private String political;
    @Column(name = "teach_quali_id")
    private String teachQualiId;
    @Column(name = "id_number")
    private String idNumber;
    @Column(name = "remakes")
    private String remakes;
    @Column(name = "now_post")
    private String nowPost;
    @Column(name = "nowpost_level")
    private String nowpostLevel;
    @Column(name = "past_post")
    private String pastPost;
    @Column(name = "past_post_level")
    private String pastPostLevel;
    @Column(name = "profes_tech_post")
    private String profesTechPost;
    @Column(name = "contract_id")
    private String contractId;
    @Column(name = "post_status_remakes")
    private String postStatusRemakes;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNowPost() {
        return nowPost;
    }

    public void setNowPost(String nowPost) {
        this.nowPost = nowPost;
    }

    public String getNowpostLevel() {
        return nowpostLevel;
    }

    public void setNowpostLevel(String nowpostLevel) {
        this.nowpostLevel = nowpostLevel;
    }

    public String getPastPost() {
        return pastPost;
    }

    public void setPastPost(String pastPost) {
        this.pastPost = pastPost;
    }

    public String getPastPostLevel() {
        return pastPostLevel;
    }

    public void setPastPostLevel(String pastPostLevel) {
        this.pastPostLevel = pastPostLevel;
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political;
    }

    public String getPostLevel() {
        return postLevel;
    }

    public void setPostLevel(String postLevel) {
        this.postLevel = postLevel;
    }

    public String getPostStatusRemakes() {
        return postStatusRemakes;
    }

    public void setPostStatusRemakes(String postStatusRemakes) {
        this.postStatusRemakes = postStatusRemakes;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getProfesTechPost() {
        return profesTechPost;
    }

    public void setProfesTechPost(String profesTechPost) {
        this.profesTechPost = profesTechPost;
    }

    public String getRemakes() {
        return remakes;
    }

    public void setRemakes(String remakes) {
        this.remakes = remakes;
    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }

    public Integer getTeachId() {
        return teachId;
    }

    public void setTeachId(Integer teachId) {
        this.teachId = teachId;
    }

    public String getTeachQualiId() {
        return teachQualiId;
    }

    public void setTeachQualiId(String teachQualiId) {
        this.teachQualiId = teachQualiId;
    }

    public int getTeachWorkId() {
        return teachWorkId;
    }

    public void setTeachWorkId(int teachWorkId) {
        this.teachWorkId = teachWorkId;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
