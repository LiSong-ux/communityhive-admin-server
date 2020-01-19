package net.industryhive.bean;

public class Authority {
    private Integer id;

    private Boolean banAccount;

    private Boolean banSubmitTopic;

    private Boolean banSubmitReply;

    private Boolean banMessage;

    private Boolean deleteTopic;

    private Boolean deleteReply;

    private Boolean lockTopic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getBanAccount() {
        return banAccount;
    }

    public void setBanAccount(Boolean banAccount) {
        this.banAccount = banAccount;
    }

    public Boolean getBanSubmitTopic() {
        return banSubmitTopic;
    }

    public void setBanSubmitTopic(Boolean banSubmitTopic) {
        this.banSubmitTopic = banSubmitTopic;
    }

    public Boolean getBanSubmitReply() {
        return banSubmitReply;
    }

    public void setBanSubmitReply(Boolean banSubmitReply) {
        this.banSubmitReply = banSubmitReply;
    }

    public Boolean getBanMessage() {
        return banMessage;
    }

    public void setBanMessage(Boolean banMessage) {
        this.banMessage = banMessage;
    }

    public Boolean getDeleteTopic() {
        return deleteTopic;
    }

    public void setDeleteTopic(Boolean deleteTopic) {
        this.deleteTopic = deleteTopic;
    }

    public Boolean getDeleteReply() {
        return deleteReply;
    }

    public void setDeleteReply(Boolean deleteReply) {
        this.deleteReply = deleteReply;
    }

    public Boolean getLockTopic() {
        return lockTopic;
    }

    public void setLockTopic(Boolean lockTopic) {
        this.lockTopic = lockTopic;
    }
}