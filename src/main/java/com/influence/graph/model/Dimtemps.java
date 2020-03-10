package com.influence.graph.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Dimtemps {
    private Timestamp date;
    private String year;
    private String month;
    private String day;
    private String hour;
    private String min;
    private String second;
    private long idtmp;

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "year")
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Basic
    @Column(name = "month")
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Basic
    @Column(name = "day")
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Basic
    @Column(name = "hour")
    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    @Basic
    @Column(name = "min")
    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    @Basic
    @Column(name = "second")
    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    @Id
    @Column(name = "idtmp")
    public long getIdtmp() {
        return idtmp;
    }

    public void setIdtmp(long idtmp) {
        this.idtmp = idtmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dimtemps dimtemps = (Dimtemps) o;

        if (idtmp != dimtemps.idtmp) return false;
        if (date != null ? !date.equals(dimtemps.date) : dimtemps.date != null) return false;
        if (year != null ? !year.equals(dimtemps.year) : dimtemps.year != null) return false;
        if (month != null ? !month.equals(dimtemps.month) : dimtemps.month != null) return false;
        if (day != null ? !day.equals(dimtemps.day) : dimtemps.day != null) return false;
        if (hour != null ? !hour.equals(dimtemps.hour) : dimtemps.hour != null) return false;
        if (min != null ? !min.equals(dimtemps.min) : dimtemps.min != null) return false;
        if (second != null ? !second.equals(dimtemps.second) : dimtemps.second != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = date != null ? date.hashCode() : 0;
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (month != null ? month.hashCode() : 0);
        result = 31 * result + (day != null ? day.hashCode() : 0);
        result = 31 * result + (hour != null ? hour.hashCode() : 0);
        result = 31 * result + (min != null ? min.hashCode() : 0);
        result = 31 * result + (second != null ? second.hashCode() : 0);
        result = 31 * result + (int) (idtmp ^ (idtmp >>> 32));
        return result;
    }
}
