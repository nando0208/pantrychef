package com.pantrychef.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import java.math.BigDecimal;
import java.util.List;

@Entity(name="measures")
@Inheritance
@DiscriminatorColumn(name = "TYPE")
public class MeasureTO extends BaseTO {
    String name;
    String abbreviation;

    public MeasureTO(String name, String abbreviation, String code) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.code = code;
    }

    public MeasureTO() {}

    String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}