package entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "project_info")
public class ProjectInfoEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer projectId;
    @Column
    private Integer addTeachId;
    @Column
    private Date addTime;
    @Column
    private String projectName;
    @Column
    private Integer fristTeachId;
    @Column
    private Date projectTime;
    @Column
    private String teachResearchType;
    @Column
    private String projectType;
    @Column
    private String projectLevel;
    @Column
    private String schooll;
    @Column
    private String college;
    @Column
    private Float stWorkload;
    @Column
    private Float teamWorkload;
    @Column
    private Integer reviewerId;
    @Column
    private String reviewerName;
    @Column
    private Date reviewTime;
    @Column
    private Boolean reviewStatus;
    @Column
    private Date forTime;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getAddTeachId() {
        return addTeachId;
    }

    public void setAddTeachId(Integer addTeachId) {
        this.addTeachId = addTeachId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getFristTeachId() {
        return fristTeachId;
    }

    public void setFristTeachId(Integer fristTeachId) {
        this.fristTeachId = fristTeachId;
    }

    public Date getProjectTime() {
        return projectTime;
    }

    public void setProjectTime(Date projectTime) {
        this.projectTime = projectTime;
    }

    public String getTeachResearchType() {
        return teachResearchType;
    }

    public void setTeachResearchType(String teachResearchType) {
        this.teachResearchType = teachResearchType;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectLevel() {
        return projectLevel;
    }

    public void setProjectLevel(String projectLevel) {
        this.projectLevel = projectLevel;
    }

    public String getSchooll() {
        return schooll;
    }

    public void setSchooll(String schooll) {
        this.schooll = schooll;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
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

    public Integer getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Integer reviewerId) {
        this.reviewerId = reviewerId;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    public Boolean isReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Boolean reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public Date getForTime() {
        return forTime;
    }

    public void setForTime(Date forTime) {
        this.forTime = forTime;
    }
}
