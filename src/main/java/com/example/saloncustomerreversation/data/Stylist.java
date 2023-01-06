package com.example.saloncustomerreversation.data;

import jakarta.persistence.*;

@Entity
@Table(name="STYLIST")
public class Stylist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="STYLIST_ID")
    private long id;

    @Column(name="NAME")
    private String stylistName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStylistName() {
        return stylistName;
    }

    public void setStylistName(String stylistName) {
        this.stylistName = stylistName;
    }
}
