package com.influence.graph.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Factacceuil {
    private long idacceuil;
    private String idtimeline;
    private String idsurv;
    private String idpost;
    private String idemp;
    private Long countcomment;
    private Long countlike;
    private Long idtmp;

    @Id
    @Column(name = "idacceuil")
    public long getIdacceuil() {
        return idacceuil;
    }

    public void setIdacceuil(long idacceuil) {
        this.idacceuil = idacceuil;
    }

    @Basic
    @Column(name = "idtimeline")
    public String getIdtimeline() {
        return idtimeline;
    }

    public void setIdtimeline(String idtimeline) {
        this.idtimeline = idtimeline;
    }

    @Basic
    @Column(name = "idsurv")
    public String getIdsurv() {
        return idsurv;
    }

    public void setIdsurv(String idsurv) {
        this.idsurv = idsurv;
    }

    @Basic
    @Column(name = "idpost")
    public String getIdpost() {
        return idpost;
    }

    public void setIdpost(String idpost) {
        this.idpost = idpost;
    }

    @Basic
    @Column(name = "idemp")
    public String getIdemp() {
        return idemp;
    }

    public void setIdemp(String idemp) {
        this.idemp = idemp;
    }

    @Basic
    @Column(name = "countcomment")
    public Long getCountcomment() {
        return countcomment;
    }

    public void setCountcomment(Long countcomment) {
        this.countcomment = countcomment;
    }

    @Basic
    @Column(name = "countlike")
    public Long getCountlike() {
        return countlike;
    }

    public void setCountlike(Long countlike) {
        this.countlike = countlike;
    }

    @Basic
    @Column(name = "idtmp")
    public Long getIdtmp() {
        return idtmp;
    }

    public void setIdtmp(Long idtmp) {
        this.idtmp = idtmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Factacceuil that = (Factacceuil) o;

        if (idacceuil != that.idacceuil) return false;
        if (idtimeline != null ? !idtimeline.equals(that.idtimeline) : that.idtimeline != null) return false;
        if (idsurv != null ? !idsurv.equals(that.idsurv) : that.idsurv != null) return false;
        if (idpost != null ? !idpost.equals(that.idpost) : that.idpost != null) return false;
        if (idemp != null ? !idemp.equals(that.idemp) : that.idemp != null) return false;
        if (countcomment != null ? !countcomment.equals(that.countcomment) : that.countcomment != null) return false;
        if (countlike != null ? !countlike.equals(that.countlike) : that.countlike != null) return false;
        if (idtmp != null ? !idtmp.equals(that.idtmp) : that.idtmp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idacceuil ^ (idacceuil >>> 32));
        result = 31 * result + (idtimeline != null ? idtimeline.hashCode() : 0);
        result = 31 * result + (idsurv != null ? idsurv.hashCode() : 0);
        result = 31 * result + (idpost != null ? idpost.hashCode() : 0);
        result = 31 * result + (idemp != null ? idemp.hashCode() : 0);
        result = 31 * result + (countcomment != null ? countcomment.hashCode() : 0);
        result = 31 * result + (countlike != null ? countlike.hashCode() : 0);
        result = 31 * result + (idtmp != null ? idtmp.hashCode() : 0);
        return result;
    }
}
