package com.influence.graph.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dimemployee {
    private String idemp;
    private String civility;
    private String sexe;
    private String firstname;
    private String lastname;
    private String organizationentity;
    private String position;
    private String site;
    private String job;
    private String leavereason;

    @Id
    @Column(name = "idemp")
    public String getIdemp() {
        return idemp;
    }

    public void setIdemp(String idemp) {
        this.idemp = idemp;
    }

    @Basic
    @Column(name = "civility")
    public String getCivility() {
        return civility;
    }

    public void setCivility(String civility) {
        this.civility = civility;
    }

    @Basic
    @Column(name = "sexe")
    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    @Basic
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "organizationentity")
    public String getOrganizationentity() {
        return organizationentity;
    }

    public void setOrganizationentity(String organizationentity) {
        this.organizationentity = organizationentity;
    }

    @Basic
    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "site")
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Basic
    @Column(name = "job")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    @JsonIgnore
    @Basic
    @Column(name = "leavereason")
    public String getLeavereason() {
        return leavereason;
    }

    public void setLeavereason(String leavereason) {
        this.leavereason = leavereason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dimemployee that = (Dimemployee) o;

        if (idemp != null ? !idemp.equals(that.idemp) : that.idemp != null) return false;
        if (civility != null ? !civility.equals(that.civility) : that.civility != null) return false;
        if (sexe != null ? !sexe.equals(that.sexe) : that.sexe != null) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (organizationentity != null ? !organizationentity.equals(that.organizationentity) : that.organizationentity != null)
            return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (site != null ? !site.equals(that.site) : that.site != null) return false;
        if (job != null ? !job.equals(that.job) : that.job != null) return false;
        if (leavereason != null ? !leavereason.equals(that.leavereason) : that.leavereason != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idemp != null ? idemp.hashCode() : 0;
        result = 31 * result + (civility != null ? civility.hashCode() : 0);
        result = 31 * result + (sexe != null ? sexe.hashCode() : 0);
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (organizationentity != null ? organizationentity.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (site != null ? site.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (leavereason != null ? leavereason.hashCode() : 0);
        return result;
    }
}
