package entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "treatise_info" )
public class TreatiseInfoEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int treatiseId;
    @Column
    private Integer addTeachId;
    @Column
    private String addName;
    @Column
    private Date addTime;
    @Column
    private String treatiseName;
    @Column
    private String allauthor;
    @Column
    private Date publishTime;
    @Column
    private String publication;
    @Column
    private String issn;
    @Column
    private String journalType;
    @Column
    private String schooll;
    @Column
    private String college;
    @Column
    private String treatiseLeavel;
    @Column
    private String stWorkload;
    @Column
    private String teamWorkload;
    @Column
    private String correspondAuthor;
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

    public String getAddName() {
        return addName;
    }

    public void setAddName(String addName) {
        this.addName = addName;
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

    public String getAllauthor() {
        return allauthor;
    }

    public void setAllauthor(String allauthor) {
        this.allauthor = allauthor;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getCorrespondAuthor() {
        return correspondAuthor;
    }

    public void setCorrespondAuthor(String correspondAuthor) {
        this.correspondAuthor = correspondAuthor;
    }

    public Date getForTime() {
        return forTime;
    }

    public void setForTime(Date forTime) {
        this.forTime = forTime;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getJournalType() {
        return journalType;
    }

    public void setJournalType(String journalType) {
        this.journalType = journalType;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
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

    public String getSchooll() {
        return schooll;
    }

    public void setSchooll(String schooll) {
        this.schooll = schooll;
    }

    public String getStWorkload() {
        return stWorkload;
    }

    public void setStWorkload(String stWorkload) {
        this.stWorkload = stWorkload;
    }

    public String getTeamWorkload() {
        return teamWorkload;
    }

    public void setTeamWorkload(String teamWorkload) {
        this.teamWorkload = teamWorkload;
    }

    public int getTreatiseId() {
        return treatiseId;
    }

    public void setTreatiseId(int treatiseId) {
        this.treatiseId = treatiseId;
    }

    public String getTreatiseLeavel() {
        return treatiseLeavel;
    }

    public void setTreatiseLeavel(String treatiseLeavel) {
        this.treatiseLeavel = treatiseLeavel;
    }

    public String getTreatiseName() {
        return treatiseName;
    }

    public void setTreatiseName(String treatiseName) {
        this.treatiseName = treatiseName;
    }
}
