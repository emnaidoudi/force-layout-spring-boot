package com.influence.graph.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dimcommentaire {
    private String idcom;
    private String body;

    @Id
    @Column(name = "idcom")
    public String getIdcom() {
        return idcom;
    }

    public void setIdcom(String idcom) {
        this.idcom = idcom;
    }

    @Basic
    @Column(name = "body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dimcommentaire that = (Dimcommentaire) o;

        if (idcom != null ? !idcom.equals(that.idcom) : that.idcom != null) return false;
        if (body != null ? !body.equals(that.body) : that.body != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idcom != null ? idcom.hashCode() : 0;
        result = 31 * result + (body != null ? body.hashCode() : 0);
        return result;
    }
}
