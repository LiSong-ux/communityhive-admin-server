package net.industryhive.entity;

/**
 * 蜂巢社区自定义响应结构
 *
 * @author 未央
 * @create 2019-10-30 19:25
 */
public class UnifiedResult {

    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    // 构造函数
    public UnifiedResult() {

    }

    public UnifiedResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public UnifiedResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static UnifiedResult ok() {
        return new UnifiedResult(null);
    }

    public static UnifiedResult ok(Object data) {
        return new UnifiedResult(data);
    }

    public static UnifiedResult build(Integer status, String msg, Object data) {
        return new UnifiedResult(status, msg, data);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
