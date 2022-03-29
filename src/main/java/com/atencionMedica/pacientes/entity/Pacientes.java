package com.atencionMedica.pacientes.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Pacientes {
    @Id
    private Integer id;
    private String name;
    private Date birthday;
    private SignosVitales signos;

    public Pacientes() {
    }

    public Pacientes(Integer id, String name, Date birthday, SignosVitales signos) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.signos = signos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public SignosVitales getSignos() {
        return signos;
    }

    public void setSignos(SignosVitales signos) {
        this.signos = signos;
    }

    @Override
    public String toString() {
        return "Pacientes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", signos=" + signos +
                '}';
    }
}
