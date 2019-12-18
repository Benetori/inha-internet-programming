package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by NDS_047 on 2019-12-18.
 */
@Entity
@Table(name = "board")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="b_id")
    private Integer b_id;

    @Column(name = "b_writer", nullable = false, length = 100)
    private String b_writer;

    @Column(name = "b_contents", nullable = false, length = 100)
    private String b_title;

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
