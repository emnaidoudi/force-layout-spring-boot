package com.demo.lastika.model;

import java.io.Serializable;
import java.util.Objects;

public class IdLink implements Serializable {

    //which is the id of the employee (node)
    private String influencer;
    private String influenced;

    public IdLink(){

    }

    public IdLink(String influencer, String influenced) {
        this.influencer = influencer;
        this.influenced = influenced;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdLink idLink = (IdLink) o;
        return Objects.equals(influencer, idLink.influencer) &&
                Objects.equals(influenced, idLink.influenced);
    }

    @Override
    public int hashCode() {
        return Objects.hash(influencer, influenced);
    }
}
