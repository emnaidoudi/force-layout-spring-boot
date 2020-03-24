package com.influence.graph.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Factinteract {
    private long idinteract;
    private String idcom;
    private String idsurv;
    private String idpost;
    private String idemp;
    private Long idtmp;
    private String idreact;

    @Id
    @Column(name = "idinteract")
    public long getIdinteract() {
        return idinteract;
    }

    public void setIdinteract(long idinteract) {
        this.idinteract = idinteract;
    }

    @Basic
    @Column(name = "idcom")
    public String getIdcom() {
        return idcom;
    }

    public void setIdcom(String idcom) {
        this.idcom = idcom;
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
    @Column(name = "idtmp")
    public Long getIdtmp() {
        return idtmp;
    }

    public void setIdtmp(Long idtmp) {
        this.idtmp = idtmp;
    }

    @Basic
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

        Factinteract that = (Factinteract) o;

        if (idinteract != that.idinteract) return false;
        if (idcom != null ? !idcom.equals(that.idcom) : that.idcom != null) return false;
        if (idsurv != null ? !idsurv.equals(that.idsurv) : that.idsurv != null) return false;
        if (idpost != null ? !idpost.equals(that.idpost) : that.idpost != null) return false;
        if (idemp != null ? !idemp.equals(that.idemp) : that.idemp != null) return false;
        if (idtmp != null ? !idtmp.equals(that.idtmp) : that.idtmp != null) return false;
        if (idreact != null ? !idreact.equals(that.idreact) : that.idreact != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idinteract ^ (idinteract >>> 32));
        result = 31 * result + (idcom != null ? idcom.hashCode() : 0);
        result = 31 * result + (idsurv != null ? idsurv.hashCode() : 0);
        result = 31 * result + (idpost != null ? idpost.hashCode() : 0);
        result = 31 * result + (idemp != null ? idemp.hashCode() : 0);
        result = 31 * result + (idtmp != null ? idtmp.hashCode() : 0);
        result = 31 * result + (idreact != null ? idreact.hashCode() : 0);
        return result;
    }
}
