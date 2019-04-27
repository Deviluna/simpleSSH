package entity;

import javax.persistence.*;

/**
 * 茶叶产地信息
 */
@Entity(name="tea_source")
public class TeaSourceEntity {
    private Integer id;
    private String tea_name,region,type,producer, detail;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column
    public String getTea_name() {
        return tea_name;
    }

    public void setTea_name(String tea_name) {
        this.tea_name = tea_name;
    }
    @Column
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    @Column
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Column
    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    @Column
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
