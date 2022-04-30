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
    @Column(name = "last_name")
    private String lastName;
    private String phone;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rol_id")
    private RolModel rol;

    public PersonModel() {

    }
    public PersonModel(String name, String lastName, String phone) {
        this.setName(name);
        this.setLastName(lastName);
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public RolModel getRol() {
        return rol;
    }

    public void setRol(RolModel rol) {
        this.rol = rol;
    }
}
