package entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "reword_teacher")
public class RewordTeacherEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rewardId;
    @Column
    private Integer addTeachId;
    @Column
    private Date addTime;
    @Column
    private String successfulName;
    @Column
    private String rewardType;
    @Column
    private String rewardLevel;
    @Column
    private String completeTeach;
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

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getCompleteTeach() {
        return completeTeach;
    }

    public void setCompleteTeach(String completeTeach) {
        this.completeTeach = completeTeach;
    }

    public Date getForTime() {
        return forTime;
    }

    public void setForTime(Date forTime) {
        this.forTime = forTime;
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

    public Boolean isReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Boolean reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    public int getRewardId() {
        return rewardId;
    }

    public void setRewardId(int rewardId) {
        this.rewardId = rewardId;
    }

    public String getRewardLevel() {
        return rewardLevel;
    }

    public void setRewardLevel(String rewardLevel) {
        this.rewardLevel = rewardLevel;
    }

    public String getRewardType() {
        return rewardType;
    }

    public void setRewardType(String rewardType) {
        this.rewardType = rewardType;
    }

    public Float getStWorkload() {
        return stWorkload;
    }

    public void setStWorkload(Float stWorkload) {
        this.stWorkload = stWorkload;
    }

    public String getSuccessfulName() {
        return successfulName;
    }

    public void setSuccessfulName(String successfulName) {
        this.successfulName = successfulName;
    }

    public Float getTeamWorkload() {
        return teamWorkload;
    }

    public void setTeamWorkload(Float teamWorkload) {
        this.teamWorkload = teamWorkload;
    }
}
