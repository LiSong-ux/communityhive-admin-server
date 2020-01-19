package net.industryhive.bean;

import java.util.Date;

public class Notice {
    private Integer id;

    private Integer userId;

    private Date submittime;

    private String label;

    private String title;

    private Integer position;

    private Integer viewcount;

    private Boolean locked;

    private Boolean hided;

    private Boolean deleted;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getSubmittime() {
        return submittime;
    }

    public void setSubmittime(Date submittime) {
        this.submittime = submittime;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getViewcount() {
        return viewcount;
    }

    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Boolean getHided() {
        return hided;
    }

    public void setHided(Boolean hided) {
        this.hided = hided;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}