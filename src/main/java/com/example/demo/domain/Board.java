package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by NDS_047 on 2019-12-18.
 */
@Entity
@DynamicInsert
@Table(name = "board")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="b_id")
    private Integer b_id;

    @Column(name = "b_writer", nullable = false, length = 100)
    private String b_writer;

    @Column(name = "b_title", nullable = false, length = 100)
    private String b_title;

    @Column(name = "b_contents", nullable = false, length = 100)
    private String b_contents;

    @Column(name = "b_hits")
    private Integer b_hits;

    @Column(name = "b_recommend")
    private Integer b_recommend;

    @CreationTimestamp
    @Column(name = "b_created_date")
    private LocalDateTime b_created_date;

    @UpdateTimestamp
    @Column(name = "b_update_date")
    private  LocalDateTime b_update_date;

    public Integer getB_id() {
        return b_id;
    }

    public void setB_id(Integer b_id) {
        this.b_id = b_id;
    }

    public String getB_writer() {
        return b_writer;
    }

    public void setB_writer(String b_writer) {
        this.b_writer = b_writer;
    }

    public String getB_title() {
        return b_title;
    }

    public void setB_title(String b_title) {
        this.b_title = b_title;
    }

    public String getB_contents() {
        return b_contents;
    }

    public void setB_contents(String b_contents) {
        this.b_contents = b_contents;
    }

    public Integer getB_hits() {
        return b_hits;
    }

    public void setB_hits(Integer b_hits) {
        this.b_hits = b_hits;
    }

    public Integer getB_recommend() {
        return b_recommend;
    }

    public void setB_recommend(Integer b_recommend) {
        this.b_recommend = b_recommend;
    }

    public LocalDateTime getB_created_date() {
        return b_created_date;
    }

    public void setB_created_date(LocalDateTime b_created_date) {
        this.b_created_date = b_created_date;
    }

    public LocalDateTime getB_update_date() {
        return b_update_date;
    }

    public void setB_update_date(LocalDateTime b_update_date) {
        this.b_update_date = b_update_date;
    }
}
