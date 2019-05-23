package entity;

import javax.persistence.*;

@Entity(name="user_info")
public class UserInfoEntity {
    @Id
    @Column(name = "teach_work_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teachWorkId;
    @Column(name = "teach_id")
    private Integer teachId;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "department_id")
    private Integer departmentId;
    @Column(name = "tell")
    private String tell;
    @Column(name = "is_admin")
    private Boolean isAdmin;
    @Column(name = "post_type")
    private String postType;
    @Column(name = "post_level")
    private String postLevel;


    public int getTeachWorkId() {
        return teachWorkId;
    }

    public void setTeachWorkId(int teachWorkId) {
        this.teachWorkId = teachWorkId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public Boolean isAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostLevel() {
        return postLevel;
    }

    public void setPostLevel(String postLevel) {
        this.postLevel = postLevel;
    }
}
