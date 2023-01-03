package com.example.Location.models;

import javax.persistence.*;

@Entity
public class Images {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String image;

    @Column(name = "IdDetail")
    Long idDetail;

    public Images(){}

    public Images(Integer id, String image, Long idDetail) {
        this.id = id;
        this.image = image;
        this.idDetail = idDetail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(Long idDetail) {
        this.idDetail = idDetail;
    }


}
