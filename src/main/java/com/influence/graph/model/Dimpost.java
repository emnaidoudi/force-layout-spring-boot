package com.influence.graph.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dimpost {
    private String idpost;
    private String posttype;
    private String body;

    @Id
    @Column(name = "idpost")
    public String getIdpost() {
        return idpost;
    }

    public void setIdpost(String idpost) {
        this.idpost = idpost;
    }

    @Basic
    @Column(name = "posttype")
    public String getPosttype() {
        return posttype;
    }

    public void setPosttype(String posttype) {
        this.posttype = posttype;
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

        Dimpost dimpost = (Dimpost) o;

        if (idpost != null ? !idpost.equals(dimpost.idpost) : dimpost.idpost != null) return false;
        if (posttype != null ? !posttype.equals(dimpost.posttype) : dimpost.posttype != null) return false;
        if (body != null ? !body.equals(dimpost.body) : dimpost.body != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idpost != null ? idpost.hashCode() : 0;
        result = 31 * result + (posttype != null ? posttype.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        return result;
    }
}
