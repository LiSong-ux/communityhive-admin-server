package net.industryhive.bean.wrap;

import net.industryhive.bean.Notice;

import java.util.Date;

/**
 * @author 未央
 * @create 2020-01-19 16:12
 */
public class WrapNotice extends Notice {

    private String username;

    private String lastEdit;

    private Date lastSubmit;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastEdit() {
        return lastEdit;
    }

    public void setLastEdit(String lastEdit) {
        this.lastEdit = lastEdit;
    }

    public Date getLastSubmit() {
        return lastSubmit;
    }

    public void setLastSubmit(Date lastSubmit) {
        this.lastSubmit = lastSubmit;
    }
}
