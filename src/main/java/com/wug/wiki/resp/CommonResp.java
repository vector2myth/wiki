package com.wug.wiki.resp;

public class CommonResp<T> {
    /*
    * 业务上的成功与失败
    * */
    private boolean success =true;

    /*
    * 返回信息
    * */
    private String message;

    /*
    * 返回泛型数据，自定义类型
    * */
    private T content;

    @Override
    public String toString() {
        return "CommonResp{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", content=" + content +
                '}';
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
