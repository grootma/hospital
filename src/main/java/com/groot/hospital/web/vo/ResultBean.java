package com.groot.hospital.web.vo;

import java.io.Serializable;

/**
 * 返回信息
 *
 * @author groot
 * @version 2017-11-29 10:37:59
 */
public class ResultBean<E extends ErrorCode, T> implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 执行结果
     */
    private boolean success;
    /**
     * 错误编码
     */
    private E errorCode;
    /**
     * 错误信息
     */
    private String errorMsg;
    /**
     * 返回数据
     */
    private T data;

    public ResultBean() {
        this(true, null, null, null);
    }

    public ResultBean(T data) {
        this(true, data);
    }

    public ResultBean(boolean success, T data) {
        this(success, null, null, data);
    }

    public ResultBean(E errorCode) {
        this(errorCode, null);
    }

    public ResultBean(E errorCode, String errorMsg) {
        this(errorCode, errorMsg, null);
    }

    public ResultBean(E errorCode, String errorMsg, T data) {
        this(false, errorCode, errorMsg, data);
    }

    public ResultBean(boolean success, E errorCode, String errorMsg, T data) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
        this.success = success;
    }

    /**
     * 重新初始化bean的所有属性
     */
    public void initSuccess(T data) {
        init(true, null, null, data);
    }

    /**
     * 重新初始化bean的所有属性
     */
    public void initError(E errorCode) {
        init(false, errorCode, null, null);
    }

    /**
     * 重新初始化bean的所有属性
     */
    public void initError(E errorCode, String errorMsg) {
        init(false, errorCode, errorMsg, null);
    }

    /**
     * 重新初始化bean的所有属性
     */
    public void initError(String errorMsg) {
        init(false, null, errorMsg, null);
    }

    /**
     * 重新初始化bean的所有属性
     */
    public void initError(E errorCode, String errorMsg, T data) {
        init(false, errorCode, errorMsg, data);
    }

    /**
     * 重新初始化bean的所有属性
     */
    public void init(boolean success, E errorCode, String errorMsg, T data) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public E getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(E errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "success=" + success +
                ", errorCode=" + errorCode +
                ", errorMsg='" + errorMsg + '\'' +
                ", data=" + data +
                '}';
    }
}
