package org.itstack.middleware.control.domain;

/**
 * 博  客：http://bugstack.cn
 * 公众号：bugstack虫洞栈 | 沉淀、分享、成长，让自己和他人都能有所收获！
 * create by 付政委 on @2019
 */
public class EasyResult {

    private Integer code;
    private String msg;
    private Integer count;
    private Object data;

    public static EasyResult buildEasyResultError(String message) {
        return new EasyResult(1, message);
    }

    public static EasyResult buildEasyResultError(Exception e) {
        return new EasyResult(1, e.getMessage());
    }

    public static EasyResult buildEasyResultSuccess(Object data) {
        return new EasyResult(0, "", 1, data);
    }

    public static EasyResult buildEasyResultSuccess(Integer count, Object data) {
        return new EasyResult(0, "", count, data);
    }

    public static EasyResult buildEasyResultSuccess() {
        return new EasyResult(0, "");
    }

    public EasyResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public EasyResult(Integer code, String msg, Integer count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
