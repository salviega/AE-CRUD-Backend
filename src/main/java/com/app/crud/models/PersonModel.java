package com.app.crud.models;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class PersonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String name;
    private String last_name;
    private String phone;

    public PersonModel() {

    }
    public PersonModel(Long id, String name, String last_name, String phone) {
        this.setId(id);
        this.setName(name);
        this.setLast_name(last_name);
        this.setPhone(phone);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
