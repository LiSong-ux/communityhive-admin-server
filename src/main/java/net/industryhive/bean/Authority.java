package net.industryhive.bean;

public class Authority {
    private Integer id;

    private Boolean banaccount;

    private Boolean bansubmittopic;

    private Boolean bansubmitreply;

    private Boolean banmessage;

    private Boolean deletetopic;

    private Boolean deletereply;

    private Boolean locktopic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getBanaccount() {
        return banaccount;
    }

    public void setBanaccount(Boolean banaccount) {
        this.banaccount = banaccount;
    }

    public Boolean getBansubmittopic() {
        return bansubmittopic;
    }

    public void setBansubmittopic(Boolean bansubmittopic) {
        this.bansubmittopic = bansubmittopic;
    }

    public Boolean getBansubmitreply() {
        return bansubmitreply;
    }

    public void setBansubmitreply(Boolean bansubmitreply) {
        this.bansubmitreply = bansubmitreply;
    }

    public Boolean getBanmessage() {
        return banmessage;
    }

    public void setBanmessage(Boolean banmessage) {
        this.banmessage = banmessage;
    }

    public Boolean getDeletetopic() {
        return deletetopic;
    }

    public void setDeletetopic(Boolean deletetopic) {
        this.deletetopic = deletetopic;
    }

    public Boolean getDeletereply() {
        return deletereply;
    }

    public void setDeletereply(Boolean deletereply) {
        this.deletereply = deletereply;
    }

    public Boolean getLocktopic() {
        return locktopic;
    }

    public void setLocktopic(Boolean locktopic) {
        this.locktopic = locktopic;
    }
}