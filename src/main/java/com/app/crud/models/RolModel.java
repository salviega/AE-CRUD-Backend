package com.app.crud.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rol")
public class RolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @Column(name = "rol_name")
    private String rolName;
    private String description;
    @OneToMany(mappedBy = "rol", cascade = {CascadeType.ALL})
    private List<PersonModel> people;

    public RolModel() {

    }
    public RolModel(String rolName, String description) {
        this.setRolName(rolName);
        this.setDescription(description);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PersonModel> getPeople() {
        return people;
    }

    public void setPeople(List<PersonModel> people) {
        this.people = people;
    }
}
