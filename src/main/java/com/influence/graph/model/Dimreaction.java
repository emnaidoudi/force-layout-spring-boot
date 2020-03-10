package com.influence.graph.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dimreaction {
    private String idreact;

    @Id
    @Column(name = "idreact")
    public String getIdreact() {
        return idreact;
    }

    public void setIdreact(String idreact) {
        this.idreact = idreact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dimreaction that = (Dimreaction) o;

        if (idreact != null ? !idreact.equals(that.idreact) : that.idreact != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idreact != null ? idreact.hashCode() : 0;
    }
}
