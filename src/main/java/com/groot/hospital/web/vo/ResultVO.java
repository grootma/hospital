package com.groot.hospital.web.vo;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;


/**
 * 前台统一返回vo
 * 
 * @author chimh
 * @version 2017-11-29 10:24:49
 */
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;
    private String msg;
    private T data;
    protected String trace;

    public ResultVO() {
        super();
    }

    public ResultVO(BizResult<T> bizResult) {
        super();
        this.code = bizResult.getErrorCode().getCode();
        this.msg = bizResult.getErrorMsg();
        this.data = bizResult.getData();
    }

    public ResultVO(ErrorCode errorCode) {
        super();
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
    }

    public ResultVO(ErrorCode errorCode, String msg) {
        super();
        this.code = errorCode.getCode();
        this.msg = msg;
    }

    public ResultVO(T data) {
        super();
        this.data = data;
        if (StringUtils.isBlank(code)) {
            this.code = ErrorType.BIZ_SUCCESS.getCode();
        }
        if (StringUtils.isBlank(msg)) {
            this.msg = ErrorType.BIZ_SUCCESS.getMsg();
        }
    }

    public ResultVO<T> setData(T data) {
        this.data = data;
        if (StringUtils.isBlank(code)) {
            this.code = ErrorType.BIZ_SUCCESS.getCode();
        }
        if (StringUtils.isBlank(msg)) {
            this.msg = ErrorType.BIZ_SUCCESS.getMsg();
        }
        return this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

}
