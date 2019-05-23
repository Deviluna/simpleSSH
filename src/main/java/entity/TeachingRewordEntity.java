package entity;

import javax.persistence.*;

@Entity(name="teaching_reword")
public class TeachingRewordEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rewardTypeId;
    @Column
    private String rewardTypeName;
    @Column
    private Float stWorkload;
    @Column
    private Float teamWorkload;
    @Column
    private String rewardType;

    public String getRewardType() {
        return rewardType;
    }

    public void setRewardType(String rewardType) {
        this.rewardType = rewardType;
    }

    public int getRewardTypeId() {
        return rewardTypeId;
    }

    public void setRewardTypeId(int rewardTypeId) {
        this.rewardTypeId = rewardTypeId;
    }

    public String getRewardTypeName() {
        return rewardTypeName;
    }

    public void setRewardTypeName(String rewardTypeName) {
        this.rewardTypeName = rewardTypeName;
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
}
