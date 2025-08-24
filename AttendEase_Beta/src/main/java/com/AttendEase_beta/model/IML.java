package com.AttendEase_beta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "IML")
@Getter
@Setter
public class IML {
    @Id
    private Integer regno;

    private String sec;

    private String serial;

    private Integer total;

    private Integer present;

    public Integer getRegno() {
        return regno;
    }

    public void setRegno(Integer regno) {
        this.regno = regno;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPresent() {
        return present;
    }

    public void setPresent(Integer present) {
        this.present = present;
    }
}
