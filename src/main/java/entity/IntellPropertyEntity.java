package entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name="intell_property")
public class IntellPropertyEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int intellPropertyId;
    @Column
    private Integer addTeachId;
    @Column
    private Date addTime;
    @Column
    private String intellPropertyName;
    @Column
    private String completeTeach;
    @Column
    private Date authorizationTime;
    @Column
    private String school;
    @Column
    private String intellPType;
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

    public int getIntellPropertyId() {
        return intellPropertyId;
    }

    public void setIntellPropertyId(int intellPropertyId) {
        this.intellPropertyId = intellPropertyId;
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

    public String getIntellPropertyName() {
        return intellPropertyName;
    }

    public void setIntellPropertyName(String intellPropertyName) {
        this.intellPropertyName = intellPropertyName;
    }

    public String getCompleteTeach() {
        return completeTeach;
    }

    public void setCompleteTeach(String completeTeach) {
        this.completeTeach = completeTeach;
    }

    public Date getAuthorizationTime() {
        return authorizationTime;
    }

    public void setAuthorizationTime(Date authorizationTime) {
        this.authorizationTime = authorizationTime;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getIntellPType() {
        return intellPType;
    }

    public void setIntellPType(String intellPType) {
        this.intellPType = intellPType;
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
