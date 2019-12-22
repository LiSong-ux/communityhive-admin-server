package net.industryhive.bean;

import java.util.Date;

public class Access {
    private Integer id;

    private Integer total;

    private Integer pc;

    private Integer android;

    private Integer ios;

    private Integer others;

    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPc() {
        return pc;
    }

    public void setPc(Integer pc) {
        this.pc = pc;
    }

    public Integer getAndroid() {
        return android;
    }

    public void setAndroid(Integer android) {
        this.android = android;
    }

    public Integer getIos() {
        return ios;
    }

    public void setIos(Integer ios) {
        this.ios = ios;
    }

    public Integer getOthers() {
        return others;
    }

    public void setOthers(Integer others) {
        this.others = others;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}