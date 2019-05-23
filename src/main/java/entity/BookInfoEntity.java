package entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name="book_info")
public class BookInfoEntity {
    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    @Column(name = "add_teach_id")
    private Integer addTeachId;
    @Column(name = "add_name")
    private String addName;
    @Column(name = "add_time")
    private Date addTime;
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "author_name")
    private String authorName;
    @Column(name = "publish_time")
    private Date publishTime;
    @Column(name = "publish_name")
    private String publishName;
    @Column(name = "publish_type")
    private String publishType;
    @Column(name = "word_total")
    private Float wordTotal;
    @Column(name = "post")
    private String post;
    @Column(name = "book_workload")
    private Float bookWorkload;
    @Column(name = "reviewer_id")
    private Integer reviewerId;
    @Column(name = "reviewer_name")
    private String reviewerName;
    @Column(name = "review_time")
    private Date reviewTime;
    @Column(name = "review_status")
    private Boolean reviewStatus;
    @Column(name = "for_time")
    private Date forTime;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Integer getAddTeachId() {
        return addTeachId;
    }

    public void setAddTeachId(Integer addTeachId) {
        this.addTeachId = addTeachId;
    }

    public String getAddName() {
        return addName;
    }

    public void setAddName(String addName) {
        this.addName = addName;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }

    public String getPublishType() {
        return publishType;
    }

    public void setPublishType(String publishType) {
        this.publishType = publishType;
    }

    public Float getWordTotal() {
        return wordTotal;
    }

    public void setWordTotal(Float wordTotal) {
        this.wordTotal = wordTotal;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Float getBookWorkload() {
        return bookWorkload;
    }

    public void setBookWorkload(Float bookWorkload) {
        this.bookWorkload = bookWorkload;
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
